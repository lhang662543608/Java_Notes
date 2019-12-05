package chapter5_5;

/**
 * @author lhang
 * @create 2019-10-11 19:44
 */
public interface DBFactory {
    Connection createConnection();
    Statement createStatement();
}
