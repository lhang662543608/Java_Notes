package chapter14_5;

/**
 * @author lhang
 * @create 2019-10-28 9:31
 */
public class SharedString {
    private String content;
    private Color color;
    private Size size;

    public SharedString(String content) {
        this.content = content;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "SharedString{" +
                "content='" + content + '\'' +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
