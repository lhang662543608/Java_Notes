package chapter22_4;


/**
 * @author lhang
 * @create 2019-11-18 21:13
 */
public interface Subject {//抽象主题

    public abstract void addObserver(Observer obs);

    public abstract void cry();

}
