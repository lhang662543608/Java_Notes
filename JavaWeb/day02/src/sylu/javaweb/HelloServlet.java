package sylu.javaweb;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sun.corba.se.spi.servicecontext.ServiceContexts;

public class HelloServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("destroy....");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig....");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo....");
		return null;
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("init....");

		String user = servletConfig.getInitParameter("user");
		System.out.println("user:" + user);

		Enumeration<String> names = servletConfig.getInitParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = servletConfig.getInitParameter(name);
			System.out.println("~~:" + name + ":" + value);
		}

		String serlvetname = servletConfig.getServletName();
		System.out.println(serlvetname);

		// 获取ServletContext对象
		ServletContext servletContext = servletConfig.getServletContext();

		String driver = servletContext.getInitParameter("driver");
		System.out.println("driver:" + driver);

		Enumeration<String> names2 = servletContext.getInitParameterNames();
		while (names2.hasMoreElements()) {
			String name = names2.nextElement();
			String value = servletContext.getInitParameter(name);
			System.out.println("-->"+name+"=="+value);
		}
		
		String realPath = servletContext.getRealPath("/note.txt");
		/*F:\myLearningRoad\java_road\JavaWeb
		 * \.metadata\.plugins\org.eclipse.wst.server.core
		 * \tmp0\wtpwebapps\day02\note.txt
		 */
		System.out.println(realPath);
		
		String contextPath = servletContext.getContextPath();
		System.out.println(contextPath);/*  /day02   */
		
		
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			InputStream inputStream = classLoader.getResourceAsStream("jdbc.properties");
			System.out.println("1.\t"+inputStream);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			InputStream inputStream2 = servletContext.getResourceAsStream("/WEB-INF/classes/jdbc.properties");
			System.out.println("2.\t"+inputStream2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service....");

	}

	public HelloServlet() {
		System.out.println("HelloServle's constrctor.....");
	}

}
