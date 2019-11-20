package chapter20_6;

/**
 * @author lhang
 * @create 2019-11-18 17:17
 */
public class FahrenheitLower extends Button {
    public void changed() {
        System.out.println("点击华氏温度降低按钮：");
        dialog.widgetChanged(this);
    }
}
