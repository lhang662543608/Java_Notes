package ThreadExer.ImplentsRunnableMode;

/**
 * @author lhang
 * @create 2019-07-07 21:13
 */

/*

创建实现Runnable接口类，实现输出1000以内的奇数的功能。

 */
public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+":——" + i + "——");
            }
        }
    }
}
