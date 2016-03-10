package com.laozhang.corejava.day08.接口;

/**交通工具的顶级抽象父类 */
public abstract class Vehicle implements Movable {
	//由于此类是抽象类,所以不一定要实现接口中的方法
	
	//提供自己的方法
	public String getDirectionDesc(int direction){
		String msg = "";
		switch (direction) {
		case WEST:
			msg = "西";
			break;
		case EAST:
			msg = "东";
			break;
		case NORTH:
			msg = "北";
			break;
		case SOUTH:
			msg = "南";
			break;
		default:
			System.out.println("参数不合法!");;
		}
		return msg;
	}
}
