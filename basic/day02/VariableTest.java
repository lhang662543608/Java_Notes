/*
变量的使用：
1·java定义变量的格式：数据类型 变量名 = 变量值;

2.说明：
	变量必须先声明再使用
	变量都定义在作用域内。在作用域内它是有效的，换句话说，出了作用域就失效了。
	在同一个作用域内，不能声明两个同名的变量。
*/




class VariableTest 
{
	public static void main(String[] args) 
	{
		//变量的定义
		int myAge = 12;
		//变量的使用
		System.out.println(myAge);
		
		//编译错误：使用myNumber之前并未定义过myNumber
		//System.out.println(myNumber);

		//变量的声明
		int myNumber;

		//编译错误:使用myNumber之前并未赋值myNumber
		//System.out.println(myNumber);

		//变量的赋值
		myNumber = 100;
		
		//编译错误:找不到符号
		//System.out.println(myClass);
		
		//不可以在同一作用域内定义同名的变量
		//int myAge = 22;
	}

	public void method(){
		int myClass = 1;
	}
}
