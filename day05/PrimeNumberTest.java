/*
100���ڵ����е����������
������������ֻ�ܱ�1����������������Ȼ����


*/
class PrimeNumberTest 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		boolean isFlag = true;//��ʾi�Ƿ񱻳�����һ�������޸���ֵ��

		for (int i =2; i <= 100 ; i++)//����100���ڵ���Ȼ��
		{
			for (int j =2; j < i; j++)//j:��iȥ��
			{
				if(i % j == 0)//i��j����
				{
					isFlag = false;
				}
			}
			if (isFlag == true)
			{
				System.out.println(i);
			}
			isFlag = true;//����isFlagdeֵ
 		}
	}
}