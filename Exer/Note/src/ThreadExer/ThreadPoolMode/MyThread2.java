package ThreadExer.ThreadPoolMode;

/**
 * @author lhang
 * @create 2019-07-07 21:13
 */

/*

创建实现Runnable接口类，实现输出2000-3000以内的奇数的功能。

 */
public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 20000; i < 30000; i++) {
            if (i % 2 != 0) {
                if (i==25001){
                    try {
                        Thread.sleep(1*60*1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+":——" + i + "——");
            }
        }
    }
}
