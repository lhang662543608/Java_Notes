package sylu.spring.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class JDBCTest {

	private ApplicationContext ctx = null;
	private JdbcTemplate jdbcTemplate = null;
	private EmployeeDao employeeDao;
	private DepartmentDao departmentDao;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		employeeDao = ctx.getBean(EmployeeDao.class);
		departmentDao = ctx.getBean(DepartmentDao.class);
		namedParameterJdbcTemplate = ctx.getBean(NamedParameterJdbcTemplate.class);
	}

	/**
	 * 使用具名参数时, 可以使用 update(String sql, SqlParameterSource paramSource) 方法进行更新操作
	 * 1. SQL 语句中的参数名和类的属性一致!
	 * 2. 使用 SqlParameterSource 的 BeanPropertySqlParameterSource 实现类作为参数. 
	 */
	@Test
	public void testNamedParameterJdbcTemplate2() {
		String sql = "INSERT INTO employees(last_name,email,dept_id) "
				+ "VALUES(:lastName,:email,:deptId)";
		
		Employee employee = new Employee();
		employee.setLastName("ll");
		employee.setEmail("ll@sina.com");
		employee.setDeptId(3);
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(employee);
		
		namedParameterJdbcTemplate.update(sql, paramSource);
	}
	
	/**
	 * 可以为参数取名字
	 * 1.好处：若有多个参数，则不用再去对应位置，没直接对应参数名，便于维护。
	 * 2.缺点：较为麻烦。
	 */
	@Test
	public void testNamedParameterJdbcTemplate() {
		String sql = "INSERT INTO employees(last_name,email,dept_id) VALUES(:ln,:email,:deptid)";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("ln", "kk");
		paramMap.put("email", "kk@163.com");
		paramMap.put("deptid", "1");
		namedParameterJdbcTemplate.update(sql, paramMap);
	}
	
	@Test
	public void testDepartmentDao() {
		System.out.println(departmentDao.get(1));
	}
	
	@Test
	public void testEmplyeeDao() {
		System.out.println(employeeDao.get(1));
	}

	/**
	 * 获取单个列的值，或做统计查询
	 * 使用queryForObject(String sql, Class<Long> requiredType)
	 */
	@Test
	public void testQueryForObject2() {
		String sql = "SELECT count(id) FROM employees";
		long count = jdbcTemplate.queryForObject(sql, Long.class);

		System.out.println(count);
	}

	/**
	 * 查到实体类的集合 注意：调用的不是queryForList方法
	 */
	@Test
	public void testQueryForList() {
		String sql = "SELECT id, last_name lastName, email FROM employees WHERE id > ?";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
		List<Employee> employees = jdbcTemplate.query(sql, rowMapper, 5);
		System.out.println(employees);
	}

	/**
	 * 从数据库中获取一条记录，实际得到对应的一个对象。 注意不是调用queryForObject(String sql,Class<Employee>requiredType, Object... args)方法！
	 * 而需要调用queryForObject(String sql, RowMapper<Employee> rowMapper, Object...args)
	 * 1.其中的RowMapper 指定如何去映射结果及 的行，常用的实现类为BeanPropertyRowMapper
	 * 2.使用SQL中的别名完成列名和属性名的映射。例如 last_name 和 lastName
	 * 3.不支持级联映射。jdbcTemplate到底是一个jdbc小工具，不是orm框架。
	 */
	@Test
	public void testQueryForObject() {
		String sql = "SELECT id, last_name lastName, email, dept_id as \"department.id\" FROM employees WHERE id = ?";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, 1);

		System.out.println(employee);
	}

	/**
	 * 执行批量更新：批量的insert、update、delete
	 * 最后一个参数是Object[]的List类型：因为修改一条记录需要一个Object的数组，那么不就需要多个Object的数组了么？
	 */
	@Test
	public void testBatchUpdate() {
		String sql = "insert into employees(last_name,email,dept_id) values(?,?,?)";
		List<Object[]> batchArgs = new ArrayList<>();
		batchArgs.add(new Object[] { "aa", "aa@sylu.com", 1 });
		batchArgs.add(new Object[] { "bb", "bb@sylu.com", 2 });
		batchArgs.add(new Object[] { "cc", "cc@sylu.com", 3 });
		batchArgs.add(new Object[] { "dd", "dd@sylu.com", 3 });
		batchArgs.add(new Object[] { "ee", "ee@sylu.com", 2 });
		jdbcTemplate.batchUpdate(sql, batchArgs);
	}

	/**
	 * 执行insert、update、delete
	 */
	@Test
	public void testUpdate() {
		String sql = "update employees set last_name = ? where id = ?";
		jdbcTemplate.update(sql, "vincent", 5);
	}

	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}

}
