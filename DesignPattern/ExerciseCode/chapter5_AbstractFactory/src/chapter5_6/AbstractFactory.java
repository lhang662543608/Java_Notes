package chapter5_6;

/**
 * 抽象工厂类
 * @author lhang
 * @create 2019-10-11 21:09
 */
public interface AbstractFactory {
    OperationController getOperationController();
    InterfaceController getInterfaceController();
}
