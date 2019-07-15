package DesignPatterns.SingletonPattern.HungryPattern;

/**
 * 单例模式：饿汉式
 * @author lhang
 * @create 2019-07-07 16:18
 */
public class Singleton {
    //私有化构造器
    private Singleton(){ }
    //在内部定义只供自己调用的实例
    private static Singleton instance = new Singleton();
    //静态工厂方法，提供了一个供外部访问得到对象的静态方法
    public static Singleton getInstance(){
        return instance;
    }
}
