package ThreadExer.ThreadPoolMode;

/**
 * @author lhang
 * @create 2019-07-08 17:58
 */
/*

创建实现Runnable接口类，实现输出3000-4000以内的偶数的功能。

 */
public class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 30000; i < 40000; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName() + ":##" + i + "##");
            }
        }
    }
}
