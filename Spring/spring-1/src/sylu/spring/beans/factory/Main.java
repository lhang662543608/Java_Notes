package sylu.spring.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sylu.spring.beans.factorybean.Car;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory.xml");
		Car car = (Car) context.getBean("car1");
		System.out.println(car);

		Car car2 = (Car) context.getBean("car2");
		System.out.println(car2);
	}

}
