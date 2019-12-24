package sylu.mybatis.dao;

import java.util.List;

import sylu.mybatis.been.Employee;
import sylu.mybatis.been.OraclePage;

public interface EmployeeMapper {
	public Employee getEmpById(Integer id);

	public List<Employee> getEmps();

	public Long addEmp(Employee employee);
	
	public void getPageByProcedure(OraclePage page);
}