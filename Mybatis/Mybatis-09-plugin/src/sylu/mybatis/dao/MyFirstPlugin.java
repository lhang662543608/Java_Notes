package sylu.mybatis.dao;

import java.util.Properties;

import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

/**
 * ��ɲ��ǩ����
 *		����MyBatis��ǰ������������ĸ�������ĸ�����
 */
@Intercepts(
		{
			@Signature(type=StatementHandler.class,method="parameterize",args=java.sql.Statement.class)
		})
public class MyFirstPlugin implements Interceptor{

	/**
	 * intercept�����أ�
	 * 		����Ŀ������Ŀ�귽����ִ�У�
	 */
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("MyFirstPlugin...intercept:"+invocation.getMethod());
		//��̬�ĸı�һ��sql���еĲ�������ǰ1��Ա����ʵ�ʴ����ݿ��ѯ3��Ա��
		Object target = invocation.getTarget();
		System.out.println("��ǰ���ص��Ķ���"+target);
		//�õ���StatementHandler==>ParameterHandler===>parameterObject
		//�õ�target��Ԫ����
		MetaObject metaObject = SystemMetaObject.forObject(target);
		Object value = metaObject.getValue("parameterHandler.parameterObject");

		System.out.println("sql����õĲ����ǣ�"+value);
		//�޸���sql���Ҫ�õĲ���
		metaObject.setValue("parameterHandler.parameterObject", 5);
		//ִ��Ŀ�귽��
		Object proceed = invocation.proceed();
		
		//����ִ�к�ķ���ֵ
		return proceed;
	}

	/**
	 * plugin��
	 * 		��װĿ�����ģ���װ��ΪĿ����󴴽�һ����������
	 */
	@Override
	public Object plugin(Object target) {
		// TODO Auto-generated method stub
		//���ǿ��Խ���Plugin��wrap������ʹ�õ�ǰInterceptor��װ����Ŀ�����
		System.out.println("MyFirstPlugin...plugin:mybatis��Ҫ��װ�Ķ���"+target);
		Object wrap = Plugin.wrap(target, this);
		//����Ϊ��ǰtarget�����Ķ�̬����
		return wrap;
	}

	/**
	 * setProperties��
	 * 		�����ע��ʱ ��property�������ý���
	 */
	@Override
	public void setProperties(Properties properties) {
		// TODO Auto-generated method stub
		System.out.println("������õ���Ϣ��"+properties);
	}

}
