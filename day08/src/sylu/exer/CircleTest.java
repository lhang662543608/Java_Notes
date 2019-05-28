package sylu.exer;
/*
 * 2.利用面向对象的编程方法 ，设计类circle计算圆的面积
 * 
 */
//测试类
public class CircleTest {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.radius = 2.1;
		
		//对应方式一
		/*double area =  c1.findArea();
		System.out.println(area);//0.0
		*/
		
		//对应方式二：
		c1.findArea();
	}
}
class Circle{
	//属性
	double radius ;
	
	//求圆的面积
	
	//方式一：
	/*public double findArea(){
		return Math.PI * radius * radius;
	}*/
	//方式二：
	public void findArea(){
		System.out.println("面积为：" + (Math.PI * radius * radius));
	}
}
