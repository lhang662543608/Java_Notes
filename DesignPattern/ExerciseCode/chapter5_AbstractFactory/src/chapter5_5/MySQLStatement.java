package chapter5_5;

/**
 * @author lhang
 * @create 2019-10-11 19:48
 */
public class MySQLStatement implements Statement {
    @Override
    public void executeStatement() {
        System.out.println("MySQL Statement ....");
    }
}
