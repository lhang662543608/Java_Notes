/*
100000���ڵ����е����������
������������ֻ�ܱ�1����������������Ȼ����

��PrimeNumberTest.java�ļ�������������Ż�
*/
class PrimeNumberTest1 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		boolean isFlag = true;//��ʾi�Ƿ񱻳�����һ�������޸���ֵ��
		int count = 0;//��¼����100000���ڵĸ���
		//��ȡ��ǰ��ʱ���
		long start = System.currentTimeMillis();
		for (int i =2; i <= 100000 ; i++)//����100000���ڵ���Ȼ��
		{
			//�Ż���:�Ա�������������Ȼ��������
			for (int j =2; j <= Math.sqrt(i); j++)//j:��iȥ��
			{
				if(i % j == 0)//i��j����
				{
					isFlag = false;
					break;//�Ż�һ��ֻ�Ա����Ƿ���������Ȼ������Ч�ġ�
				}
			}
			if (isFlag == true)
			{
				//System.out.println(i);
				count++;
			}
			isFlag = true;//����isFlagdeֵ
 		}

		//��ȡ��ǰ��ʱ���
		long end = System.currentTimeMillis();
		System.out.println("100000���������ĸ���Ϊ��" + count);
		System.out.println("�����ѵ�ʱ��Ϊ��" + (end - start));
		/*
				17110
		�Ż�һ��1546
		�Ż�����13
		*/
	}
}