package chapter20_4;

/**
 * @author lhang
 * @create 2019-11-18 14:58
 */
public class America extends Country {
    @Override
    public void getMessage(String message) {
        System.out.println("美国获取信息：" + message);
    }
}
