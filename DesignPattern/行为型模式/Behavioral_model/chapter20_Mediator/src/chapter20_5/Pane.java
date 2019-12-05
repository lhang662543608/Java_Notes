package chapter20_5;

/**
 * @author lhang
 * @create 2019-11-18 15:37
 */
public abstract class Pane {
    protected Window window;

    public Pane(Window window) {
        this.window = window;
    }

    public void modify(String value) {
        window.action(this, value);
    }

    public abstract void update(String value);
}
