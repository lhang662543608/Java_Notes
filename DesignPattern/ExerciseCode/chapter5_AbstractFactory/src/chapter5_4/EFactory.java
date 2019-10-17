package chapter5_4;

/**
 * 抽象工厂
 * @author lhang
 * @create 2019-10-11 19:05
 */
public interface EFactory {
    Television produceTelevision();
    AirConditioner produceAirCondition();
}
