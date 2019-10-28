package chapter9_6;

/**
 * @author lhang
 * @create 2019-10-24 16:14
 */
public class ConcreteDog implements Dog {
    @Override
    public void wang() {
        System.out.println("小狗汪汪汪。。。");
    }

    @Override
    public void action() {
        System.out.println("小狗爱调皮...");
    }
}
