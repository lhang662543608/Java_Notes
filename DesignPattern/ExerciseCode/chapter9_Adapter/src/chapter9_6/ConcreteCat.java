package chapter9_6;

/**
 * @author lhang
 * @create 2019-10-24 16:12
 */
public class ConcreteCat implements Cat {
    @Override
    public void cry() {
        System.out.println("小猫喵喵叫。。。");
    }

    @Override
    public void catchMouse() {
        System.out.println("小猫抓老鼠。。。");
    }
}
