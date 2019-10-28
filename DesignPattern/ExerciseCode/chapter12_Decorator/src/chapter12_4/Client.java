package chapter12_4;

/**
 * 最简单的手机（SimplePhone）在接收来电的时候会发出声音提醒主人，
 * 现在需要为该手机添加一项功能，在接收来电的时候除了有声音还能产生振动（JarPhone）
 * ，还可以得到更高级的手机（ComplexPhone），来电时它不仅能发声，产生振动，而且有灯光提示。
 * 现用装饰模式来模拟手机功能的升级过程，要求绘制类图并使用java语言编程模拟实现
 * @author lhang
 * @create 2019-10-25 12:55
 */
public class Client {
    public static void main(String[] args) {
        CellPhone phone,phoneDecorator;
        phone =new SimplePhone();
        phoneDecorator = new JarPhone(phone);
        CellPhone complexPhone = new ComplexPhone(phoneDecorator);
        complexPhone.receiveCall();

    }
}
