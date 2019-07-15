package sylu.exer;

public class Person {
	String name;
	int age;
	int sex;
	/*
	 * sex	 1	 男
	 * sex	 0	 女
	 */
	
	public void study(){
		System.out.println("studying...");
	}
	
	public void showAge(){
		System.out.println("age:" + age);
	}
	
	public int addAge(int i){
		age += i;
		return age;
	}
}
