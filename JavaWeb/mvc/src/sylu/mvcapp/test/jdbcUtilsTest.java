package sylu.mvcapp.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import sylu.mvcapp.db.jdbcUtils;

public class jdbcUtilsTest {

	@Test
	public void testGetConnection() throws SQLException {
		Connection connection =jdbcUtils.getConnection();
		System.out.println(connection);
	}

}
