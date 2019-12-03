package sylu.spring.hibernate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sylu.spring.hibernate.service.BookShopService;
import sylu.spring.hibernate.service.Cashier;

@Service
public class CashierImpl implements Cashier {

	@Autowired
	private BookShopService bookShopService;

	@Override
	public void checkout(String username, List<Integer> isbns) {
		for (Integer isbn : isbns) {
			bookShopService.purchase(username, isbn);
		}
	}

}
