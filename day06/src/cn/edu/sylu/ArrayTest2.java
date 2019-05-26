package cn.edu.sylu;
/*
 * 二维数组的使用：
 * 1.理解：
 * 对于二维数组的理解，我们可以看成是一维数组array1又作为另一个一维数组array2的元素存在。
 * 其实从数组底层的运行机制来看，其实没有多维数组。
 * 
 * 2.二维数组的使用：
 * 		①二维数组的声明和初始化
 * 		②如何调用数组的指定的位置的元素
 * 		③如何获取数组的长度
 * 		④如何遍历数组
 * 		⑤数组元素的默认初始化值:见ArrayTest3.java文件
 * 		⑥数组的内存解析:见ArrayTest3.java文件
 */
public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		//1.二维数组的声明和初始化。
		//静态初始化
		int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};
		//动态初始化1
		String[][] arr1 = new String[3][2];
		//动态初始化2
		String[][] arr2 = new String[3][];
		
		//也是正确的写法
		int arr3[][] = new int[][]{{1,2,3},{4,5,9,10},{6,7,8}};
		int[] arr4[] = {{1,2,3},{4,5},{6,7,8}};
		int arr5[][] = {{1,2,3},{4,5},{6,7,8}};
		
		//2.如何调用数组的指定的位置的元素
		System.out.println(arr[0][1]);//2
		System.out.println(arr1[1][1]);//null
		
		//System.out.println(arr2[0][0]);//抛出空指针的异常
		 
		arr2[0] = new String[3];
		System.out.println(arr2[0][0]);//null
		
		//3.获取数组的长度
		System.out.println(arr3.length);//3
		System.out.println(arr3[0].length);//3
		System.out.println(arr3[1].length);//4
		
		//4.如何遍历二位数组
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
	}

}