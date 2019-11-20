package chapter22_4;

import java.util.ArrayList;

/**
 * @author lhang
 * @create 2019-11-18 21:16
 */
public class Cat implements Subject {//具体主题
    private ArrayList<Observer> list;

    public Cat() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer obs) {
        list.add(obs);
    }

    @Override
    public void cry() {
        for (Observer obs : list) {
            obs.response();
        }
    }
}
