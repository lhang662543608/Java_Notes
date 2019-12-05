package chapter9_7;

/**
 * @author lhang
 * @create 2019-10-24 19:36
 */
public class MediaPlayerFactory implements PlayerFactory{
    @Override
    public MainWindow createMainWindow() {
        return new MediaPlayerAPI().getMediaPlayerWindow();
    }

    @Override
    public PlayerList createPlayerList() {
        return new MediaPlayerAPI().getMediaPlayerList();
    }
}
