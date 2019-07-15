package ThreadExer.ImplementsCallableMode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author lhang
 * @create 2019-07-08 16:31
 */
public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        Mythread1 mythread1 = new Mythread1();
        Mythread2 mythread2 = new Mythread2();

        //4.将此Callable接口实现类的对象作为传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask1 = new FutureTask(mythread1);
        FutureTask futureTask2 = new FutureTask(mythread2);

        //5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
        Thread thread1 = new Thread(futureTask1);
        Thread thread2 = new Thread(futureTask2);

        thread1.setName("线程1");
        thread2.setName("线程2");

        thread1.start();
        thread2.start();

        //6.获取Callable中call方法的返回值
        //get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值。
        try {
            Object sum1 = futureTask1.get();
            Object sum2 = futureTask2.get();
            System.out.println("**" + sum1);
            System.out.println("——" + sum2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
