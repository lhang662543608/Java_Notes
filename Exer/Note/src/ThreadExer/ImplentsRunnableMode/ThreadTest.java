package ThreadExer.ImplentsRunnableMode;

/**
 * 创建两个线程，分别输出1000以内的偶数和1000以内的奇数。
 *
 * @author lhang
 * @create 2019-07-07 21:12
 */
/*
测试两个实现Runnable接口的子线程
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);

        thread1.setName("线程1");
        thread2.setName("线程2");

        thread1.start();
        thread2.start();
    }
}
