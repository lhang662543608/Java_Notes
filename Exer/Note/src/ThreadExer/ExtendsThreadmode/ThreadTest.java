package ThreadExer.ExtendsThreadmode;

/**
 * 创建两个线程，分别输出1000以内的偶数和1000以内的奇数。
 *
 * @author lhang
 * @create 2019-07-07 20:59
 */


/*
测试两个继承Thread类的子线程
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        //设置线程的名字
        thread1.setName("线程thread1");
        thread2.setName("线程thread2");

        thread1.start();
        thread2.start();

    }
}
