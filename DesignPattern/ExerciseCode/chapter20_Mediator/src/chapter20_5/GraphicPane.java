package chapter20_5;

/**
 * @author lhang
 * @create 2019-11-18 15:45
 */
public class GraphicPane extends Pane {
    public GraphicPane(Window window) {
        super(window);
    }

    @Override
    public void update(String value) {
        System.out.println("GraphicPane update" + value);
    }
}
