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

import sylu.mybatis.been.EmpStatus;
import sylu.mybatis.been.Employee;
import sylu.mybatis.been.OraclePage;
import sylu.mybatis.dao.EmployeeMapper;




public class MyBatisTest {
	

	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

	
	@Test
	public void test01() throws IOException {
		// 1����ȡsqlSessionFactory����
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		// 2����ȡsqlSession����
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			// 3����ȡ�ӿڵ�ʵ�������
			//��Ϊ�ӿ��Զ��Ĵ���һ���������󣬴�������ȥִ����ɾ�Ĳ鷽��
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
			Page<Object> page = PageHelper.startPage(3,1);
			List<Employee> emps = mapper.getEmps();
			//����Ҫ������ʾ��ҳ
			PageInfo<Employee> info = new PageInfo<>(emps, 5);
			for (Employee employee : emps) {
				System.out.println(employee);
			}
			
			/*System.out.println("��ǰҳ�룺"+page.getPageNum());
			System.out.println("��ҳ�룺"+page.getPages());
			System.out.println("ÿҳ�ļ�¼����"+page.getPageSize());
			System.out.println("�ܼ�¼����"+page.getTotal());*/
			//xxx
			System.out.println("��ǰҳ�룺"+info.getPageNum());
			System.out.println("��ҳ�룺"+info.getPages());
			System.out.println("ÿҳ�ļ�¼����"+info.getPageSize());
			System.out.println("�ܼ�¼����"+info.getTotal());
			System.out.println("�Ƿ��һҳ��"+info.isIsFirstPage());
			System.out.println("�Ƿ����һҳ��"+info.isIsLastPage());
			System.out.println("������ʾ��ҳ�룺");
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
		
		//����ִ������������sqlSession
		SqlSession openSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
		long start = System.currentTimeMillis();
		try{
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
			for (int i = 0; i < 10000; i++) {
				mapper.addEmp(new Employee(UUID.randomUUID().toString().substring(0, 5), i+"", "1"));
			}
			openSession.commit();
			long end = System.currentTimeMillis();
			//��������Ԥ����sqlһ��==>���ò���===>10000��===>ִ�У�1�Σ���
			//Parameters: 616c1(String), b(String), 1(String)==>4598
			//����������Ԥ����sql=���ò���=ִ�У�==��10000    10200
			System.out.println("ִ��ʱ����"+(end-start));
		}finally{
			openSession.close();
		}
		
	}
	
	/**
	 * oracle��ҳ��
	 * 		����rownum���кţ��Ӳ�ѯ��
	 * �洢���̰�װ��ҳ�߼�
	 * @throws IOException 
	 */
	@Test
	public void testProcedure() throws IOException{
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		try{
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
			OraclePage page = new OraclePage();
			page.setStart(1);
			page.setEnd(5);
			mapper.getPageByProcedure(page);
			
			System.out.println("�ܼ�¼����"+page.getCount());
			System.out.println("��������ݣ�"+page.getEmps().size());
			System.out.println("��������ݣ�"+page.getEmps());
		}finally{
			openSession.close();
		}
		
	}
	
	@Test
	public void testEnumUse(){
		EmpStatus login = EmpStatus.LOGIN;
		System.out.println("ö�ٵ�������"+login.ordinal());
		System.out.println("ö�ٵ����֣�"+login.name());
		
		System.out.println("ö�ٵ�״̬�룺"+login.getCode());
		System.out.println("ö�ٵ���ʾ��Ϣ��"+login.getMsg());
	}
	
	/**
	 * Ĭ��mybatis�ڴ���ö�ٶ����ʱ�򱣴����ö�ٵ����֣�EnumTypeHandler
	 * �ı�ʹ�ã�EnumOrdinalTypeHandler��
	 * @throws IOException
	 */
	@Test
	public void testEnum() throws IOException{
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		try{
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
			Employee employee = new Employee("test_enum", "enum@163.com","1");
			/*mapper.addEmp(employee);
			System.out.println("����ɹ�"+employee.getId());
			openSession.commit();*/
			Employee empById = mapper.getEmpById(20020);
			System.out.println(empById.getEmpStatus());
		}finally{
			openSession.close();
		}
	}
	
}
	