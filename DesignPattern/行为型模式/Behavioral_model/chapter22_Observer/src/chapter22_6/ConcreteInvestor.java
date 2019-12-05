package chapter22_6;

/**
 * @author lhang
 * @create 2019-11-18 22:01
 */
//股民：具体观察者
public class ConcreteInvestor implements Investor {
    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    public void response(Stock stock) {
        System.out.print("提示股民: " + name);
        System.out.print("------股票：" + stock.getStockName());
        System.out.print("价格波动幅度超过 5%------");
        System.out.println("新价格是:" + stock.getPrice() + "。");
    }
}
