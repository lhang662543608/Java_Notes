package chapter10_5;

/**
 * @author lhang
 * @create 2019-10-24 23:08
 */
public class MD extends Manufacturer {
    @Override
    void PlaneFly() {
        System.out.print("麦道-->");
        super.PlaneFly();
    }
}
