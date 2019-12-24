package sylu.mybatis.dao;

import sylu.mybatis.been.Department;

public interface DepartmentMapper {
	public Department getDeptById(Integer id);

	public Department getDeptByIdPlus(Integer id);

	public Department getDeptByIdStep(Integer id);
}