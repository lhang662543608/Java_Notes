package sylu.mvcapp.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

import sylu.mvcapp.dao.CriteriaCustomer;
import sylu.mvcapp.dao.CustomerDAO;
import sylu.mvcapp.dao.factory.CustomerDAOFactory;
import sylu.mvcapp.dao.impl.CustomerDAOJdbcImpl;
import sylu.mvcapp.dao.impl.CustomerDAOXMLImpl;
import sylu.mvcapp.domain.Customer;

@WebServlet("*.do")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	private CustomerDAO customerDAO = new CustomerDAOJdbcImpl();
	private CustomerDAO customerDAO = CustomerDAOFactory.getInstance().getCustomerDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { String method =
	 * request.getParameter("method"); switch (method) { case "add":
	 * add(request, response); break; case "query": query(request, response);
	 * break; case "delete": delete(request, response); break; } }
	 */

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.获取servletPath：/edit.do 或 /addCustomer.do 或 /delete.do
		String servletPath = request.getServletPath();
		// 2.去除 / 和.do 获得 类似于 edit 或 addCustomer 或 delete 这样的字符串。
		String methodName = servletPath.substring(1);
		methodName = methodName.substring(0, methodName.length() - 3);
		try {
			// 3.利用反射获取methodName对应的方法。
			Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class,
					HttpServletResponse.class);
			// 4.利用反射调用对应的方法。
			method.invoke(this, request, response);
		} catch (Exception e) {
			// e.printStackTrace();
			response.sendRedirect("error.jsp");
		}
	}
	
	private void update(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		//1. 获取表单参数: id, name, address, phone, oldName
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String oldName = request.getParameter("oldName");
		
		//2. 检验 name 是否已经被占用:
		
		//2.1 比较 name 和 oldName 是否相同, 若相同说明 name 可用. 
		//2.1 若不相同, 则调用 CustomerDAO 的 getCountWithName(String name) 获取 name 在数据库中是否存在
		if(!oldName.equalsIgnoreCase(name)){
			long count = customerDAO.getCountWithName(name);
			//2.2 若返回值大于 0, 则响应 updatecustomer.jsp 页面: 通过转发的方式来响应 newcustomer.jsp
			if(count > 0){
				//2.2.1 在 updatecustomer.jsp 页面显示一个错误消息: 用户名 name 已经被占用, 请重新选择!
				//在 request 中放入一个属性 message: 用户名 name 已经被占用, 请重新选择!, 
				//在页面上通过 request.getAttribute("message") 的方式来显示
				request.setAttribute("message", "用户名" + name + "已经被占用, 请重新选择!");
				
				//2.2.2 newcustomer.jsp 的表单值可以回显. 
				//address, phone 显示提交表单的新的值, 而 name 显示 oldName, 而不是新提交的 name
				
				//2.2.3 结束方法: return 
				request.getRequestDispatcher("/updatecustomer.jsp").forward(request, response);
				return;
			}
		}
		
		//3. 若验证通过, 则把表单参数封装为一个 Customer 对象 customer
		Customer customer = new Customer(name, address, phone);
		customer.setId(Integer.parseInt(id)); 
		
		//4. 调用 CustomerDAO 的  update(Customer customer) 执行更新操作
		customerDAO.update(customer);
		
		//5. 重定向到 query.do
		response.sendRedirect("query.do");
	}
	
	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath = "/error.jsp";

		// 1. 获取请求参数 id
		String idStr = request.getParameter("id");

		// 2. 调用 CustomerDAO 的 customerDAO.get(id) 获取和 id 对应的 Customer 对象
		// customer
		try {
			Customer customer = customerDAO.get(Integer.parseInt(idStr));
			if (customer != null) {
				forwardPath = "/updatecustomer_1.jsp";
				// 3. 将 customer 放入 request 中
				request.setAttribute("customer", customer);
			}
		} catch (NumberFormatException e) {
		}

		// 4. 响应 updatecustomer.jsp 页面: 转发.
		request.getRequestDispatcher(forwardPath).forward(request, response);

	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		// try...catch 的作用是 防止 idStr不能被转换为 int。
		try {
			id = Integer.parseInt(idStr);
			customerDAO.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("query.do");
	}

	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取模糊查询的参数
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		// 把请求参数封装为一个CriteriaCustomer对象。
		CriteriaCustomer cc = new CriteriaCustomer(name, address, phone);

		// 1.调用CustomerDao的getForListWithCriteriaCustomer()方法得到Customer的集合。
		List<Customer> customers = customerDAO.getForListWithCriteriaCustomer(cc);

		// 2.把Customer的集合放入request中。
		request.setAttribute("customers", customers);

		// 3.转发页面到jsp。
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	private void addCustomer(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 获取表单参数: name, address, phone
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");

		// 2. 检验 name 是否已经被占用:

		// 2.1 调用 CustomerDAO 的 getCountWithName(String name) 获取 name 在数据库中是否存在
		long count = customerDAO.getCountWithName(name);

		// 2.2 若返回值大于 0, 则响应 newcustomer.jsp 页面:
		// 通过转发的方式来响应 newcustomer.jsp
		if (count > 0) {
			// 2.2.1 要求再 newcustomer.jsp 页面显示一个错误消息: 用户名 name 已经被占用, 请重新选择!
			// 在 request 中放入一个属性 message: 用户名 name 已经被占用, 请重新选择!,
			// 在页面上通过 request.getAttribute("message") 的方式来显示
			request.setAttribute("message", "用户名" + name + "已经被占用, 请重新选择!");

			// 2.2.2 newcustomer.jsp 的表单值可以回显.
			// 通过 value="<%= request.getParameter("name") == null ? "" :
			// request.getParameter("name") %>"
			// 来进行回显
			// 2.2.3 结束方法: return
			request.getRequestDispatcher("/newcustomer.jsp").forward(request, response);
			return;
		}

		// 3. 若验证通过, 则把表单参数封装为一个 Customer 对象 customer
		Customer customer = new Customer(name, address, phone);

		// 4. 调用 CustomerDAO 的 save(Customer customer) 执行保存操作
		customerDAO.save(customer);

		// 5. 重定向到 success.jsp 页面: 使用重定向可以避免出现表单的重复提交问题.
		response.sendRedirect("success.jsp");

	}

}
