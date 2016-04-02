package com.laozhang.xml.持久化xml;

import java.util.List;

/**
 * @描述 把Book的集合转换成XML文档,并且写入到指定文件中
 * @日期 May 22, 2013 2:16:16 PM
 * @作者 JSD1304
 */
public interface IBookWriter {

	public boolean writeBooksToXml(List<Book> books, String file);

}
