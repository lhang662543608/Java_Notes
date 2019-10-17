package chapter5_7;

/**
 * 抽象工厂模式最早的应用之一就是用来创建不同操作系统的图形环境下都能够运行的应用程序，
 * 比如同时支持Windows与Linux操作系统。在每一个操作系统中都有一个有图形构件组成的构建家族，
 * 可以通过一个抽象角色给出功能定义，而由具体子类给出不同操作系统下的具体实现，
 * 例如系统中包含两个产品等级结构，分别是Button与Text；
 * 同时包含3个产品族，即UNIX产品族、Linux产品族与Windows产品族，如图5-6所示。
 *  试使用抽象工厂模式来设计并模拟实现该结构。
 * @author lhang
 * @create 2019-10-11 21:26
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory;
        Button button;
        Text text;

        factory = new LinuxFactory();
        factory = new WindowsFactory();
        factory = new UnixFactory();
       factory = (AbstractFactory) XMLUtil.getBean();

        button= factory.getButton();
        text=factory.getText();
        button.buttonDisplay();
        text.TextDisplay();


    }
}
