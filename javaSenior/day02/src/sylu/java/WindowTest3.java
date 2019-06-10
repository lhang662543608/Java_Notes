package sylu.java;

/**
 * 使用同步方法解决实现Runnable接口的线程安全问题。
 *
 * @author lhang
 * @create 2019-06-10 8:11
 */
class Window3 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private synchronized void show() {//同步
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

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 window3 = new Window3();

        Thread t1 = new Thread(window3);
        Thread t2 = new Thread(window3);
        Thread t3 = new Thread(window3);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t3.start();
        t1.start();
        t2.start();


    }
}