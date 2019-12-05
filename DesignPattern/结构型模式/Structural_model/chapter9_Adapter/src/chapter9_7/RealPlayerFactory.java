package chapter9_7;

/**
 * @author lhang
 * @create 2019-10-24 19:36
 */
public class RealPlayerFactory implements PlayerFactory {
    @Override
    public MainWindow createMainWindow() {
        return new RealPlayerAPI().getRealPlayerWindow();
    }

    @Override
    public PlayerList createPlayerList() {
        return new RealPlayerAPI().getRealPlayerList();
    }
}
