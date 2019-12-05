package chapter15_7;

/**
 * @author lhang
 * @create 2019-10-28 15:04
 */
public class PictureProxy {
    private PictureHandler picture = new PictureHandler();

    public void display() {
        //显示小图标
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("显示小图标");
            }
        });

        //加载真实图片
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                picture.download();
            }
        });
        thread.start();
        thread1.start();

    }


}
