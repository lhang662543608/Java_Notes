package sylu.mvcapp.dao;

import java.util.List;

import sylu.mvcapp.domain.Customer;

public interface CustomerDAO {
	public List<Customer> getForListWithCriteriaCustomer(CriteriaCustomer cc);

	public List<Customer> getAll();

	public void save(Customer customer);

	public Customer get(Integer id);

	public void delete(Integer id);

	public void update(Customer customer);

	/**
	 * 返回和name相等的记录数。
	 * 
	 * @param name
	 * @return
	 */
	public long getCountWithName(String name);

}
