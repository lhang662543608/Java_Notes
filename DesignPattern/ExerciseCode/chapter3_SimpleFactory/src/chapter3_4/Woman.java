package chapter3_4;

/**
 * 具体产品角色
 * @author lhang
 * @create 2019-10-10 22:09
 */
public class Woman implements Person {
    @Override
    public void eat() {
        System.out.println("女人吃好喝好。。。。。");
    }

    @Override
    public void sleep() {
        System.out.println("女人要休息好啊。。。。");
    }
}
