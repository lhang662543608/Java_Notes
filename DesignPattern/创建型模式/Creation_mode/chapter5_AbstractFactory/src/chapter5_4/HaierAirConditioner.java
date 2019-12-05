package chapter5_4;

/**
 * 具体产品
 * @author lhang
 * @create 2019-10-11 19:09
 */
public class HaierAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("Haier AirConditioner....");
    }
}
