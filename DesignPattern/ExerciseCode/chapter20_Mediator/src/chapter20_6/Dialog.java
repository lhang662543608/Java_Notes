package chapter20_6;

/**
 * @author lhang
 * @create 2019-11-18 17:12
 */
public abstract class Dialog {
    public void showDialog() {
        System.out.println("显示主界面");
    }

    public abstract void widgetChanged(Widget widget);
}
