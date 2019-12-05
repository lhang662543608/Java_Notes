package chapter20_6;

/**
 * @author lhang
 * @create 2019-11-18 17:18
 */
public class CelsiusLower extends Button {
    public void changed() {
        System.out.println("点击摄氏温度降低按钮：");
        dialog.widgetChanged(this);
    }
}
