package sylu.java;

/**
 * 测试thread中的常用方法。
 * 1.start()：启动当前线程，调用当前线程的run方法。
 * 2.run():通常需要重写thread类中的此方法，将创建的线程要执行的操作声明在此方法中。
 * 3.currentthread():静态方法，返回执行当前代码的线程。
 * 4.getName():获取当前线程的名字。
 * 5.setName():设置当前线程的名字。
 * 6.yield():释放当前cpu的执行权。
 * 7.join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态，直到线程b完全执行完之后，线程a才结束阻塞状态。
 * 8。stop():当执行此方法时，强制结束 当前线程。
 * 9.sleep(long millitime):让当前线程睡眠指定的millitime毫秒。在指定的millitime毫秒时间内，当前线程是阻塞状态。
 * 10.isAlive():判断当前线程是否存活。
 *
 * 线程优先级：
 * 1.MAX_PRIORITY : 10
 *  MIN_PRIORITY : 1
 *  NORM_PRIORITY : 10
 * 2.如何获取设置当前线程的优先级。
 *      getPriority():获取当前线程的优先级。
 *      setPriority():设置当前线程的优先级。
 * @author lhang
 * @create 2019-06-08 9:42
 */
public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("Thread:1");
        h1.setName("线程1");
        //设置分线程的优先级。
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if (i %2 == 0)
                System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
            /*if (i  == 20) {
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/

        }
        System.out.println(h1.isAlive());
    }
}

class HelloThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i %2 == 0){
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(getName()+":"+getPriority()+":"+i);
            }
            if (i % 20 == 0)
                yield();
        }
    }
    public HelloThread(String name){
        super(name);
    }
}