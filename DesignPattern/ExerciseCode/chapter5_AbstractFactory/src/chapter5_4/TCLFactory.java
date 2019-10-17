package chapter5_4;

/**
 * 具体工厂
 * @author lhang
 * @create 2019-10-11 19:13
 */
public class TCLFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        return new TCLTelevision();
    }

    @Override
    public AirConditioner produceAirCondition() {
        return new TCLAirConditioner();
    }
}
