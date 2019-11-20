package chapter24_7;

/**
 * @author lhang
 * @create 2019-11-20 9:52
 */
public class Fighter extends AirCraft {
    public Fighter() {
        flyBehavior = new SuperSonicFly();
        takeOffBehavior = new LongDistanceTakeOff();
    }
}
