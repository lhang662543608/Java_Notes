/*
do-while 循环的使用

一、循环结构的4个要素
	①初始化条件
	②循环条件 -->是boolean类型
	③循环体
	④迭代条件

二、do-while循环的结构
	①
	do{
		③
		④
	}while(②);
执行过程： ① -  ③ - ④ - ② - ③ - ④ - ② - ③ - ④ - ②  ...
说明：
1.do-while循环至少执行一次循环体。
2.开发中，使用for和while更多一点。较少使用do-while。
*/
class DoWhileTest 
{
	public static void main(String[] args) 
	{
		
		//遍历100以内的偶数,并计算所有偶数的和及偶数的和。
		int num =1 ;
		int sum = 0;//记录总和
		int count = 0;//记录个数
		do
		{
			if (num % 2 == 0)
			{
				System.out.println(num);
				sum += num;
				count++;
			}
			num++;
		}
		while (num <=100);
		System.out.println("总和为：" + sum);
		System.out.println("个数为：" + count);


		//**************对比**********************
		int num1 = 10;
		while (num1 > 10)
		{
			System.out.println("hello:while");
			num1--;
		}

		int num2 = 10;
		do
		{
			System.out.println("hello:do-while");
			num2--;
		}
		while (num2 > 10);
	}
}
