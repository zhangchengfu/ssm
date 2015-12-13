package com.laozhang.controller;

import java.io.File;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.multi.MultiFileChooserUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 上传下载
 * @author Lenovo
 *
 */
@Controller
@RequestMapping("/file")
public class IOStream {
	
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
	public String uploadFile(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String ret = "";
		//创建一个通用的多部分解析器
		CommonsMultipartResolver multiResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		//判断 request 是否有文件上传
		if (multiResolver.isMultipart(request)) {
			//转换成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
			//取得request中的所有文件名
			Iterator<String> iter = multiRequest.getFileNames();
			while(iter.hasNext()) {
				MultipartFile file = multiRequest.getFile(iter.next());
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
					String uploadName =  "";
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
					ret += targetFile.getPath();
				}
			}
		}
		return ret;
	}
}
