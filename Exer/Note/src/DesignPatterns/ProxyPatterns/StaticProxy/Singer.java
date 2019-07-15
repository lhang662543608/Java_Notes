package DesignPatterns.ProxyPatterns.StaticProxy;

/**
 * 歌手扮演被代理的对象，实现Sing接口。
 * @author lhang
 * @create 2019-07-05 15:14
 */
public class Singer implements Sing {
    @Override
    public void sing() {
        System.out.println("歌手 唱歌....");
    }
}
