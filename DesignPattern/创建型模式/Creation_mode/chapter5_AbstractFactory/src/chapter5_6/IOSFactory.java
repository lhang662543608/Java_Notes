package chapter5_6;

/**
 * 具体工厂
 * @author lhang
 * @create 2019-10-11 21:11
 */
public class IOSFactory implements AbstractFactory {
    @Override
    public OperationController getOperationController() {
        return new IOSOperationController();
    }

    @Override
    public InterfaceController getInterfaceController() {
        return new IOSInterfaceController();
    }
}
