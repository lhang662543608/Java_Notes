package chapter9_7;

/**
 * @author lhang
 * @create 2019-10-24 19:31
 */
public class RealPlayerAPI implements MainWindow,PlayerList{
    private RealPlayerWindow realPlayerWindow;
    private RealPlayerList realPlayerList;

    public RealPlayerAPI() {
        realPlayerWindow = new RealPlayerWindow();
        realPlayerList = new RealPlayerList();
    }

    public RealPlayerWindow getRealPlayerWindow() {
        return realPlayerWindow;
    }

    public RealPlayerList getRealPlayerList() {
        return realPlayerList;
    }

    @Override
    public void show() {
        realPlayerWindow.show();
    }

    @Override
    public void play() {
        realPlayerList.play();
    }
}
