package DesignPatterns.ProxyPatterns.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lhang
 * @create 2019-07-06 19:53
 */
public class Handler implements InvocationHandler {
    private Object object;
    protected Handler(Object object){
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //TODO：方法调用之前的其他操作
        System.out.println("方法调用之前的其他操作");

        Object returnValue = method.invoke(object, args);

        //TODO：方法调用之后的其他操作
        System.out.println("方法调用之后的其他操作");

        return returnValue;
    }
}
