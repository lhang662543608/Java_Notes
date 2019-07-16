package sylu.java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 创建线程的方式四：使用线程池
 *好处：
 * 1.提高响应速度
 * 2.降低资源消耗
 * 3.便于线程管理
 *
 * 创建多线程有几种方式：四种？
 * @author lhang
 * @create 2019-06-10 16:40
 */
class NumberThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
class NumberThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        //1.指定线程池的线程数量
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;

        //设置线程池的属性
        service1.setCorePoolSize(15);



        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口类的实现对象。
        service.execute(new NumberThread());//适用于Runnable接口
        service.execute(new NumberThread1());//适用于Runnable接口
//        service.submit(Callable callable);//适用于Callable接口
        //3.关闭连接池
        service.shutdown();
    }
}
