package chapter15_5;

/**
 * @author lhang
 * @create 2019-10-28 14:23
 */
public class BusinessClass implements AbstractSubject {
    @Override
    public void method() {
        System.out.println("真实业务方法！");
        throw new RuntimeException();
    }
}
