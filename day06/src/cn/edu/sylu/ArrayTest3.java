package cn.edu.sylu;

/*
 * 二维数组的使用：
 * 		规定：二维数组元素分为外层数组的元素，内层数组的元素
 * 		int[][] arr = new int[4][3];
 * 		外层元素：arr[0],arr[1]等
 * 		内层元素：arr[0][0],arr[0][1],arr[2][1]等
 * 		
 * ⑤数组元素的默认初始化值
 * 针对于初始化方式一：比如 int[][] arr =new int[4][3];
 * 		外层元素的初始化值为：地址值；
 * 		内层元素的初始化值为：与一维数组初始化情况一样。
 * 针对于初始化方式二：比如int[][] arr1 = new int[4][];
 * 		外层元素的初始化值为：null
 * 		内层元素的初始化值为：不能调用，否则报错。
 * 
 * ⑥数组的内存解析
 * 
 * 
 * 
 */
public class ArrayTest3 {

	public static void main(String[] args) {

		int[][] arr = new int[4][3];
		System.out.println(arr[0]);// [I@15db9742
		System.out.println(arr[0][0]);// 0
		System.out.println(arr);// [[I@6d06d69c

		System.out.println("*****************");

		float[][] arr1 = new float[4][3];
		System.out.println(arr1[0]);// [F@7852e922
		System.out.println(arr1[0][0]);// 0.0

		System.out.println("*****************");
		String[][] arr2 = new String[4][3];
		System.out.println(arr2[1]);// [Ljava.lang.String;@4e25154f
		System.out.println(arr2[1][1]);// null

		System.out.println("*****************");
		String[][] arr3 = new String[4][];
		System.out.println(arr3[1]);// null
		// System.out.println(arr3[1][1]);//抛出空指针异常
	}

}
