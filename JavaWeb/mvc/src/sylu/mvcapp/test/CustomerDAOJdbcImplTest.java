package sylu.mvcapp.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import sun.security.krb5.internal.ccache.CCacheInputStream;
import sylu.mvcapp.dao.CriteriaCustomer;
import sylu.mvcapp.dao.CustomerDAO;
import sylu.mvcapp.dao.impl.CustomerDAOJdbcImpl;
import sylu.mvcapp.domain.Customer;

public class CustomerDAOJdbcImplTest {

	private CustomerDAO customerDAO = new CustomerDAOJdbcImpl();

	@Test
	public void testGetForListWithCriteriaCustomer() {
		CriteriaCustomer cc = new CriteriaCustomer("o", null, null);
		List<Customer> customers = customerDAO.getForListWithCriteriaCustomer(cc);

		System.out.println(customers);
	}

	@Test
	public void testGetAll() {
		List<Customer> customers = customerDAO.getAll();
		System.out.println(customers);
	}

	@Test
	public void testSave() {
		Customer customer = new Customer();
		customer.setName("lily");
		customer.setAddress("ZhenZhou");
		customer.setPhone("15765851225");
		customerDAO.save(customer);
	}

	@Test
	public void testGetInteger() {
		Customer customer = customerDAO.get(1);
		System.out.println(customer);
	}

	@Test
	public void testDelete() {
		customerDAO.delete(1);
	}

	@Test
	public void testGetCountWithName() {
		long count = customerDAO.getCountWithName("Jerry");
		System.out.println(count);

	}

}
