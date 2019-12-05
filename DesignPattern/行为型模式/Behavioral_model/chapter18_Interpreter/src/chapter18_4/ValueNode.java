package chapter18_4;

/**
 * @author lhang
 * @create 2019-11-13 17:13
 */
public class ValueNode implements Node {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    public int interpret() {
        return this.value;
    }
}
