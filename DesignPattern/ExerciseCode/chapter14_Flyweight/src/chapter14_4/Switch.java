package chapter14_4;

/**
 * @author lhang
 * @create 2019-10-26 10:39
 */
public class Switch implements NetworkDevice {
    private String type;

    public Switch(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void use(Port port) {
        System.out.println(type+"使用"+port+"端口");
    }
}
