package com.laozhang.corejava.图形打印;

/**
 * 该类是一个控制台图形打印类。该类中方法的一般使用方式是给定图形的高和宽来生成指定的图形，
 * 但是对于较复杂的图形来说给定的宽和高的值要在合适的范围内才能看到满意的效果，例如complexShape
 * 方法的宽和高的值在大于100时效果比较明显。建议菱形的宽和高相等。
 * @author 达内科技[Tarena Training Group]
 * @since jdk1.0
 */
public class ConsoleShape {	
	private static char borderShape='*'; /*轮廓的形状*/	
	private static char areaShape='%';  /*内部填充的形状*/
			
	
	/**
	 * 打印一个指定高、宽的空心矩形。
	 * @param height 所要绘制空心矩形的高度
	 * @param width 所要绘制空心矩形的宽度
	 */
	public static void rect(int height,int width){
		for(int y=0;y<height;y++){					  		/*y轴坐标循环*/
			for(int x=0;x<width;x++){						/*x轴坐标循环*/
				
				if(x==0||y==0||x==width-1||y==height-1){	/*绘制矩形边界*/				
					System.out.print(borderShape);
				}				
				else{										/*绘制矩形内部或外部*/
					System.out.print(' ');
				}
			}
			System.out.println();							/*换行输出*/
		}
	}
	
	/**
	 * 打印一个指定高、宽的实心矩形。
	 * @param height 所要绘制实心矩形的高度
	 * @param width 所要绘制实心矩形的宽度	
	 */
	public static void solidRect(int height,int width){
		for(int y=0;y<height;y++){					  		/*y轴坐标循环*/
			for(int x=0;x<width;x++){						/*x轴坐标循环*/
				
				if(x>=0&&y>=0&&x<=width-1&&y<=height-1){ 	/*绘制矩形内部和边界*/
					System.out.print(areaShape);
				}
				else{										/*绘制矩形外部*/
					System.out.print(' ');
				}
			}
			System.out.println();							/*换行输出*/
		}
	}
	/**
	 * 打印一个指定高、宽、类型的空心下三角形。
	 * @param height 所要绘制空心三角形的高度
	 * @param width 所要绘制空心三角形的宽度	
	 * @param type 所要绘制三角型的类型，true表示左下三角形，false表示右下三角形
	 */
	public static void lowerTriangle(int height,int width,boolean type){
		for(int y=0;y<height;y++){					  		/*y轴坐标循环*/
			for(int x=0;x<width;x++){						/*x轴坐标循环*/
				
				if(type?(y*width==x*height||x==0||y==height-1) /*绘制左下三角形*/
					   :(y*width==-1*x*height+width*(height-1)||x==width-1||y==height-1)){ 	
															   /*绘制右下三角形*/
					System.out.print(areaShape);
				}
				else{										/*绘制三角形外部*/
					System.out.print(' ');
				}
			}
			System.out.println();							/*换行输出*/
		}
	}
	
	
	/**
	 * 打印一个指定高、宽、类型的实心下三角形。
	 * @param height 所要绘制实心三角形的高度
	 * @param width 所要绘制实心三角形的宽度	
	 * @param type 所要绘制三角型的类型，true表示左下三角形，false表示右下三角形
	 */
	public static void solidLowerTriangle(int height,int width,boolean type){
		for(int y=0;y<height;y++){					  		/*y轴坐标循环*/
			for(int x=0;x<width;x++){						/*x轴坐标循环*/
				
				if(type?(y*width>=x*height&&x>=0&&y<=height-1) /*绘制左下三角形*/
					   :(y*width>=-1*x*height+width*(height-1)&&x<=width-1&&y<=height-1)){ 	
															   /*绘制右下三角形*/
					System.out.print(areaShape);
				}
				else{										/*绘制三角形外部*/
					System.out.print(' ');
				}
			}
			System.out.println();							/*换行输出*/
		}
	}
	
	
	/**
	 * 打印一个指定高、宽、类型的空心上三角形。
	 * @param height 所要绘制空心三角形的高度
	 * @param width 所要绘制空心三角形的宽度	
	 * @param type 所要绘制三角型的类型，true表示右上三角形，false表示左上三角形
	 */
	public static void upperTriangle(int height,int width,boolean type){
		for(int y=0;y<height;y++){					  		/*y轴坐标循环*/
			for(int x=0;x<width;x++){						/*x轴坐标循环*/
				
				if(type?(y*width==x*height||x==width-1||y==0) /*绘制右上三角形*/
					   :(y*width==-1*x*height+width*(height-1)||x==0||y==0)){ 	
															   /*绘制左上三角形*/
					System.out.print(areaShape);
				}
				else{										/*绘制三角形外部*/
					System.out.print(' ');
				}
			}
			System.out.println();							/*换行输出*/
		}
	}
	
	/**
	 * 打印一个指定高、宽、类型的实心上三角形。
	 * @param height 所要绘制空心三角形的高度
	 * @param width 所要绘制空心三角形的宽度	
	 * @param type 所要绘制三角型的类型，true表示右上三角形，false表示左上三角形
	 */
	public static void solidUpperTriangle(int height,int width,boolean type){
		for(int y=0;y<height;y++){					  		/*y轴坐标循环*/
			for(int x=0;x<width;x++){						/*x轴坐标循环*/
				
				if(type?(y*width<=x*height&&x<=width-1&&y>=0) /*绘制右上三角形*/
					   :(y*width<=-1*x*height+width*(height-1)&&x>=0&&y>=0)){ 	
															   /*绘制左上三角形*/
					System.out.print(areaShape);
				}
				else{										/*绘制三角形外部*/
					System.out.print(' ');
				}
			}
			System.out.println();							/*换行输出*/
		}
	}
	
	/**
	 * 打印一个指定高、宽的空心菱形。
	 * @param height 所要绘制空心菱形的高度
	 * @param width 所要绘制空心菱形的宽度	
	 */
	public static void diamond(int height,int width){
		
		for(int y=0;y<height+1;y++){					  		/*y轴坐标循环*/
			for(int x=0;x<width+1;x++){						/*x轴坐标循环*/
				
				if(y*-1*width==(x-width/2)*height||
				   (y-height/2)*width==x*height||
				   (y-height)*width==(x-width/2)*-1*height||
				    y*width==(x-width/2)*height){ 	
															   /*绘制菱形边界*/
					System.out.print(areaShape);
				}
				else{										/*绘制三角形外部*/
					System.out.print(' ');
				}
			}
			System.out.println();							/*换行输出*/
		}
	}
	/**
	 * 打印一个指定高、宽的实心菱形。
	 * @param height 所要绘制实心菱形的高度
	 * @param width 所要绘制实心菱形的宽度	
	 */
    public static void solidDiamond(int height,int width){		
		for(int y=0;y<height+1;y++){					  		/*y轴坐标循环*/
			for(int x=0;x<width+1;x++){						/*x轴坐标循环*/
				
				if(y*-1*width<=(x-width/2)*height&&
				   (y-height/2)*width<=x*height&&
				   (y-height)*width<=(x-width/2)*-1*height&&
				    y*width>=(x-width/2)*height){ 	
															   /*绘制菱形边界*/
					System.out.print(areaShape);
				}
				else{										/*绘制三角形外部*/
					System.out.print(' ');
				}
			}
			System.out.println();							/*换行输出*/
		}
	}
    /**
	 * 打印乘法表。	 
	 */
    public static void multiTable(){
    	for(int y=1;y<=9;y++){					  			/*y轴坐标循环*/
			for(int x=1;x<=y;x++){							/*x轴坐标循环*/				
															   
					System.out.print(x+"x"+y+"="+x*y+"\t");	/*打印乘法表*/							
			}
			System.out.println();							/*换行输出*/
		}
    }
    /**
     * 打印一个复杂图形示例。
	 * @param height 所要绘制实心菱形的高度
	 * @param width 所要绘制实心菱形的宽度	
	 */
    public static void complexShape(int height,int width){
    	for(int y=0;y<height+1;y++){					  		/*y轴坐标循环*/
			for(int x=0;x<width+1;x++){						    /*x轴坐标循环*/
				
				if((-3*y*width<=(2*x-width)*height*2&&
				   3*y<=height*2&&
				   3*y*width>=(2*x-width)*height*2)||(
				   -3*(y-height)*width>=(2*x-width)*height*2&&
				   3*y>=height&&
				   3*(y-height)*width<=(2*x-width)*height*2)){ 	
															   /*绘制菱形边界*/
					System.out.print(areaShape);
				}
				else{										/*绘制三角形外部*/
					System.out.print(' ');
				}
			}
			System.out.println();							/*换行输出*/
		}
    }
   	

}
