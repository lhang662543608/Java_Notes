package chapter12_4;

/**
 * @author lhang
 * @create 2019-10-25 13:05
 */
public class SimplePhone extends CellPhone {
    /**
     * 基本功能实现
     */
    @Override
    void receiveCall() {
        System.out.println("Simple phone 接到来电");
        System.out.println("$$$$$$$响铃提示$$$$$$");
    }
}
