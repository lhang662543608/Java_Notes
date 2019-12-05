package chapter26_4;

/**
 * 顾客在超市中需要对选择商品（例如苹果、图书等）放在购物车中，然后到收银员处付款。
 * 在购物过程中顾客需要对这些商品进行访问，以便确认这些商品的质量，之后收银员计算价格时也要访问顾客购物车内的商品。
 * 此时购物车作为一个对象结构用于存储各种类型的商品，而顾客和收银员作为访问这些商品的访问者，它们需要对商品进行检查和计价。
 * 不同类型的商品的访问形式也可能不同，如苹果需要过秤之后在计价，而图书不需要。
 * 使用访问者模式来模拟该购物过程，要求绘制相应的类图并使用java语言编程模拟实现。
 *
 * @author lhang
 * @create 2019-11-20 10:45
 */
public class Client {
    public static void main(String[] args) {
        BuyBasket buyBasket = new BuyBasket();

        Product apple = new Apple();
        Product book = new Book();

        buyBasket.addProduct(apple);
        buyBasket.addProduct(book);

        Visitor customer = new Customer();
        Visitor saler = new Saler();

        buyBasket.accept(customer);
        buyBasket.accept(saler);

    }
}
