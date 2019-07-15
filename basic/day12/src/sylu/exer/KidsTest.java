package sylu.exer;
/*
 * 定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问
 * 其父类的成员变量及方法。
 */
public class KidsTest {
	
	public static void main(String[] args) {
		Kids someKid = new Kids(12);
		someKid.printAge();
		someKid.setSex(1);
		someKid.setSalary(1222);
		
		someKid.employeed();
		someKid.manOrWoman();
		
		
	}

}
