package chapter5_6;

/**
 * 具体产品类
 * @author lhang
 * @create 2019-10-11 21:13
 */
public class AndroidFactory implements AbstractFactory {
    @Override
    public OperationController getOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController getInterfaceController() {
        return new AndroidInterfaceController();
    }
}
