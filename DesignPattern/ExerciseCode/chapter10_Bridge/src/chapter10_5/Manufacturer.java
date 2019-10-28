package chapter10_5;

/**
 * @author lhang
 * @create 2019-10-24 22:59
 */
public abstract class Manufacturer {
    protected Plane plane;

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

     void PlaneFly() {
        plane.fly();
    }

    ;
}
