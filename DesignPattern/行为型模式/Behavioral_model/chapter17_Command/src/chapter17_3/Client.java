package chapter17_3;

/**
 * 房间中的开关就是命令模式的一个实现，现用命令模式来模拟开关的功能，可控制对象包括电灯和电扇，绘制相应的类图并使用java语言模拟
 * @author lhang
 * @create 2019-11-12 19:12
 */
public class Client {
    public static void main(String[] args) {
        Switch aSwitch = new Switch();
//        aSwitch.setCommand(new LampCommand());
        aSwitch.setCommand((Command) XMLUtils.getBean());
        aSwitch.on();
    }
}
