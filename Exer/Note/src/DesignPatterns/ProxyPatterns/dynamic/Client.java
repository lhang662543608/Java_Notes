package DesignPatterns.ProxyPatterns.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 客户端测试类
 *
 * @author lhang
 * @create 2019-09-23 17:00
 */
public class Client {
    public static void main(String[] args) {
        InvocationHandler handler = null;

        AbstractUserDAO userDAO = new UserDAO();
        handler = new DAOLogHandler(userDAO);
        AbstractUserDAO proxy = null;

        //动态创建代理对象，用于代理一个AbstractUserDAO类型的真实主题对象。
        proxy = (AbstractUserDAO) Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(), new Class[]{AbstractUserDAO.class}, handler);
        proxy.findUserById("张无忌");     //调用代理对象的业务方法。

        System.out.println("---------------------------------");

        AbstractDocumentDAO documentDAO = new DocumentDAO();
        handler = new DAOLogHandler(documentDAO);
        AbstractDocumentDAO proxy_new = null;

        //动态创建代理对象，用于代理一个AbstractDocumentDAO类型的真实主题对象。
        proxy_new = (AbstractDocumentDAO) Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(),
                new Class[]{AbstractDocumentDAO.class}, handler);
        proxy_new.deleteDocumentById("D001");   //调用代理对象的业务方法
    }
}
