package sylu.java;

/**
 * 使用同步方法解决继承Thread类的方式中的线程安全问题。
 *
 *
 *  关于同步方法的总结：
 *      1.同步方法任然设计到同步监视器，只是不需要我们显示的声明。
 *      2.非静态的同步监视器是：this
 *          静态的同步监视器是：当前类本神
 *
 * @author lhang
 * @create 2019-06-10 8:35
 */
class Window4 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    //private synchronized void show(){//同步监视器：t1,t2,t3 //错误的解决方式
    private static synchronized void show(){//同步监视器：Window4.class
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
            ticket--;
        }
    }
}

public class WindowTest4 {
    public static void main(String[] args) {
        Window4 w1 = new Window4();
        Window4 w2 = new Window4();
        Window4 w3 = new Window4();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();

    }
}