package chapter12_5;

/**
 * @author lhang
 * @create 2019-10-25 16:35
 */
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",牛奶";
    }

    @Override
    public int getCost() {
        return super.getCost()+6;
    }
}
