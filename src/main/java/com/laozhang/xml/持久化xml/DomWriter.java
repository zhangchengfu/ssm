package com.laozhang.xml.持久化xml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

/**
 * @描述 此类是采用DOM转换,把Document写到本地文件中
 * @日期 May 22, 2013 2:30:06 PM
 * @作者 JSD1304
 */
public class DomWriter {

	public static String toString(Document doc) {
		String str = null;
		// 创建转换工厂
		TransformerFactory factory = TransformerFactory.newInstance();
		try {
			// 通过工厂得到转换器
			Transformer transformer = factory.newTransformer();
			// 准备转换所需要的参数
			Source source = new DOMSource(doc);
			// 构造输出流
			StringWriter writer = new StringWriter();
			Result r = new StreamResult(writer);
			// 调用转换方法来完成转换
			// 在调用之前,设置转换的格式
			// 设置编码
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			// 设置换行
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			// 设置缩进
			transformer.setOutputProperty(
					"{http://xml.apache.org/xslt}indent-amount", "2");
			transformer.transform(source, r);
			str = writer.getBuffer().toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

	/**
	 * 把Document文档对象模型写入到指定文件中
	 */
	public static boolean writeXml(Document doc, String tagetFile) {
		boolean result = false;
		// 创建转换工厂
		TransformerFactory factory = TransformerFactory.newInstance();
		try {
			// 通过工厂得到转换器
			Transformer transformer = factory.newTransformer();
			// 准备转换所需要的参数
			Source source = new DOMSource(doc);
			// 构造输出流
			Writer writer = new BufferedWriter(new FileWriter(tagetFile));
			Result r = new StreamResult(writer);
			// 调用转换方法来完成转换
			// 在调用之前,设置转换的格式
			// 设置编码
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			// 设置换行
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			// 设置缩进
			transformer.setOutputProperty(
					"{http://xml.apache.org/xslt}indent-amount", "2");
			transformer.transform(source, r);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
