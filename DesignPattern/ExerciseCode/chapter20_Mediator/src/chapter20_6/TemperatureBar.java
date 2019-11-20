package chapter20_6;

/**
 * @author lhang
 * @create 2019-11-18 17:16
 */
public class TemperatureBar extends Widget {
    private double barValue = 10;

    public void setBarValue(double value) {
        this.barValue = value;
        System.out.println("温度调节条值为" + this.barValue + "摄氏度。");
    }

    public double getBarValue() {
        System.out.println("获取温度调节条的摄氏温度：" + this.barValue + "。");
        return this.barValue;
    }

    public void changed() {
        dialog.widgetChanged(this);
    }
}
