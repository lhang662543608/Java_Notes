package sylu.java;

/**
 * ex:创建三个窗口卖票，总数为100张。使用实现Runnable接口的方式。、
 * 存在线程安全问题，待解决。
 * @author lhang
 * @create 2019-06-08 17:27
 */
class Window1 implements Runnable{
    private  int ticket = 100;
    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName()+"卖票，票号为："+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 window1 = new Window1();

        Thread t1 = new Thread(window1);
        Thread t2 = new Thread(window1);
        Thread t3 = new Thread(window1);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t3.start();
        t1.start();
        t2.start();


    }
}
