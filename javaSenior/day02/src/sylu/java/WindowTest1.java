package sylu.java;

/**
 * ex:创建三个窗口卖票，总数为100张。使用实现Runnable接口的方式。、
 * 存在线程安全问题，待解决。
 *
 * 1.问题：卖票过程中出现了重票和错票。-->出现了线程的安全问题。
 * 2.出现的原因:当某个线程操作车票的过程中，尚未操作完成，其他线程也参与进来，也操作车票。
 * 3.如何解决：当一个线程a在操作ticket的时候，其他线程不能参与进来，直到线程a操作完ticket时，
 *      其他线程才可以开始操作ticket。这种情况即使a出现阻塞也不能被改变。
 * 4.在java中，我们通过同步机制，来解决线程安全问题。
 *
 *方式一：同步代码块
 *      synchronized(同步监视器){
 *          //需要被同步的代码
 *      }
 *    说明：1.操作共享数据的代码，即需要被同步的代码。
 *          2.共享数据：多个线程共同操作的变量。比如：ticket就是共享数据。
 *          3.同步监视器：俗称，锁。任何一个类的对象都可以充当锁。
 *              要求：多个线程必须要共用一把锁。
 *
 *          补充：在实现Runnable接口创建多线程的过程中，我们可以考虑使用this充当同步监视器。
 *
 * 方式二：同步方法
 *      如果操作共享数据的代码完整的声明在一个方法中，我们不妨将次方法声明为同步的。
 *
 * 5.同步的方式，解决了线程的安全问题。--->好处
 *   操作同步代码是只能有一个线程参与，其他线程的等待。相当于单线程的过程，效率低。--->局限性
 * @author lhang
 * @create 2019-06-08 17:27
 */
class Window1 implements Runnable{
//    Object obj =  new Object();
//    Dog dog = new Dog();
    private  int ticket = 100;

    @Override
    public void run() {
        while (true){
            synchronized (this){//此时的this：唯一的window1的对象 //方式二：synchronized (dog) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
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
class Dog{

}