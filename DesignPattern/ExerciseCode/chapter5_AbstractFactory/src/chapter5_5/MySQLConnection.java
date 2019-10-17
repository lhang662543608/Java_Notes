package chapter5_5;

/**
 * @author lhang
 * @create 2019-10-11 19:47
 */
public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("MySQL Connection....");
    }
}
