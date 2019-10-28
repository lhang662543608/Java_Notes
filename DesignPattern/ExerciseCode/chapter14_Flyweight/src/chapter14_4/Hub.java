package chapter14_4;

/**
 * @author lhang
 * @create 2019-10-26 13:23
 */
public class Hub implements NetworkDevice {
    private String type;

    public Hub(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void use(Port port) {
        System.out.println(type + "使用" + port + "端口");
    }
}
