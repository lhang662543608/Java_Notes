package chapter20_5;

/**
 * @author lhang
 * @create 2019-11-18 15:47
 */
public class ConcreteWindow extends Window {
    public TextPane tx;
    public ListPane lp;
    public GraphicPane gp;


    @Override
    public void action(Pane pane, String value) {
        if (pane == tx) {
            lp.update(value);
            gp.update(value);
        } else if (pane == lp) {
            tx.update(value);
            gp.update(value);
        } else {
            tx.update(value);
            lp.update(value);
        }
    }
}
