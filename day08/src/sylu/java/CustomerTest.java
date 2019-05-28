package sylu.java;
/*
 * 类中方法的声明和使用
 * 方法：描述类应该具有的功能。
 * 比如：Math类：sqrt()\random()\....
 * 		Scanner类：nextXxx()....
 * 		Array类：sort()\binarySearch()\....
 * 
 * 1.举例：
 * 	public void eat(){}
 * 	public void sleep(int hour){}
 * 	public String getName() {}
 * 	public String getNation(String nation) {}
 * 2.方法的声明： 权限修饰符 返回值类型 方法名(形参列表){
 * 					方法体
 * 				}
 * 	注意：static、final、abstract修饰的不同点
 * 3.说明：
 * 		3.1关于权限修饰符：默认方法的权限修饰符先都使用public
 * 			java规定的权限修饰符：private、public、protected、缺省 -->封装性
 * 		3.2返回值类型：有返回值 vs 没有返回值
 * 			3.2.1
 * 				 如果方法有返回值，则必须在方法声明是指定返回值的类型。同时，方法中，需要使用
 * 					return关键字来返回指定类型的数据。“return 数据”
 * 				如果方法没有返回值，则方法声明是用void来表示。通常，没有返回值的方法中，就不需要
 * 					使用return，但是如果使用的话，只能“return;”表示结束此方法。
 * 		3.3方法名：标识符，需要遵循标识符的规则和规范，“见名知意”。
 * 		3.4形参列表：方法可以声明零个、一个或多个形参列表。
 * 			3.4.1  	格式：数据类型1 形参1,数据类型2 形参2,.....
 * 			
 * 			
 * 		3.5方法体：方法功能的体现。
 * 4.return关键字的使用：
 * 		1.使用范围：方法体中。
 * 		2.作用：
 * 			①结束方法
 * 			②针对有返回值类型的方法，使用“return 数据”方法，返回所要的数据。
 * 		3.注意点：return关键字后面不可以声明执行语句。
 * 5.方法的使用：
 * 		可以调用当前类的属性、当前类的方法。
 * 		方法中不可以定义方法。
 * 			
 * 
 */
public class CustomerTest {

}
//客户类
class Customer{
	//属性
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat(){
		System.out.println("客户吃饭");
	}
	public void sleep(int hour){
		System.out.println("休息了"+ hour + "小时");
	}
	public String getName() {
		return name;
	}
	public String getNation(String nation) {
		String info = "我的国籍是：" + nation ;
		return info;
	}
	
}
