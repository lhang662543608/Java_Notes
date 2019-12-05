package chapter5_5;

/**
 * @author lhang
 * @create 2019-10-11 19:45
 */
public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Oracle Connection....");
    }
}
