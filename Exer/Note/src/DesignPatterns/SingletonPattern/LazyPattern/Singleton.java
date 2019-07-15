package DesignPatterns.SingletonPattern.LazyPattern;

import DesignPatterns.ProxyPatterns.DynamicProxy.Sing;

/**
 * 单例模式：懒汉式
 *
 * @author lhang
 * @create 2019-07-07 16:26
 */
public class Singleton {
    //在内部声明一个自己的实例。
    private static Singleton instance = null;

    //私有化构造器
    private Singleton() {
    }

    //静态工厂方法
//    public static Singleton getInstance(){    //线程不安全
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
