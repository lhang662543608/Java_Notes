package chapter15_7;

/**
 * 某软件公司要开发一款基于C/S的网络图片查看器，
 * 具体功能描述如下：
 * 用户只需在图片查看器上输入网页URL，程序会自动将该网页中的所有图片下载到本地，
 * 考虑到有些网页图片比较多，而且某些图片文件比较大，因此先以图标的方式显示图片，不同类型的图片用不同的图标，
 * 并且在图表下面标注该图片的文件名，用户单击图表之后可查看真正的图片。
 * 试使用虚拟代理模式设计并实现图片查看器。
 * （注：可以结合多线程机制，使用一个线程显示小图标，同时启动另一个线程在后台加载原图。）
 * @author lhang
 * @create 2019-10-28 14:50
 */
public class Client {
    public static void main(String[] args) {
        PictureProxy proxy = new PictureProxy();
        proxy.display();
    }
}
