package chapter26_4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lhang
 * @create 2019-11-20 15:00
 */
public class BuyBasket {
    private ArrayList<Product> list = new ArrayList<Product>();

    public void accept(Visitor visitor) {
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()) {
            ((Product) iterator.next()).accept(visitor);
        }
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public void removeProduct(Product product) {
        list.remove(product);
    }

}
