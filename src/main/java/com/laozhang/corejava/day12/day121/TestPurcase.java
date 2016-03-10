
package com.laozhang.corejava.day12.day121;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @描述：
 * @日期:May 13, 2013 7:22:00 PM
 * @作者：刘奎
 */
public class TestPurcase {
	public static void main(String[] args) {
		List<Purcase> list = new LinkedList<Purcase>();//建一个列表,用来存放Purcase中的对象
        Purcase p1 = new Purcase("宝洁","洗手粉",18.5); //声明Purcase对象
        Purcase p2 = new Purcase("联合利华","肥皂",4.5);
        Purcase p3 = new Purcase("宝洁","牙膏",32.5);
        Purcase p4 = new Purcase("宝洁","毛巾",14.5);
        Purcase p5 = new Purcase("洁利","洗面奶",26.0);
        Purcase p6 = new Purcase("好迪","洗发水",27.5);
        Purcase p7 = new Purcase("多芬","沐浴露",38.5);
        Purcase p8 = new Purcase("宝洁","洗洁精",3.4);
        list.add(p1);                               //在列表中添加Purcase对象
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        
        //要求:写一个程序,打印出各品牌所花费的总费用.
        printBrandCost(list); 					//调用printBrandCost打印方法
	}

	private static void printBrandCost(List<Purcase> list/*将列表传入*/) {
		//列表中含有品牌,产品名,价格(因为只有品牌有相同的,因为map中通过kay来)
		//使用map来转换, key是品牌， value又是 List
		Map<String,List<Purcase>> map = 
				new HashMap<String,List<Purcase>>();
		List<Purcase2> ptList = new ArrayList<Purcase2>();
		Iterator<Purcase> iter = list.iterator();      //创建
		while(iter.hasNext()){
			Purcase p = iter.next();
			//判断此购买记录中的品牌是否已经添加到map中了
			if(map.containsKey(p.getBrand())){
				//说明此品牌已经添加过了
				List<Purcase> pList = map.get(p.getBrand());
				//直接把此购买记录添加到 pList中
				pList.add(p);
			} else {
				//说明此记录的品牌没有添加到map中，那就put到map中
				List<Purcase> pList = new ArrayList<Purcase>();
				pList.add(p);
				map.put(p.getBrand(), pList);
			}
		}
		
		//遍历map，求出各品牌所花费的总费用
		/*********
		 * 
			map
			key		value
			宝洁		List(p1, p3, p4, p8)
			联合利华	List(p2)
			洁利		List(p5)
			好迪		List(p6)
			多芬		List(p7)
		 */
		System.out.printf("%-8s -> %-8s\n","品牌","费用");
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String brand = it.next();
			List<Purcase> pList = map.get(brand);
			//遍历plist，求出总费用
			double totalCost = 0.0;
			for(Object o : pList){
				Purcase p = (Purcase)o;
				totalCost += p.getCost();
			}
			//输出
			Purcase2 pt = new Purcase2(brand,totalCost);
			ptList.add(pt);
		}
		//如果要排序
		Collections.sort(ptList,new Comparator<Purcase2>(){
			public int compare(Purcase2 o1, Purcase2 o2) {
				if(o1.getTatalcost() > o2.getTatalcost()){
					
					return -1;
				}else if(o1.getTatalcost() < o2.getTatalcost()){
					return 1;
				}else{
					return 0;
				}
			}
		});
		//再输出
		for(Purcase2 temp : ptList){
			System.out.printf("%-8s -> ￥%-5.2f\n",temp.getBrand(),temp.getTatalcost());
		}
	}
}
