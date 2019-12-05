package chapter24_7;

/**
 * @author lhang
 * @create 2019-11-20 9:53
 */
public class Harrier extends AirCraft {
    public Harrier() {
        flyBehavior = new SuperSonicFly();
        takeOffBehavior = new VerticalTakeOff();
    }
}
