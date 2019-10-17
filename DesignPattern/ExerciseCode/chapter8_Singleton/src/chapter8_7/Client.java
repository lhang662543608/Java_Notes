package chapter8_7;

/**
 * 使用单例模式设计一个多文档窗口
 * （注：在java AWT/Swing开发中可使用JDesktopPanel和JInternalFrame来实现），
 * 要求在主窗体中某个内部之窗体只能被实例化与一次，及只能弹出一个相同的子窗体。编程实现该功能。
 *
 * @author lhang
 * @create 2019-10-17 8:01
 */
public class Client {
    public static void main(String[] args) {
        new MainClass();
    }
}
