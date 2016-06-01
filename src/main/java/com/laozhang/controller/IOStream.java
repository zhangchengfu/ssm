package com.laozhang.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.laozhang.domain.User;
import com.laozhang.service.IUserService;
import com.laozhang.util.IOStreamUtils;

/**
 * 上传下载
 * @author Lenovo
 *
 */
@Controller
@RequestMapping("/file")
public class IOStream {
	
	@Autowired
	private IUserService service;
	
	private static String uploadName =  "";
	
	@RequestMapping(value = "toUploadFileJsp", method = RequestMethod.GET)
	public ModelAndView toUploadFileJsp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/uploadFile");
		return modelAndView;
	}
	
	/**
	 * 文件上传
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFile(MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String ret = "";
		//创建一个通用的多部分解析器
		CommonsMultipartResolver multiResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		//判断 request 是否有文件上传
		if (multiResolver.isMultipart(request)) {
			//转换成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
			//取得request中的所有文件名
			//Iterator<String> iter = multiRequest.getFileNames();
			//while(iter.hasNext()) {
			//for (MultipartFile file : files) {
				//MultipartFile file = multiRequest.getFile(iter.next());
				if (null != file) {
					Long size = file.getSize();
					//文件太大不能上传
					if (size > 5120000) {
						throw new Exception("上传文件太大");
					}
					//获取文件后缀名
					String fileName = file.getOriginalFilename();
					String[] str = fileName.split("\\.");
					String suffixName = "." + str[str.length - 1];
					
					//重新命名文件名
					synchronized (uploadName) {
						uploadName = String.valueOf((new Date()).getTime());
					}
					//设置文件上传路径
					String filePath = "d:/uploadfile";
					//文件夹不存在创建文件夹
					File fileFolderFile = new File(filePath);
					if (!fileFolderFile.exists()) {
						fileFolderFile.mkdirs();
					}
					File targetFile = new File(filePath, uploadName + suffixName);
					//上传文件
					file.transferTo(targetFile);
					File f = new File(filePath, "_" + uploadName + suffixName);
					IOStreamUtils.uploadFile(targetFile, f, true);
					ret += targetFile.getPath();
				}
			//}
		}
		return ret;
	}
	
	/**
	 * excel下载
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "getExcel", method = RequestMethod.GET)
	public void getExcel(HttpServletResponse response) throws IOException {
		//创建Excel
		//XSSFWorkbook book = new XSSFWorkbook();
		HSSFWorkbook book = new HSSFWorkbook();
		//添加sheet
		//XSSFSheet sheet = book.createSheet();
		HSSFSheet sheet = book.createSheet();
		//首行
		//XSSFRow firstRow = sheet.createRow(0);
		HSSFRow firstRow = sheet.createRow(0);
		//XSSFCell firstRow_cell = firstRow.createCell(0);
		HSSFCell firstRow_cell = firstRow.createCell(0);
		firstRow_cell.setCellValue("用户列表");
		//设置表头
		//XSSFRow headerRow = sheet.createRow(1);
		HSSFRow headerRow = sheet.createRow(1);
		headerRow.createCell(0).setCellValue("编号");
		headerRow.createCell(1).setCellValue("用户名");
		headerRow.createCell(2).setCellValue("密码");
		headerRow.createCell(3).setCellValue("年龄");
		//写入数据
		List<User> users = service.getAll();
		if (null != users && users.size() > 0) {
			for (int i = 0; i < users.size(); i++) {
				User user = users.get(i);
				//XSSFRow row = sheet.createRow(i + 2);
				HSSFRow row = sheet.createRow(i + 2);
				row.createCell(0).setCellValue(user.getId().toString());
				row.createCell(1).setCellValue(user.getUserName());
				row.createCell(2).setCellValue(user.getPassword());
				row.createCell(3).setCellValue(user.getAge().toString());
			}
		}
		response.setContentType("application/octet-stream;charset=UTF-8");
		response.setHeader("Content-disposition", "attachment;filename=" + "users.xlsx");
		ServletOutputStream out = response.getOutputStream();
		book.write(out);
		out.close();
		book.close();
	}
}
