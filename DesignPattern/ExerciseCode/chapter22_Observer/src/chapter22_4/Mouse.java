package chapter22_4;

/**
 * @author lhang
 * @create 2019-11-18 21:18
 */
public class Mouse implements Observer {    //具体观察者
    private String name;

    public Mouse(String name, Subject subject) {
        this.name = name;
        subject.addObserver(this);
    }

    public void response() {
        System.out.println(this.name + "拼命逃跑！");
    }
}
