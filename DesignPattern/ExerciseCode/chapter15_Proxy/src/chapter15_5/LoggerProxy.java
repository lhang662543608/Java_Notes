package chapter15_5;

import java.time.LocalDateTime;

/**
 * @author lhang
 * @create 2019-10-28 14:28
 */
public class LoggerProxy implements AbstractSubject {
    private BusinessClass businessObj = new BusinessClass();

    @Override
    public void method() {
        System.out.println("方法method()被调用，调用时间为" + LocalDateTime.now());
        try {
            businessObj.method();
            System.out.println("方法method()调用成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("方法method()调用失败");
        }

    }

}
