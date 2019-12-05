package chapter20_6;

/**
 * @author lhang
 * @create 2019-11-18 17:15
 */
public class CelsiusEditBox extends Widget {
    private double value = 10;

    public void setText(double value) {
        this.value = value;
        System.out.println("摄氏温度设置为" + this.value + "。");
    }

    public double getText() {
        System.out.println("获取文本框中的摄氏温度：" + this.value + "。");
        return this.value;
    }

    public void changed() {
        dialog.widgetChanged(this);
    }
}
