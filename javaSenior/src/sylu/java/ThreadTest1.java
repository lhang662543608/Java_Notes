package sylu.java;

/**
 * 创建多线程的方式二：实现runnable接口。
 * 1.创建一个实现了runnable接口的类。
 * 2.实现去实现Runanble中的抽象方法。run()
 * 3.创建实现类的对象。
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象。
 * 5.通过Thread类的对象调用start()方法。
 *
 *
 * 比较线程的两种创建方式：
 *     开发中：优先选择：实现Runanble接口的方式。
 *     原因：1.实现的方式没有类的单继承性的局限性。
 *          2.实现的方式更适合处理多个线程共享数据的情况。
 *
 *  联系：public class Thread implements Runanble
 *  相同点：两种方式都需要重写run()方法，将线程要执行的逻辑声明在run()方法中。
 *
 *
 * @author lhang
 * @create 2019-06-08 17:11
 */
//1.创建一个实现了runnable接口的类。
class MThread implements Runnable{
    //2.实现去实现Runanble中的抽象方法。run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i %2 ==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        //3.创建实现类的对象。
        MThread mThread = new MThread();
        //4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象。
        Thread thread = new Thread(mThread);
        //5.通过Thread类的对象调用start()方法。①启动当前线程②调用当前线程的run()方法。
        thread.start();

        //再启动一个线程，遍历100以内的偶数。
        Thread thread1 = new Thread(mThread);
        thread1.start();

    }
}
