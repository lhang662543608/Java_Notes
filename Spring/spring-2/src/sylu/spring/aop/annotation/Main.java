package sylu.spring.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 1. 创建spring 的IOC容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
		// 2. 从IOC容器中获取bean实例
		MathematicsCalculator mCalculator = (MathematicsCalculator) ctx.getBean("mathematicsCalculator");
		// 3. 使用bean
		int result = mCalculator.add(2, 3);
		System.out.println("result: " + result);

		result = mCalculator.div(2, 1);
		System.out.println("result: " + result);
	}

}
