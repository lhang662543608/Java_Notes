package sylu.java;

/**
 * ex:创建三个窗口卖票，总数为100张。使用Thead类的方式实现。
 *
 * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器。可以考虑使用当前类使用同步监视器。
 *
 * 使用同步代码块解决继承Thread类的方式的线程安全问题。
 * @author lhang
 * @create 2019-06-10 7:37
 */
class Window2 extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true){
                //错误的：此时的this代表着t1，t2，t3三个对象。
                 //synchronized (this){
            //正确的
//            synchronized (obj){
            synchronized (Window2.class){//Class clazz = Window2.class;Window2.class只会加载一次
                if(ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+"卖票，票号为："+ ticket);
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();

    }
}