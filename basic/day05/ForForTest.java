/*
Ƕ��ѭ����ʹ��
1.Ƕ��ѭ������һ��ѭ���ṹA��������һ��ѭ���ṹB��ѭ�����У��͹�����Ƕ��ѭ����

2.
���ѭ����ѭ���ṹA
�ڲ�ѭ����ѭ���ṹB

3.˵��
���ڲ�ѭ���ṹ����һ�飬ֻ�൱�����ѭ����ִ����һ�Ρ�
�ڼ������ѭ����Ҫִ��m�Σ��ڲ�ѭ����Ҫִ��n�Σ���ʱ�ڲ�ѭ����ѭ����һ��ִ��m*n�Ρ�

*/
class ForForTest 
{
	public static void main(String[] args) 
	{
		//******
		//System.out.println("******");
		for (int i = 1;i <= 6 ; i++)
		{
			System.out.print('*');
		}
		System.out.println("\n");
		/*
			******
			******
			******
			******
			******
			******
		*/
		for (int i = 1;i <= 4 ; i++)
		{
			for (int j = 1;j <= 6 ; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("\n");
		/*
		*
		**
		***
		****
		*****
		*/
		for (int i = 1;i <= 5 ; i++)//��������
		{
			for (int j = 1;j <= i ; j++)//��������
			{
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("\n");

		/*
		****
		***
		**
		*
		*/
		for (int i = 1;i <= 4 ; i++)//��������
		{
			for (int j = 1;j <= 5-i ; j++)//��������
			{
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("\n");

	}
}
