package chapter4_4;

/**
 * 具体产品
 * @author lhang
 * @create 2019-10-11 13:32
 */
public class BMW implements Car {
    @Override
    public void run() {
        System.out.println("BMW run...");
    }
}
