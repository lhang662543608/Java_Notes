package chapter10_5;

/**
 * @author lhang
 * @create 2019-10-24 23:03
 */
public class Airbus extends Manufacturer {

    @Override
    void PlaneFly() {
        System.out.print("空客-->");
        super.PlaneFly();
    }
}
