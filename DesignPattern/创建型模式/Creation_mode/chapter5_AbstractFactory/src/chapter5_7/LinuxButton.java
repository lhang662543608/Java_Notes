package chapter5_7;

/**
 * 具体产品类
 * @author lhang
 * @create 2019-10-11 21:41
 */
public class LinuxButton implements Button {
    @Override
    public void buttonDisplay() {
        System.out.println("Linux Button...");
    }
}
