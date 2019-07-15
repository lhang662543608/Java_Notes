package DesignPatterns.ProxyPatterns.DynamicProxy;

/**
 * @author lhang
 * @create 2019-07-06 20:14
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Singer singer = new Singer();
        Sing ProxyInstance = (Sing) ProxyFactory.newProxyInstance(singer);
        ProxyInstance.sing();
    }
}
