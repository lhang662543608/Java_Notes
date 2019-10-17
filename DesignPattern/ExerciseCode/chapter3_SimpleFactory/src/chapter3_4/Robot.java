package chapter3_4;

/**
 * 具体产品角色
 * @author lhang
 * @create 2019-10-10 22:09
 */
public class Robot implements Person {
    @Override
    public void eat() {
        System.out.println("机器人要充电。。。。。");
    }

    @Override
    public void sleep() {
        System.out.println("机器人也要休息。。。。");
    }
}
