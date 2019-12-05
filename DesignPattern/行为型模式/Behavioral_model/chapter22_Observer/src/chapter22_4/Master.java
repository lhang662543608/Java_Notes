package chapter22_4;

/**
 * @author lhang
 * @create 2019-11-18 21:21
 */
public class Master implements Observer {//具体观察者
    private String name;

    public Master(String name, Subject subject) {
        this.name = name;
        subject.addObserver(this);
    }

    public void response() {
        System.out.println(this.name + "从美梦中惊醒！");
    }
}
