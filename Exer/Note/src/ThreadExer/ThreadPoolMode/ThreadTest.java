package ThreadExer.ThreadPoolMode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


import static java.lang.Long.*;

public class ThreadTest {
    public static void main(String[] args) {
        //1. 提供指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ThreadPoolExecutor service = (ThreadPoolExecutor) executorService;

        //设置线程池的属性
        /*System.out.println(service.getClass());
        service.setCorePoolSize(15);*/
        service.setKeepAliveTime(Long.MAX_VALUE, TimeUnit.SECONDS);
        service.setCorePoolSize(2);
        service.setMaximumPoolSize(2);


        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        MyThread3 thread3 = new MyThread3();
        MyThread4 thread4 = new MyThread4();
        MyThread5 thread5 = new MyThread5();

        service.execute(thread1);//适合适用于Runnable
        service.execute(thread2);//适合适用于Runnable
        service.execute(thread3);//适合适用于Runnable
        service.execute(thread4);//适合适用于Runnable
        service.execute(thread5);//适合适用于Runnable



//        service.submit(Callable callable);//适合使用于Callable

        //3.关闭连接池
        service.shutdown();
        System.out.println(service.getActiveCount());
        System.out.println(service.getQueue().size());

    }
}
