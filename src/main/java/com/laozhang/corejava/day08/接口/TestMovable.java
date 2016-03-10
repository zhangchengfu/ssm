package com.laozhang.corejava.day08.接口;

//静态导入
//import static com.corejava.day08.接口.MovableFactory.*;

/** 测试类 */
public class TestMovable {
	public static void main(String[] args) {
		/*
		 * Movable car = new Car(); Movable plane = new Plane();
		 * car.move(Movable.SOUTH); plane.move(Movable.EAST);
		 */
		
		Movable car = MovableFactory.createMovable(IContant.CAR);
		Movable plane = MovableFactory.createMovable(IContant.PLANE);
		
		Movable[] vs = new Movable[2];
		vs[0] = car;
		vs[1] = plane;
		//迭代
		for(Movable m : vs){
			//标记接口的作用:
			if(m instanceof CheekSpeed){
				//说明要进行测速
				if(m.getSpeed() > 300){
					System.out.println("您超速了!");
				}else{
					m.move(Movable.WEST);
				}
			}else{
				m.move(Movable.WEST);
			}
		}
	}
}
