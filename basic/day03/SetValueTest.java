/*
�����֮������ֵ�����
=  +=  -=  *=  /=  %=




*/
class SetValueTest 
{
	public static void main(String[] args) 
	{
		//��ֵ���ţ� =
		int i1 = 10;
		int j1 =10;

		int i2,j2;
		//������ֵ
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
		//s1 = S1 + 2;//����ʧ��
		s1 += 2;//���ۣ�����ı��������������
		System.out.println(s1);//12

		byte b1 = 127;
		//b1 = b1 + 2;//����ʧ��
		b1 += 1;//���ۣ�����ı��������������
		System.out.println(b1);//-128

		//�����У����ϣ��ʵ��+2�Ĳ������м��ַ�������ǰ�᣺ int num = 10;��
		//��ʽһ��num = num + 2;
		//��ʽ����num += 2;(�Ƽ�)

		//�����У����ϣ��ʵ��+1�Ĳ������м��ַ�������ǰ�᣺ int num = 10;��
		//��ʽһ��num = num + 1;
		//��ʽ����num += 1;
		//��ʽ����num++;(�Ƽ�)
		
		//��ϰ1
		int i =2;
		i *= 0.1;
		System.out.println(i);//0
		i++;
		System.out.println(i);//1

		//��ϰ2
		int n = 10;
		n += (n++) + (++n);// n = 10 + 10 + 12 ;
		System.out.println(n);//32
	}
}