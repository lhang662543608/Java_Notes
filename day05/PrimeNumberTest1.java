/*
100000以内的所有的质数的输出
质数：素数，只能被1和它本身整除的自然数。

对PrimeNumberTest.java文件中质数问题的优化
*/
class PrimeNumberTest1 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		boolean isFlag = true;//表示i是否被除尽，一旦除尽修改其值。
		int count = 0;//记录质数100000以内的个数
		//获取当前的时间戳
		long start = System.currentTimeMillis();
		for (int i =2; i <= 100000 ; i++)//遍历100000以内的自然数
		{
			//优化二:对本身是质数的自然数起到作用
			for (int j =2; j <= Math.sqrt(i); j++)//j:被i去除
			{
				if(i % j == 0)//i被j除尽
				{
					isFlag = false;
					break;//优化一：只对本身是非质数的自然数是有效的。
				}
			}
			if (isFlag == true)
			{
				//System.out.println(i);
				count++;
			}
			isFlag = true;//重置isFlagde值
 		}

		//获取当前的时间戳
		long end = System.currentTimeMillis();
		System.out.println("100000以内质数的个数为：" + count);
		System.out.println("所花费的时间为：" + (end - start));
		/*
				17110
		优化一：1546
		优化二：13
		*/
	}
}
