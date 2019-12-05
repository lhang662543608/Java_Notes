package chapter5_5;

/**
 * @author lhang
 * @create 2019-10-11 19:48
 */
public class OracleFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}
