package chapter13_5;

/**
 * 在电脑主机（Mainframe）中只需要按下主机的开机按钮（on()），即可调用其他硬件设备和软件的启动方法，如内存（Memory）的自检（check()）、
 * CPU的运行（run()）、硬盘（HardDisk）的读取（read()）、操作系统（OS）的载入（load()）等，如果某一过程发生错误则电脑启动失败。
 * 使用外观模式模拟该过程，绘制类图并使用java语言编程模拟实现。
 *
 * @author lhang
 * @create 2019-10-25 21:31
 */
public class Client {
    public static void main(String[] args) {
        Mainframe mainframe = new Mainframe();
        mainframe.on();
    }
}
