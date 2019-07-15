/*
100以内的所有的质数的输出
质数：素数，只能被1和它本身整除的自然数。


*/
class PrimeNumberTest 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		boolean isFlag = true;//表示i是否被除尽，一旦除尽修改其值。

		for (int i =2; i <= 100 ; i++)//遍历100以内的自然数
		{
			for (int j =2; j < i; j++)//j:被i去除
			{
				if(i % j == 0)//i被j除尽
				{
					isFlag = false;
				}
			}
			if (isFlag == true)
			{
				System.out.println(i);
			}
			isFlag = true;//重置isFlagde值
 		}
	}
}
