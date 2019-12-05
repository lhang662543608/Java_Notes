package chapter8_8;

/**
 * 某软件公司开发人员要创建一个数据库连接池，将指定个数的（如两个或者3个）数据库连接对象存储在连接池中，
 * 客户端代码可以从池中随机取一个连接对象来连接数据库。试通过对单例类进行改造，
 * 设计一个能够自行提供指定个数实例对象的数据库类并使用java代码编程模拟实现。
 *
 * @author lhang
 * @create 2019-10-17 8:02
 */
public class Client {
    public static void main(String[] args) {
        Multiton m1, m2, m3, m4;
        m1 = Multiton.getInstance();
        m2 = Multiton.getInstance();
        m3 = Multiton.getInstance();
        m4 = Multiton.getInstance();
        System.out.println(m1 == m2);
        System.out.println(m1 == m3);
        System.out.println(m1 == m4);
    }
}
