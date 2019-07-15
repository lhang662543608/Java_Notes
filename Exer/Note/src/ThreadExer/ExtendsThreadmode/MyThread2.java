package ThreadExer.ExtendsThreadmode;

/**
 * @author lhang
 * @create 2019-07-07 21:03
 */
/*
创建Thread线程类的子类，实现输出1000以内的奇数的功能
 */
public class MyThread2 extends Thread {
    public MyThread2() {
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (i % 2 != 0) {

                System.out.println(this.getName() + ":——" + i + "——");
            }
        }
    }
}
