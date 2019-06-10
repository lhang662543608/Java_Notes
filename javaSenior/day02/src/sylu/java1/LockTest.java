package sylu.java1;


import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三：Lock锁  --->JDK5.0新增
 *
 * 1.面试题：synchronized  与 Lock 的异同？
 *  相同：都是用来解决线程安全问题的。
 *  不同点：synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器。
 *          Lock需要手动的启动同步，同时同步的结束也需要手动完成。
 *  Lock的灵活性比synchronized代码块好；synchronized代码块灵活性比synchronized方法体好
 *
 *  2.面试题：如何解决线程安全问题：
 *      三种方式：   1.synchronized代码块
 *                 2.synchronized方法体
 *                 3.lock锁
 *
 * @author lhang
 * @create 2019-06-10 10:33
 */
class Window implements Runnable {
    private int ticket = 100;
    //1.实例化ReentrantLock
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                //2.调用锁定方法lock()
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票：票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                //3.调用解锁方法。
                lock.unlock();
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Window w1 = new Window();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}

