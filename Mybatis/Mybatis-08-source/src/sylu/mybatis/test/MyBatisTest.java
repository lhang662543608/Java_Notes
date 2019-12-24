package sylu.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import sylu.mybatis.been.Employee;
import sylu.mybatis.dao.EmployeeMapper;

public class MyBatisTest {

	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

	/**
	 * 	1����ȡsqlSessionFactory����
	 * 		�����ļ���ÿһ����Ϣ������Configuration�У����ذ���Configuration��DefaultSQLSessionFactory
	 * 		ע�⣺��MappedStatement��������һ����ɾ�Ĳ����ϸ��Ϣ
	 *  2����ȡsqlSession���� 
	 *  	����һ��DefaultSqlSession���󣬰���Executor��Configuration
	 *  	��һ���ᴴ��Executor����
	 *  3����ȡ�ӿڵ�ʵ�������(MapperProxy)
	 *  	getMapperʹ����MapperProxyFactory����һ��MapperProxy�Ĵ������
	 *  	���������������ˣ�DefaultSqlSession��Executor��
	 *  4��ִ����ɾ�Ĳ鷽��
	 * 
	 * 
	 * �ܽ᣺
	 * 	1�����������ļ���ȫ�֣�sqlӳ�䣩��ʼ����Configuration����
	 * 	2������һ��DefaultSqlSession����
	 * 		���������Configuration�Լ�
	 * 		Executor������ȫ�������ļ��е�defaultExecutorType��������Ӧ��Executor��
	 *  3��DefaultSqlSession.getMapper�������õ�Mapper�ӿڶ�Ӧ��MapperProxy��
	 *  4��MapperProxy�����У�DefaultSqlSession����
	 *  5��ִ����ɾ�Ĳ鷽����
	 *  		1��������DefaultSqlSession����ɾ�Ĳ飨Executor����
	 *  		2�����ᴴ��һ��StatementHandler����
	 *  			��ͬʱҲ�ᴴ����ParameterHandler��ResultSetHandler��
	 *  		3��������StatementHandlerԤ��������Լ����ò���ֵ;
	 *  			ʹ��ParameterHandler����sql���ò���
	 *  		4��������StatementHandler����ɾ�Ĳ鷽����
	 *  		5����ResultSetHandler��װ���
	 *  ע�⣺
	 *  	�Ĵ����ÿ��������ʱ����һ��interceptorChain.pluginAll(parameterHandler);
	 * 
	 * @throws IOException
	 */
	@Test
	public void test01() throws IOException {
		// 1����ȡsqlSessionFactory����
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		// 2����ȡsqlSession����
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			// 3����ȡ�ӿڵ�ʵ�������
			// ��Ϊ�ӿ��Զ��Ĵ���һ��������󣬴������ȥִ����ɾ�Ĳ鷽��
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
			Employee employee = mapper.getEmpById(1);
			System.out.println(mapper.getClass());
			System.out.println(employee);
		} finally {
			openSession.close();
		}

	}
}
