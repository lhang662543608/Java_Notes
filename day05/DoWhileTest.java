/*
do-while ѭ����ʹ��

һ��ѭ���ṹ��4��Ҫ��
	�ٳ�ʼ������
	��ѭ������ -->��boolean����
	��ѭ����
	�ܵ�������

����do-whileѭ���Ľṹ
	��
	do{
		��
		��
	}while(��);
ִ�й��̣� �� -  �� - �� - �� - �� - �� - �� - �� - �� - ��  ...
˵����
1.do-whileѭ������ִ��һ��ѭ���塣
2.�����У�ʹ��for��while����һ�㡣����ʹ��do-while��
*/
class DoWhileTest 
{
	public static void main(String[] args) 
	{
		
		//����100���ڵ�ż��,����������ż���ĺͼ�ż���ĺ͡�
		int num =1 ;
		int sum = 0;//��¼�ܺ�
		int count = 0;//��¼����
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
		System.out.println("�ܺ�Ϊ��" + sum);
		System.out.println("����Ϊ��" + count);


		//**************�Ա�**********************
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
