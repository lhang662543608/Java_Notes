package chapter20_4;

/**
 * @author lhang
 * @create 2019-11-18 14:57
 */
public class China extends Country {
    @Override
    public void getMessage(String message) {
        System.out.println("中国获取信息：" + message);
    }
}
