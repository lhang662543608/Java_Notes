package ThreadExer.ExtendsThreadmode;

/**
 * @author lhang
 * @create 2019-07-07 21:01
 */

/*
创建Thread线程类的子类，实现输出1000以内的偶数的功能。
 */
public class MyThread1 extends Thread {
    public MyThread1() {
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(this.getName() + ":***" + i + "***");
            }
        }
    }

    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }

}
