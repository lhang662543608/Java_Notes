package chapter12_5;

/**
 * @author lhang
 * @create 2019-10-25 16:31
 */
public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "浓缩咖啡";
    }

    @Override
    public int getCost() {
        return 25;
    }
}
