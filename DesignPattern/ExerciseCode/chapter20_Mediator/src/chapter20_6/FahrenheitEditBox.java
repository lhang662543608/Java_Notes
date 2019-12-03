package chapter20_6;

/**
 * @author lhang
 * @create 2019-11-18 17:15
 */
public class FahrenheitEditBox extends Widget {
    private double value = 50;

    public void setText(double value) {
        this.value = value;
        System.out.println("华氏温度设置为" + this.value + "。");
    }

    public double getText() {
        System.out.println("获取文本框中的华氏温度：" + this.value + "。");
        return this.value;
    }

    public void changed() {
        System.out.println("华氏温度文本框值改变：");
        dialog.widgetChanged(this);
    }
}