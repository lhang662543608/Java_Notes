package sylu.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import sylu.mybatis.been.Employee;
import sylu.mybatis.dao.EmployeeMapper;




public class MyBatisTest {
	

	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

	
	@Test
	public void test01() throws IOException {
		// 1、获取sqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		// 2、获取sqlSession对象
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			// 3、获取接口的实现类对象
			//会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
			Page<Object> page = PageHelper.startPage(3,1);
			List<Employee> emps = mapper.getEmps();
			//传入要连续显示几页
			PageInfo<Employee> info = new PageInfo<>(emps, 5);
			for (Employee employee : emps) {
				System.out.println(employee);
			}
			
			/*System.out.println("当前页码："+page.getPageNum());
			System.out.println("总页码："+page.getPages());
			System.out.println("每页的记录数："+page.getPageSize());
			System.out.println("总记录数："+page.getTotal());*/
			//xxx
			System.out.println("当前页码："+info.getPageNum());
			System.out.println("总页码："+info.getPages());
			System.out.println("每页的记录数："+info.getPageSize());
			System.out.println("总记录数："+info.getTotal());
			System.out.println("是否第一页："+info.isIsFirstPage());
			System.out.println("是否最后一页："+info.isIsLastPage());
			System.out.println("连续显示的页码：");
			int[] nums = info.getNavigatepageNums();
			for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
		} finally {
			openSession.close();
		}

	}
	
	@Test
	public void testBatch() throws IOException{
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		
		//可以执行批量操作的sqlSession
		SqlSession openSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
		long start = System.currentTimeMillis();
		try{
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
			for (int i = 0; i < 10000; i++) {
				mapper.addEmp(new Employee(UUID.randomUUID().toString().substring(0, 5), i+"", "1"));
			}
			openSession.commit();
			long end = System.currentTimeMillis();
			//批量：（预编译sql一次==>设置参数===>10000次===>执行（1次））
			//Parameters: 616c1(String), b(String), 1(String)==>4598
			//非批量：（预编译sql=设置参数=执行）==》10000    10200
			System.out.println("执行时长："+(end-start));
		}finally{
			openSession.close();
		}
		
	}
}
	
