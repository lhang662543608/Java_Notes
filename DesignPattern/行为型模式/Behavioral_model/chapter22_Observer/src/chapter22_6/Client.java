package chapter22_6;

/**
 * 某实时在线股票软件需要提供以下功能：当股票购买者所购买的某只股票的价格变化幅度超过5%时，系统将自动发送通知（包括新价格）给购买该股票的所有股民。
 * 试使用观察者模式设计并实现该系统，要求绘制相应的类图并使用jav语言编程模拟实现。
 *
 * @author lhang
 * @create 2019-11-18 21:55
 */
public class Client {//客户端测试类

    public static void main(String[] args) {
        Investor investor1, investor2;
        investor1 = new ConcreteInvestor("杨过");
        investor2 = new ConcreteInvestor("小龙女");
        Stock haier = new Stock("青岛海尔", 20.00);
        haier.attach(investor1); //注册
        haier.attach(investor2); //注册
        haier.setPrice(25.00);
    }
}
