package chapter4_4;

/**
 * 具体工厂
 *
 * @author lhang
 * @create 2019-10-11 13:31
 */
public class BMWFactory implements CarFactory {
    @Override
    public Car produceCar() {
        return new BMW();
    }
}
