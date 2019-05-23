/*
运算符之二：赋值运算符
=  +=  -=  *=  /=  %=




*/
class SetValueTest 
{
	public static void main(String[] args) 
	{
		//赋值符号： =
		int i1 = 10;
		int j1 =10;

		int i2,j2;
		//连续赋值
		i2 = j2 = 10;

		int i3 = 10,j3 = 20;
		

		//*******************************
		int num1 = 10;
		num1 += 2;//num1 = num1 + 2
		System.out.println(num1);//12

		int num2 = 12;
		num2 %= 5;//num2 = num2 % 5;
		System.out.println(num2);//2

		short s1 = 10;
		//s1 = S1 + 2;//编译失败
		s1 += 2;//结论：不会改变变量的数据类型
		System.out.println(s1);//12

		byte b1 = 127;
		//b1 = b1 + 2;//编译失败
		b1 += 1;//结论：不会改变变量的数据类型
		System.out.println(b1);//-128

		//开发中，如果希望实现+2的操作，有几种方法？（前提： int num = 10;）
		//方式一：num = num + 2;
		//方式二：num += 2;(推荐)

		//开发中，如果希望实现+1的操作，有几种方法？（前提： int num = 10;）
		//方式一：num = num + 1;
		//方式二：num += 1;
		//方式三：num++;(推荐)
		
		//练习1
		int i =2;
		i *= 0.1;
		System.out.println(i);//0
		i++;
		System.out.println(i);//1

		//练习2
		int n = 10;
		n += (n++) + (++n);// n = 10 + 10 + 12 ;
		System.out.println(n);//32
	}
}
