package sylu.spring.transaction.xml;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookShopDaoImpl implements BookShopDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int findBookPriceByIsbn(Integer isbn) {
		String sql = "select price from book where isbn = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, isbn);
	}

	@Override
	public void updateBookStock(Integer isbn) {
		// 检查书的库存是否足够，若不够则抛出异常
		String sql2 = "SELECT stock FROM book_stock WHERE isbn = ?";
		int stock = jdbcTemplate.queryForObject(sql2, Integer.class, isbn);
		if (stock == 0) {
			throw new BookStockException("库存不足！");
		}

		String sql = "UPDATE book_stock SET stock = stock -1 WHERE isbn = ?";
		jdbcTemplate.update(sql, isbn);

	}

	@Override
	public void updateUserAccount(String username, Integer price) {
		// 验证余额是否足够，若不足，则抛出异常
		String sql2 = "SELECT balance FROM account WHERE username = ?";
		int balance = jdbcTemplate.queryForObject(sql2, Integer.class, username);
		if (balance < price) {
			throw new UserAccountException("余额不足！");
		}

		String sql = "UPDATE account SET balance = balance - ? WHERE username = ?";
		jdbcTemplate.update(sql, price, username);
	}

}