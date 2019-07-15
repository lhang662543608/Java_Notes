package ThreadExer.ThreadPoolMode;

/**
 * @author lhang
 * @create 2019-07-08 18:00
 */
/*

创建实现Runnable接口类，实现输出4000-5000以内的奇数的功能。

 */
public class MyThread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 40000; i < 50000; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":$$" + i + "$$");
            }
        }
    }
}
