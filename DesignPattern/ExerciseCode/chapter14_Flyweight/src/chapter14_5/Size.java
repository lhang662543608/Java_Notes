package chapter14_5;

/**
 * @author lhang
 * @create 2019-10-28 9:25
 */
public class Size {
    private int value;

    public Size(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Size{" +
                "value=" + value +
                '}';
    }
}
