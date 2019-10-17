package chapter5_5;

/**
 * 某系统为了改进数据库操作的性能，用户可以自定义数据库连接对象Connection和语句对象Statement.
 * 针对不同类型的的数据库提供不同的连接对象和语句对象。例如提供Oracle或MySQL专用连接类和语句类，
 * 而且用户可以通过配置文件的方式根据实际需要动态更换系统数据库。
 * 使用抽象工厂模式设计该系统，要求绘制对应的类图并使用java语言编程模拟实现。
 * @author lhang
 * @create 2019-10-11 19:36
 */
public class Client {
    public static void main(String[] args) {
        DBFactory factory;
        Connection connection;
        Statement statement;

//        factory = new OracleFactory();
//        factory = new MySQLFactory();
        factory = (DBFactory) XMLUtil.getBean();
        connection = factory.createConnection();
        statement = factory.createStatement();


        connection.connect();
        statement.executeStatement();



    }
}
