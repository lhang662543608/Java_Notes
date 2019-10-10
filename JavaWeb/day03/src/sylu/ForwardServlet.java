package sylu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForwardServlet's doGet");
		
		request.setAttribute("name", "abcde");
		System.out.println("ForwardServlet's name: " + request.getAttribute("name"));
		
		//�����ת��.
		//1. ���� HttpServletRequest �� getRequestDispatcher() ������ȡ  RequestDispatcher ����
		//���� getRequestDispatcher() ��Ҫ����Ҫת���ĵ�ַ
		String path = "testServlet";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/" + path);
		
		//2. ���� HttpServletRequest �� forward(request, response) ���������ת��. 
		requestDispatcher.forward(request, response); 
	}

}
