package chapter24_7;

/**
 * @author lhang
 * @create 2019-11-20 9:29
 */
public abstract class AirCraft {
    protected FlyBehavior flyBehavior;
    protected TakeOffBehavior takeOffBehavior;


    public void fly() {
        flyBehavior.fly();
    }

    public void takeOff() {
        takeOffBehavior.takeOff();
    }
}
