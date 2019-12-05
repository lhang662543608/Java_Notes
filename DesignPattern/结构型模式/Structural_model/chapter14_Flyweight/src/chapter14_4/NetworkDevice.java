package chapter14_4;

/**
 * @author lhang
 * @create 2019-10-26 10:32
 */
public interface NetworkDevice {
    String getType();

    void use(Port port);
}
