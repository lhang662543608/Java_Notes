/*
运算符之六：三元运算符
1.结构：(条件表达式)?表达式1：表达式2
2，说明：
	条件表达式的结果为boolean类型
	根据条件表达式的真或假，决定执行表达式1或表达式2
		如果表达式为true,则执行表达式1
		如果表达式为false，则执行表达式2
	表达式1 和 表达式2 的要求是一致的。
	三元运算符可以嵌套使用。
3.凡是可以使用三元运算符的地方，都可以改写成if-else。
  反之不成立。、
4.如果程序既可以使用三元运算符有可以使用if-else结构，那么有限选择三元运算符。原因：简洁，执行效率高。
*/class SanYuanTest 
{
	public static void main(String[] args) 
	{
		//获取两个整数的最大值
		int m = 12;
		int n = 5;
		int max = (m>n)?m:n;
		System.out.println(max);


		//***************************
		n = 12;
		String maxStr = (m>n)?"m大":((m==n)?"m和n相等":"n大");
		System.out.println(maxStr);

		//***************************
		//获取三个数的最大值。
		int n1 = 12;
		int n2 = 30;
		int n3 = -43;
		
		int maxNum = (n1 > n2)? n1:n2;
		 maxNum = (maxNum > n3)?maxNum:n3;

		//不建议这样写
		//max = (n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
		
		System.out.println(maxNum);
	}
}
