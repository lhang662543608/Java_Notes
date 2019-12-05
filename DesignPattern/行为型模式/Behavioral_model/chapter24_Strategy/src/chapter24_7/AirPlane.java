package chapter24_7;

/**
 * @author lhang
 * @create 2019-11-20 9:49
 */
public class AirPlane extends AirCraft {
    public AirPlane() {
        flyBehavior = new SubSonicFly();
        takeOffBehavior = new LongDistanceTakeOff();
    }
}
