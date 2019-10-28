package chapter9_7;

/**
 * @author lhang
 * @create 2019-10-24 19:24
 */
public class MediaPlayerAPI implements MainWindow, PlayerList {
    private MediaPlayerWindow mediaPlayerWindow;
    private MediaPlayerList mediaPlayerList;

    public MediaPlayerAPI() {
        mediaPlayerWindow = new MediaPlayerWindow();//实例化成员类
        mediaPlayerList = new MediaPlayerList();//实例化成员类
    }

    public MediaPlayerWindow getMediaPlayerWindow() {
        return mediaPlayerWindow;
    }

    public MediaPlayerList getMediaPlayerList() {
        return mediaPlayerList;
    }

    @Override
    public void show() {
        mediaPlayerWindow.show();
    }

    @Override
    public void play() {
        mediaPlayerList.play();
    }
}
