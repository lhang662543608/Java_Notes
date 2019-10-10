package sylu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RedirectServlet's doGet");
		
		request.setAttribute("name", "xyzmn");
		System.out.println("RedirectServlet's name: " + request.getAttribute("name"));
		
		
		//ִ��������ض���, ֱ�ӵ��� response.sendRedirect(path) ����,
		//path ΪҪ�ض���ĵ�ַ
		String path = "testServlet";
		response.sendRedirect(path);
	}

}
