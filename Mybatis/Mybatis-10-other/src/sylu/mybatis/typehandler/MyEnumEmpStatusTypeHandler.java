package sylu.mybatis.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import sylu.mybatis.been.EmpStatus;

/**
 * 1. ʵ��Typehandler�ӿڻ��߼̳�BaseTypeHandler
 * @author lhang
 *
 */
public class MyEnumEmpStatusTypeHandler implements TypeHandler<EmpStatus> {
	/**
	 * ���嵱ǰ������α�������ݿ���
	 */
	@Override
	public void setParameter(PreparedStatement ps, int i, EmpStatus parameter, JdbcType jdbcType) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Ҫ�����״̬��"+parameter.getCode());
		ps.setString(i, parameter.getCode().toString());
		
	}

	@Override
	public EmpStatus getResult(ResultSet rs, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		int code = rs.getInt(columnName);
		System.out.println("�����ݿ��л�ȡ��״̬�룺"+code);
		EmpStatus status = EmpStatus.getEmpStatusByCode(code);
		return status;
	}

	@Override
	public EmpStatus getResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		int code = rs.getInt(columnIndex);
		System.out.println("�����ݿ��л�ȡ��״̬�룺"+code);
		EmpStatus status = EmpStatus.getEmpStatusByCode(code);
		return status;
	}

	@Override
	public EmpStatus getResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		int code = cs.getInt(columnIndex);
		System.out.println("�����ݿ��л�ȡ��״̬�룺"+code);
		EmpStatus status = EmpStatus.getEmpStatusByCode(code);
		return status;
	}

}