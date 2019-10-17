package chapter5_4;

/**
 * 具体工厂
 * @author lhang
 * @create 2019-10-11 19:06
 */
public class HaireFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirCondition() {
        return new HaierAirConditioner();
    }
}
