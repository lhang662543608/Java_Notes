package chapter24_7;

/**
 * @author lhang
 * @create 2019-11-20 9:35
 */
public class Helicopter extends AirCraft {
    public Helicopter(){
        flyBehavior = new SubSonicFly();
        takeOffBehavior = new VerticalTakeOff();
    }

}
