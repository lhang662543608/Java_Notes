package chapter22_4;

/**
 * “猫（Cat）大叫一声，老鼠（Mouse）开始逃跑，主人（Master）被惊醒”。
 * 这个过程蕴含了那种设计模式，绘制相应的类图并使用java语言编程模拟实现此过程。
 *
 * @author lhang
 * @create 2019-11-18 21:09
 */
public class Client {
    public static void main(String[] args) {
        Subject cat = new Cat();
        Observer mouse1, mouse2, master;
        mouse1 = new Mouse("大老鼠", cat);
        mouse2 = new Mouse("小老鼠", cat);
        master = new Master("小龙女", cat);
        cat.cry();
    }
}
