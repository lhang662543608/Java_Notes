/*
�žų˷�����
1 * 1 = 1
1 * 2 = 2  2 * 2 = 4
1 * 3 = 2  2 * 3 = 6  3 * 3 = 9
��������
1 * 9 = 9  2 * 9 = 18  3 * 9 = 27  ������ 9 * 9 = 81
*/
class NineNineTable 
{
	public static void main(String[] args) 
	{
		for (int i =1 ; i <=9 ; i++ )
		{
			for (int j=1; j<=i ; j++)
			{
				System.out.print(j + " * " + i + " = " + i*j + "\t");
			}
			System.out.println();
		}
	}
}
