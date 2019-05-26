package cn.edu.sylu;

/*
 * 
 * 一、数组的概述。
 * 1.数组的理解：数组（Array）是多个相同类型的数组按一定顺序排列的集合，并使用一个名字命名，
 * 并通过编号的方式，对这些数据进行统一管理
 * 
 * 
 * 2.数组相关的概念
 * >数组名
 * >元素
 * >角标，下标，索引
 * >数组的长度，元素的个数
 * 
 * 3.数组的特点：
 * 		数组是有序排列的
 * 		数组属于引用数据类型的变量。数组的元素既可以是基本数据类型也可以是引用数据类型。
 *		创建数组对象会在内存中开辟一整块连续的空间。
 *		数组的长度一旦确定，就不能修改。
 * 4.数组的分类
 * 		①按照维数：一维数组、二维数组。。。。
 * 		②按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组
 * 
 * 5.一维数组的使用：
 * 		①一维数组的声明和初始化
 * 		②如何调用数组的指定的位置的元素
 * 		③如何获取数组的长度
 * 		④如何遍历数组
 * 		⑤数组元素的默认初始化值：见ArrayTest1.java文件
 * 		⑥数组的内存解析：见ArrayTest1.java文件
 * 
 * 
 */
public class ArrayTest {
	public static void main(String[] args) {
		//①一维数组的声明和初始化
		int[] ids ;//声明
		//1.1静态初始化:数组的初始化和数组元素的初始化同时进行
		ids = new int[]{1001,1002,1003,1004};
		//1.2动态初始化:数组的初始化和数组元素的初始化分开进行
		String[] names = new String[5];
		
		//也是正确的写法
		int[] arr4 = {1,2,3};
		
		//总结：数组一旦初始化完成，其长度就确定了。
		
		//②如何调用数组的指定的位置的元素:通过索引的方式调用。
		//数组的索引从0开始，到数组的长度减1结束。
		names[0]="王明";
		names[1]="刘明";
		names[2]="小明";
		names[3]="大明";
		names[4]="老明";
		
		
		//3.如何获取数组的长度
		//属性：length
		System.out.println(names.length);//5
		System.out.println(ids.length);//4
		
		//4.如何遍历数组
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
}