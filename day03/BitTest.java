/*
�����֮�壺λ�����(�˽�)
���ۣ�
1.λ����������Ķ������͵�����
2.<< : ��һ����Χ�ڣ�ÿ������1λ���൱�� * 2
  >> : ��һ����Χ�ڣ�ÿ������1λ���൱�� / 2


 �����⣺���Ч�ķ�ʽ���� 2*8�� 2<<3 �� 8<1
*/
class BitTest 
{
	public static void main(String[] args) 
	{
		int i =21;
		System.out.println("i << 2 :" + (i<<2));
		System.out.println("i << 3 :" + (i<<3));
		System.out.println("i << 26 :" + (i<<26));
		System.out.println("i << 27 :" + (i<<27));
		
		int m = 12;
		int n =5;
		int a =6;
		System.out.println("m & n :" + (m & n));
		System.out.println("m | n :" + (m | n));
		System.out.println("m ^ n :" + (m ^ n));
		System.out.println("~a :" + (~a));


		//��ϰ����������������ֵ��
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 ="+num1+" num2="+num2);

		//��ʽһ��������ʱ�����ķ�ʽ��
		//�Ƽ��ķ�ʽ
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		//��ʽ�����ô������ö�����ʱ����
		//�׶ˣ�1.��Ӳ������ܳ����洢��Χ  2.�о����ԣ�ֻ����������ֵ����
		//num1 = num1 + num2;// num1 = 30  num2 = 20
		//num2 = num1 - num2;//num1 = 30   num2 =10
		//num1 = num1 - num2;//num1 = 20   num2 =10 
		
		
		//ʹ��λ�����
		//num1 = num1^num2;
		//num2 = num1^num2;
		//num1 = num1^num2;
		System.out.println("num1 ="+num1+" num2="+num2);

		
	}
}