package chapter9_7;

/**
 * Windows media player 和 RealPlayer是两种常用的媒体播放器，它们的API结构和调用方法存在区别。
 * 现在你的应用领域需要支持这两种播放器的API，而且在将来可能还需要支持新的媒体播放器，请问如何设计该应用程序？
 *
 * @author lhang
 * @create 2019-10-24 19:11
 */
public class Client {
    public static void main(String[] args) {
        MainWindow mainWindow;
        PlayerList playerList;
        PlayerFactory factory;

//        factory = new MediaPlayerFactory();
//        factory = new RealPlayerFactory();
        factory = (PlayerFactory) XMLUtil.getFactory();
        mainWindow = factory.createMainWindow();
        playerList = factory.createPlayerList();

        mainWindow.show();
        playerList.play();
    }
}
