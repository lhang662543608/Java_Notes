package sylu.spring.hibernate.dao;

public interface BookShopDao {
	/**
	 * 根据书号获取书本的单价
	 * 
	 * @param isbn:书本的isbn编号
	 * @return 书本的价格
	 */
	public int findBookPriceByIsbn(Integer isbn);

	/**
	 * 更新书的库存。使书号对应的库存减一
	 * 
	 * @param isbn:书本的isbn编号
	 */
	public void updateBookStock(Integer isbn);

	/**
	 * 更新用户的账户余额： 使username的balance - price
	 * 
	 * @param username:用户名
	 * @param price：价格
	 */
	public void updateUserAccount(String username, Integer price);
}
