package ThreadExer.ImplementsCallableMode;

import java.util.concurrent.Callable;

/**
 * @author lhang
 * @create 2019-07-08 16:30
 */
/*
功能：创建一个实现Callable接口的类，实现输出1000以内的奇数，并将奇数之和作为返回值。
 */
//1.创建一个实现Callable的实现类
public class Mythread2 implements Callable {
    //2.实现call方法，将此线程需要执行的操作声明在call()中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + "——" + i + "——");
                sum += i;
            }
        }
        return sum;
    }
}

