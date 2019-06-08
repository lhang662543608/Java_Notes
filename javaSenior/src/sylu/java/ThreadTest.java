package sylu.java;

/**
 * @author lhang
 * @create 2019-06-08 8:30
 *
 * 多线程的创建方式一：继承于thread类
 * 1.创建一个继承于Thread类的子类。
 * 2.重写thread类的run方法。
 * 3.创建tread类的子类的对象
 * 4.通过此对象调用start()
 */
/*
ex:遍历100以内的偶数
 */
//1.创建一个继承于Thread类的子类。
class MyThread extends Thread{
    //2.重写thread类的run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0){
                System.out.println(Thread.currentThread().getName()+" : "+ i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        // 3.创建tread类的子类的对象
        MyThread t1 = new MyThread();

        // 4.通过此对象调用start()：①启动当前线程 ②调用当前线程的run方法
        t1.start();

        //问题一：我们不能通过直接调用run()方法的方式启动线程。
//        t1.run();

        //问题二：在启动一个线程遍历100以内的偶数。
//        t1.start();
        MyThread t2 = new MyThread();
        t2.start();
        //如下操作仍然在main线程的中执行的。
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0){
                System.out.println(Thread.currentThread().getName()+" : "+ i + "**********main()**********");
            }
        }
    }
}



