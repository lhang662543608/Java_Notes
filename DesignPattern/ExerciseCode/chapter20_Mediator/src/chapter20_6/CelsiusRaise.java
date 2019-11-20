package chapter20_6;

/**
 * @author lhang
 * @create 2019-11-18 17:18
 */
public class CelsiusRaise extends Button {
    public void changed() {
        System.out.println("点击摄氏温度升高按钮：");
        dialog.widgetChanged(this);
    }
}
