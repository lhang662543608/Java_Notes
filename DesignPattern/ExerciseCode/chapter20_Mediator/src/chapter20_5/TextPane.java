package chapter20_5;

/**
 * @author lhang
 * @create 2019-11-18 15:41
 */
public class TextPane extends Pane {
    public TextPane(Window window) {
        super(window);
    }

    @Override
    public void update(String value) {
        System.out.println("TextPane update:" + value);
    }
}
