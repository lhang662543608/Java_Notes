package sylu.spring.transaction.xml;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TransactionTest {

	private ApplicationContext ctx = null;
	private JdbcTemplate jdbcTemplate = null;
	private DataSource dataSource = null;
	private BookShopDao bookShopDao = null;
	private BookShopService bookShopService = null;
	private Cashier cashier;
	{
		ctx = new ClassPathXmlApplicationContext("configApplication-tx-xml.xml");
		jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		dataSource = jdbcTemplate.getDataSource();
		bookShopDao = ctx.getBean(BookShopDao.class);
		bookShopService = ctx.getBean(BookShopService.class);
		cashier = ctx.getBean(Cashier.class);
	}

	/**
	 * 测试事务的传播行为
	 */
	@Test
	public void testTransactionPropagation() {
		cashier.checkout("AA", Arrays.asList(1001, 1002));
	}

	@Test
	public void testBookShopService() {
		bookShopService.purchase("AA", 1001);
	}

	

}
