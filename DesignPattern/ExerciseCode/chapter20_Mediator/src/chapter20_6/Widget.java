package chapter20_6;

/**
 * @author lhang
 * @create 2019-11-18 17:14
 */
public abstract class Widget {
    protected Dialog dialog;

    public void setDialog(Dialog dialog) {
        this.dialog = dialog;
    }

    public abstract void changed();
}
