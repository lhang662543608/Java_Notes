package DesignPatterns.ProxyPatterns.StaticProxy;

/**
 *  对静态代理结构进行测试
 * @author lhang
 * @create 2019-07-05 15:29
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Singer singer = new Singer();
        Broker Broker = new Broker(singer);
        Broker.sing();
    }
}
