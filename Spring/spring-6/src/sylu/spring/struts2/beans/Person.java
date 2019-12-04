package sylu.spring.struts2.beans;

public class Person {
	private String username;

	public void setUsername(String username) {
		this.username = username;
	}

	public void sayHello() {
		System.out.println("My Name is " + username);
	}
}
