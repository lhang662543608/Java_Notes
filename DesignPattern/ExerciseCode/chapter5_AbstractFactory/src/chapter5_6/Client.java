package chapter5_6;

/**
 * 某软件公司要推出一款新的手机游戏软件，
 * 该软件能够支持iOS、Android和Windows Phone等多个智能手机操作系统平台，
 * 针对不同的手机操作系统，该软件提供不同的游戏操作控制（OperationController）类和
 * 游戏界面控制（InterfaceController）类，并提供相应的工厂类来封装这些类的初始话过程。
 * 软件要求具有良好的扩展性以支持新的操作系统平台。
 * 为了满足上述需求，是采用工厂方法模式对其进行设计。
 * @author lhang
 * @create 2019-10-11 20:15
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory;
        InterfaceController interfaceController;
        OperationController operationController;

        factory = new AndroidFactory();
        factory = new IOSFactory();
        factory = (AbstractFactory) XMLUtil.getBean();
        interfaceController = factory.getInterfaceController();
        operationController=factory.getOperationController();


        interfaceController.interfaceControl();
        operationController.operateControl();





    }
}
