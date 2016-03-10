package com.laozhang.corejava.day09.UML;

/**三明治实体类 */
public class Sandwich extends Food implements Eatable {
	private Bread bread;
	private Meat meat;
	private Egg egg;
	private Vegetables vegetables;
	
	public Sandwich() {
		bread = new Bread();//组合
		meat = new Meat();
		egg = new Egg();
	}
	
	public Sandwich(Vegetables v){
		this();//调用自己已有的构造方法
		this.vegetables = v;//聚合
	}
	
	public void make(){
		System.out.println("三明治制作中...");
	}
}
