package chapter20_5;

/**
 * @author lhang
 * @create 2019-11-18 15:42
 */
public class ListPane extends Pane {
    public ListPane(Window window) {
        super(window);
    }

    @Override
    public void update(String value) {
        System.out.println("ListPane update:" + value);
    }
}
