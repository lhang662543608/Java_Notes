package chapter5_5;

/**
 * @author lhang
 * @create 2019-10-11 19:49
 */
public class MySQLFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }
}
