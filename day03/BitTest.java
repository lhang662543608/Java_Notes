/*
运算符之五：位运算符(了解)
结论：
1.位运算符操作的都是整型的数据
2.<< : 在一定范围内，每向左移1位，相当于 * 2
  >> : 在一定范围内，每向右移1位，相当于 / 2


 面试题：最高效的方式计算 2*8？ 2<<3 或 8<1
*/
class BitTest 
{
	public static void main(String[] args) 
	{
		int i =21;
		System.out.println("i << 2 :" + (i<<2));
		System.out.println("i << 3 :" + (i<<3));
		System.out.println("i << 26 :" + (i<<26));
		System.out.println("i << 27 :" + (i<<27));
		
		int m = 12;
		int n =5;
		int a =6;
		System.out.println("m & n :" + (m & n));
		System.out.println("m | n :" + (m | n));
		System.out.println("m ^ n :" + (m ^ n));
		System.out.println("~a :" + (~a));


		//练习：交换两个变量的值。
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 ="+num1+" num2="+num2);

		//方式一：定义临时变量的方式。
		//推荐的方式
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		//方式二：好处：不用定义临时变量
		//弊端：1.相加操作可能超出存储范围  2.有局限性，只能适用于数值类型
		//num1 = num1 + num2;// num1 = 30  num2 = 20
		//num2 = num1 - num2;//num1 = 30   num2 =10
		//num1 = num1 - num2;//num1 = 20   num2 =10 
		
		
		//使用位运算符
		//num1 = num1^num2;
		//num2 = num1^num2;
		//num1 = num1^num2;
		System.out.println("num1 ="+num1+" num2="+num2);

		
	}
}
