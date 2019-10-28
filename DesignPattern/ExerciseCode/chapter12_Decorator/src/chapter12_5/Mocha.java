package chapter12_5;

/**
 * @author lhang
 * @create 2019-10-25 16:36
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",摩卡";
    }

    @Override
    public int getCost() {
        return super.getCost()+10;
    }
}
