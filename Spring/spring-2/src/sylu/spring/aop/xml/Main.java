package sylu.spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 1. 创建spring 的IOC容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-xml.xml");
		// 2. 从IOC容器中获取bean实例
		MathematicsCalculator mCalculator = (MathematicsCalculator) ctx.getBean("mathematicsCalculator");
		// 3. 使用bean
		int result = mCalculator.add(2, 3);
		System.out.println("result: " + result);

		result = mCalculator.div(2000, 10);
		System.out.println("result: " + result);
	}

}
