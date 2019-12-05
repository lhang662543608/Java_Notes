package chapter12_5;

/**
 * @author lhang
 * @create 2019-10-25 16:32
 */
public class CondimentDecorator extends Beverage {
    private Beverage beverage;

    public CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return  beverage.getDescription();
    }

    @Override
    public int getCost() {
        return beverage.getCost();
    }
}
