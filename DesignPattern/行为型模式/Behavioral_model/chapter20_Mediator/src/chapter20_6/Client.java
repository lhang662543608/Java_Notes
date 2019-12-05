package chapter20_6;

/**
 * 有如图所示的温度转换器程序，该程序在同一个界面上显示华氏温度（Fahrenheit）和摄氏温度（Celsius）。
 * 用户可以通过“升高”和“降低”按钮或右边的温度调节条来调节温度，也可以直接通过文本框来设置温度，
 * 摄氏温度和华氏温度将同时改变，且温度调节条将一起被调节。
 * 使用中介者模式设计该系统，绘制类图并使用java语言编程模拟实现。
 *
 * @author lhang
 * @create 2019-11-18 17:06
 */
public class Client {
    public static void main(String[] args) {
        TemperatureConvertorDialog dialog;
        dialog = new TemperatureConvertorDialog();
        FahrenheitEditBox editBox1 = new FahrenheitEditBox();
        CelsiusEditBox editBox2 = new CelsiusEditBox();
        TemperatureBar tempBar = new TemperatureBar();
        FahrenheitLower fLower = new FahrenheitLower();
        CelsiusLower cLower = new CelsiusLower();
        FahrenheitRaise fRaise = new FahrenheitRaise();
        CelsiusRaise cRaise = new CelsiusRaise();
        editBox1.setDialog(dialog);
        editBox2.setDialog(dialog);
        tempBar.setDialog(dialog);
        fLower.setDialog(dialog);
        cLower.setDialog(dialog);
        fRaise.setDialog(dialog);
        cRaise.setDialog(dialog);
        dialog.showDialog();
        dialog.editBox1 = editBox1;
        dialog.editBox2 = editBox2;
        dialog.tempBar = tempBar;
        dialog.fLower = fLower;
        dialog.cLower = cLower;
        dialog.fRaise = fRaise;
        dialog.cRaise = cRaise;
        editBox1.changed();
        System.out.println("-------------------");
        fRaise.changed();
        System.out.println("-------------------");
        tempBar.setBarValue(20);
        tempBar.changed();
        System.out.println("-------------------");
    }
}
