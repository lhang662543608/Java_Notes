package sylu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @author lhang
 * @date 2019年11月29日下午9:28:04
 * 
 */
public class Main {

	public static void main(String[] args) {
		// 1.创建一个HelloWorld对象
		// HelloWorld helloWorld = new HelloWorld();
		// 2.为name属性赋值
		// helloWorld.setName("沈阳理工大学");

		// 1.创建Spring的IOC容器
		// ApplicationContext:代表 IOC 容器
		// ClassPathXmlApplicationContext:是ApplicationContext接口的实现类。该实现类从类路径下加载配置文件。
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2.从IOC容器中获取bean实例
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

		// 3.调用hello方法
		helloWorld.hello();

		Car car = (Car) ctx.getBean("car");
		System.out.println(car);

		car = (Car) ctx.getBean("car2");
		System.out.println(car);

		Person person = (Person) ctx.getBean("person");
		System.out.println(person);

		person = (Person) ctx.getBean("person2");
		System.out.println(person);

	}
}
