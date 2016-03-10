package com.laozhang.corejava.day14.IO案例;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.laozhang.corejava.文件工具类.IOUtils;


public class 对象输出流演示 {
	public static void main(String[] args) throws Exception {
		String file = "obj.dat";
		// ObjectOutputStream 也流的扩展, 依赖基本Byte输出流
		ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream(
				file));
		Foo foo = new Foo();
		dos.writeObject(foo);// 序列化对象到流中
		dos.close();
		IOUtils.print(file);// 文件中内容是序列化的结果
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
		Foo obj = (Foo) in.readObject();// 从流中反序列化对象
		System.out.println(obj.a);// 2
		in.close();
	}
}

/**
 * 被序列化的类必须实现 Serializable 接口, 实现了接口 Java 会自动提供序列化的功能支持方法, Java API 几乎都实现了
 * 序列化接口, Java建议所有类都实现序列化接口(Java Bean规范)
 */
class Foo implements Serializable {
	int a = 2;
}