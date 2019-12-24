package sylu.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import sylu.mybatis.been.Department;
import sylu.mybatis.been.Employee;
import sylu.mybatis.dao.DepartmentMapper;
import sylu.mybatis.dao.EmployeeMapper;
import sylu.mybatis.dao.EmployeeMapperAnnotation;
import sylu.mybatis.dao.EmployeeMapperPlus;

/**
 * 1���ӿ�ʽ��� ԭ���� Dao ====> DaoImpl mybatis�� Mapper ====> xxMapper.xml
 * 
 * 2��SqlSession���������ݿ��һ�λỰ���������رգ�
 * 3��SqlSession��connectionһ�������Ƿ��̰߳�ȫ��ÿ��ʹ�ö�Ӧ��ȥ��ȡ�µĶ���
 * 4��mapper�ӿ�û��ʵ���࣬����mybatis��Ϊ����ӿ�����һ���������� �����ӿں�xml���а󶨣� EmployeeMapper
 * empMapper = sqlSession.getMapper(EmployeeMapper.class); 5��������Ҫ�������ļ���
 * mybatis��ȫ�������ļ����������ݿ����ӳ���Ϣ�������������Ϣ��...ϵͳ���л�����Ϣ sqlӳ���ļ���������ÿһ��sql����ӳ����Ϣ��
 * ��sql��ȡ������
 * 
 * 
 * @author lfy
 *
 */
public class MyBatisTest {

	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

	/**
	 * 1������xml�����ļ���ȫ�������ļ�������һ��SqlSessionFactory���� ������ԴһЩ���л�����Ϣ
	 * 2��sqlӳ���ļ���������ÿһ��sql���Լ�sql�ķ�װ����ȡ� 3����sqlӳ���ļ�ע����ȫ�������ļ��� 4��д���룺
	 * 1��������ȫ�������ļ��õ�SqlSessionFactory��
	 * 2����ʹ��sqlSession��������ȡ��sqlSession����ʹ������ִ����ɾ�Ĳ�
	 * һ��sqlSession���Ǵ��������ݿ��һ�λỰ������ر�
	 * 3����ʹ��sql��Ψһ��־������MyBatisִ���ĸ�sql��sql���Ǳ�����sqlӳ���ļ��еġ�
	 * 
	 * @throws IOException
	 */
	@Test
	public void test() throws IOException {

		// 2����ȡsqlSessionʵ������ֱ��ִ���Ѿ�ӳ���sql���
		// sql��Ψһ��ʶ��statement Unique identifier matching the statement to use.
		// ִ��sqlҪ�õĲ�����parameter A parameter object to pass to the statement.
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			Employee employee = openSession.selectOne("sylu.mybatis.dao.EmployeeMapper.getEmpById", 1);
			System.out.println(employee);
		} finally {
			openSession.close();
		}

	}

	@Test
	public void test01() throws IOException {
		// 1����ȡsqlSessionFactory����
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		// 2����ȡsqlSession����
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			// 3����ȡ�ӿڵ�ʵ�������
			// ��Ϊ�ӿ��Զ��Ĵ���һ���������󣬴�������ȥִ����ɾ�Ĳ鷽��
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
			Employee employee = mapper.getEmpById(1);
			System.out.println(mapper.getClass());
			System.out.println(employee);
		} finally {
			openSession.close();
		}

	}

	@Test
	public void test02() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			EmployeeMapperAnnotation mapper = openSession.getMapper(EmployeeMapperAnnotation.class);
			Employee empById = mapper.getEmpById(1);
			System.out.println(empById);
		} finally {
			openSession.close();
		}
	}

	/**
	 * ������ɾ�� 1.mybatis������ɾ��ֱ�Ӷ����������͵ķ���ֵ�� Integer��Long��Boolean��void 2.������Ҫ�ֶ��ύ����
	 * sqlSessionFactory.openSession();==>�ֶ��ύ
	 * sqlSessionFactory.openSession(true);==>�Զ��ύ
	 * 
	 * @throws IOException
	 */
	@Test
	public void test03() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		// 1����ȡ����Sqlsession�����Զ��ύ����
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);

			// ��������
			Employee employee = new Employee(null, "Jack", "Jack@163.com", "0");
			mapper.addEmp(employee);
			System.out.println(employee.getId());

			// �����޸�
			/*
			 * Employee employee = new Employee(1, "lhang", "lhang@163.com",
			 * "0"); boolean updateEmp = mapper.updateEmp(employee);
			 * System.out.println(updateEmp);
			 */

			// ����ɾ��
			// mapper.deleteEmpById(2);
			// 2.�ֶ��ύ
			openSession.commit();
		} finally {
			openSession.close();
		}
	}

	@Test
	public void test04() throws IOException {

		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		// 1����ȡ����SqlSession�����Զ��ύ����
		SqlSession openSession = sqlSessionFactory.openSession();

		try {
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
			// Employee employee = mapper.getEmpByIdAndLastName(1, "tom");
			/*
			 * Map<String, Object> map = new HashMap<>(); map.put("id", 1);
			 * map.put("lastName", "lhang"); map.put("tableName",
			 * "tbl_employee"); Employee employee = mapper.getEmpByMap(map);
			 */

			List<Employee> empsByLastNameLike = mapper.getEmpsByLastNameLike("%e%");
			for (Employee employee : empsByLastNameLike) {

				System.out.println(employee);
			}
			Map<String, Object> returnMap = mapper.getEmpByIdReturnMap(1);
			System.out.println(returnMap);

		} finally {
			openSession.close();
		}
	}

	@Test
	public void test05() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			EmployeeMapperPlus mapper = openSession.getMapper(EmployeeMapperPlus.class);
			/*
			 * Employee employee = mapper.getEmpById(1);
			 * System.out.println(employee);
			 */
			/*
			 * Employee empAndDept = mapper.getEmpAndDept(1);
			 * System.out.println(empAndDept);
			 * System.out.println(empAndDept.getDept());
			 */
			Employee empByIdStep = mapper.getEmpByIdStep(2);
			System.out.println(empByIdStep);
			// System.out.println(empByIdStep.getDept());
		} finally {
			openSession.close();
		}
	}

	@Test
	public void test06() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			DepartmentMapper mapper = openSession.getMapper(DepartmentMapper.class);
			/*
			 * Department deptByIdPlus = mapper.getDeptByIdPlus(1);
			 * List<Employee> emps = deptByIdPlus.getEmps();
			 * System.out.println(deptByIdPlus); System.out.println(emps);
			 */

			Department deptByIdStep = mapper.getDeptByIdStep(1);
			System.out.println(deptByIdStep.getDepartmentName());
			System.out.println(deptByIdStep.getEmps());

		} finally {
			openSession.close();
		}
	}

}