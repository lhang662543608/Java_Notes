package ThreadExer.ImplementsCallableMode;

import java.util.concurrent.Callable;

/**
 * 创建线程的方式三：实现Callable接口。 --- JDK 5.0新增
 * <p>
 * 如何理解实现Callable接口的方式创建多线程比实现Runnable接口创建多线程方式强大？
 * 1. call()可以有返回值的。
 * 2. call()可以抛出异常，被外面的操作捕获，获取异常的信息
 * 3. Callable是支持泛型的
 *
 * @author lhang
 * @create 2019-07-08 16:24
 */
/*
功能：创建一个实现Callable接口的类，实现输出1000以内的偶数，并将偶数之和作为返回值。
 */
//1.创建一个实现Callable的实现类
public class Mythread1 implements Callable {
    //2.实现call方法，将此线程需要执行的操作声明在call()中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "**" + i + "**");
                sum += i;
            }
        }
        return sum;
    }
}
