package sylu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {

		// ��ȡ����ʽ�� GET ���� POST
		String method = request.getMethod();
		System.out.println(method);

		// 1. ��ȡ�������: username, password
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// 2. ��ȡ��ǰ WEB Ӧ�õĳ�ʼ������: user, password.
		// ��Ҫʹ�� ServletContext ����.
		String initUser = getServletContext().getInitParameter("user");
		String initPassword = getServletContext().getInitParameter("password");

		PrintWriter out = response.getWriter();

		// 3. �ȶ�
		// 4. ��ӡ��Ӧ�ַ���.
		if (initUser.equals(username) && initPassword.equals(password)) {
			out.print("Hello: " + username);
		} else {
			out.print("Sorry: " + username);
		}

	}

}
