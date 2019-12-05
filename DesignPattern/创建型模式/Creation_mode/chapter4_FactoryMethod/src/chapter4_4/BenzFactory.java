package chapter4_4;

/**
 * 具体工厂
 * @author lhang
 * @create 2019-10-11 13:33
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car produceCar() {
        return new Benz();
    }
}
