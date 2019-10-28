package chapter12_5;

/**
 * @author lhang
 * @create 2019-10-25 16:30
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "混合咖啡";
    }

    @Override
    public int getCost() {
        return 30;
    }
}
