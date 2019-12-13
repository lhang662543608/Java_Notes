package sylu.mybatis.dao;

import org.apache.ibatis.annotations.Select;

import sylu.mybatis.been.Employee;

public interface EmployeeMapperAnnotation {

	@Select("select * from tbl_employee where id=#{id}")
	public Employee getEmpById(Integer id);
}
