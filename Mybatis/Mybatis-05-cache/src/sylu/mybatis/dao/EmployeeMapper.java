package sylu.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import sylu.mybatis.been.Employee;

public interface EmployeeMapper {
	// ������¼��װһ��map��Map<Integer,Employee>:����������¼��������ֵ�Ǽ�¼��װ���javaBean
	// @MapKey:����mybatis��װ���map��ʱ��ʹ���ĸ�������Ϊmap��key
	@MapKey("lastName")
	public Map<String, Employee> getEmpByLastNameLikeReturnMap(String lastName);

	// ����һ����¼��map��key����������ֵ���Ƕ�Ӧ��ֵ
	public Map<String, Object> getEmpByIdReturnMap(Integer id);

	public List<Employee> getEmpsByLastNameLike(String lastName);

	public Employee getEmpByMap(Map<String, Object> map);

	public Employee getEmpByIdAndLastName(@Param("id") Integer id, @Param("lastName") String lastName);

	public Employee getEmpById(Integer id);

	public void addEmp(Employee employee);

	public boolean updateEmp(Employee employee);

	public void deleteEmpById(Integer id);

}