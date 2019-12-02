package sylu.spring.aop.annotation;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//使用@Order注解制定切面的优先级，值越小，优先级越大。
@Order(1)
@Aspect
@Component
public class VlidationAspect {
	@Before("LoggingAspect.declareJoinPointexpression()")
	public void validateArgs(JoinPoint joinPoint) {
		System.out.println("-->validate: " + Arrays.asList(joinPoint.getArgs()));
	}
}
