package DesignPatterns.ProxyPatterns.DynamicProxy;

/**
 * 被代理类
 * @author lhang
 * @create 2019-07-06 18:35
 */
public class Singer implements Sing {
    @Override
    public void sing() {
        System.out.println("歌手 唱歌....");
    }
}
