package DesignPatterns.ProxyPatterns.DynamicProxy;



import java.lang.reflect.Proxy;

/**
 * 代理类工厂
 * @author lhang
 * @create 2019-07-06 19:47
 */
public class ProxyFactory {

    public static Object newProxyInstance(Object object){
        Handler handler = new Handler(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),handler);
    }
}
