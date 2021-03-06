package sylu.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import sylu.mybatis.been.Employee;

public interface EmployeeMapper {

	public Employee getEmpById(Integer id);

	public List<Employee> getEmps();
}
