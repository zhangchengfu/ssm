package com.laozhang.corejava.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldReflect {
	public static void main(String[] args) {
		// 获取Point类型的Class对象
		Class c = Point.class;

		// 获取所有的公共字段
		Field[] pubFields = c.getFields();

		if (pubFields != null && pubFields.length > 0) {
			System.out.println("获取公共字段如下:");
			for (int i = 0; i < pubFields.length; i++) {
				Field pField = pubFields[i];
				System.out.println(pField.toString());
			}
		} else {
			System.out.println("没有公共属性!");
			Field[] allFields = c.getDeclaredFields();
			System.out.println("获取私有字段如下:");
			for (int i = 0; i < allFields.length; i++) {
				Field allField = allFields[i];
				// System.out.println(allField.toString());
				System.out.println(Modifier.toString(allField.getModifiers())
						+" "+ allField.getType() +" "+ allField.getName());
			}
		}
	}
}
