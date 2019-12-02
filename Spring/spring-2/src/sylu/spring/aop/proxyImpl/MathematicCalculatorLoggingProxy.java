package sylu.spring.aop.proxyImpl;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class MathematicCalculatorLoggingProxy {
	// 要代理的对象
	private MathematicsCalculator target;

	public MathematicCalculatorLoggingProxy(MathematicsCalculator target) {
		super();
		this.target = target;
	}

	public MathematicsCalculator getLoggingProxy() {
		MathematicsCalculator proxy = null;

		// 代理对象由哪一个类加载器负责加载
		ClassLoader loader = target.getClass().getClassLoader();
		// 代理对象的类型，即其中有哪些方法
		Class[] interfaces = new Class[] { MathematicsCalculator.class };
		// 当调用代理对象中的方法是，该执行的代码

		InvocationHandler h = new InvocationHandler() {
			/**
			 * proxy:正在返回的那个代理对象，一般情况下，在invoke方法中都不使用该对象。 method：正在被调用的方法
			 * args：调用方法时，传入的参数。
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				String methodName = method.getName();
				// 日志
				System.out.println("The method " + methodName + " begins with " + Arrays.asList(args));
				// 执行方法
				Object result = null;
				try {
					//前置通知
					result = method.invoke(target, args);
					//返回通知，可以访问到方法的返回值
				} catch (Exception e) {
					e.printStackTrace();
					//异常通知：可以访问到方法的异常
				}
				
				//后置通知。因为方法可能出异常，所以访问不到方法的返回值
				
				// 日志
				System.out.println("The method " + methodName + " ends with " + result);
				return result;
			}
		};

		proxy = (MathematicsCalculator) Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
	}
}
