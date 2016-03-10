package com.laozhang.corejava.day05;

/**
 * 实体类(entity)
 */
public class Women {
	//属性
	private String name;
	private int height;
	private double weight;
	private boolean stature;
	
	//方法
	//构造方法:没有返回类型,并且方法名与类名一致
	//可以使空参数的,也可以是有参数的
	//构造方法的作用:给属性赋值
	
	//空参构造:
	//1.如果实体类没有空参构造,也没有有参数构造,则系统会自动
	//创建空参构造.
	//2.如果既有空参,又有有参构造,则可以任意使用两者之一创建
	//对象
	//3.如果只写有参数构造,则系统就不会创建空参构造了
	public Women() {
		
	}
	
	//this表示当前对象的
	public Women(String name, int height, double weight, boolean stature) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.stature = stature;
	}
	
	//对应属性的存取方法
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isStature() {
		return stature;
	}

	public void setStature(boolean stature) {
		this.stature = stature;
	}
}
