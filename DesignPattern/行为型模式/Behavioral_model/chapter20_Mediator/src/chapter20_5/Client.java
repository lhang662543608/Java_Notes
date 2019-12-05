package chapter20_5;

/**
 * 某软件公司要开发一套图形界面类库。该类库需要包含若干预定义的窗格（Pane）对象，例如TetxPane、ListPane、GraphicPane等，
 * 窗格之间不允许直接引用。
 * 基于该类库的应用由一个包含一组窗格的窗口（Window）组成，窗口需要协调窗格之间的行为。
 * 试采用中介者模式设计该系统，要求绘制相应的类图并使用java语言编程模拟实现。
 *
 * @author lhang
 * @create 2019-11-18 15:24
 */
public class Client {
    public static void main(String[] args) {
        ConcreteWindow window = new ConcreteWindow();
        TextPane textPane = new TextPane(window);
        ListPane listPane = new ListPane(window);
        GraphicPane graphicPane = new GraphicPane(window);
        window.tx=textPane;
        window.lp=listPane;
        window.gp=graphicPane;
        textPane.modify("3");
        System.out.println("---------");
        listPane.modify("4");
        System.out.println("---------");
        graphicPane.modify("5");

    }
}
