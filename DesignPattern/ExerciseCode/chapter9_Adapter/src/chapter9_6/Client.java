package chapter9_6;

/**
 * 使用java语言设计一个双向适配器实例，使得猫（Cat）可以学狗（Dog）叫（cry()），狗可以学猫抓老鼠（catchMouse()）。
 * 绘制相应的类图并编程模拟实现。
 *
 * @author lhang
 * @create 2019-10-24 15:47
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.setCat((Cat) XMLUtil.getCat());
        adapter.setDog((Dog) XMLUtil.getDog());
        Dog dog;
        dog = adapter;
        dog.wang();
        dog.action();
        System.out.println("****↑dog↑*******↓cat↓****");
        Cat cat;
        cat = adapter;
        cat.catchMouse();
        cat.cry();


        XMLUtil.getCat();

    }


}
