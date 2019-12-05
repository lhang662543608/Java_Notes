package chapter23_4;

/**
 * 传输门是传输系统中的重要装置。传输门具有Open(打开)、Closed（关闭）、Opening（正在打开）、StayOpen（保持打开）、Closing（正在关闭）
 * 5种状态。触发状态的转换事件有click、complete、和timeout几种。事件与相应的状态转换如图所示。
 * 试使用状态模式对传输门进行状态模拟，要求绘制相应的类图并使用java语言模拟实现。
 * @author lhang
 * @create 2019-11-19 8:49
 */
public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        door.setState(door.CLOSED);
        door.click();
        door.complete();
        door.click();
        door.click();
        door.complete();
    }
}
