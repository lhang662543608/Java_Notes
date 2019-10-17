package chapter6_5;

/**
 * @author lhang
 * @create 2019-10-13 13:07
 */
public class SimpleModeBuilder extends ModeBuilder {
    @Override
    public void buildMenu() {
        videoSoft.setMenu(null);
    }

    @Override
    public void buildMainWindow() {
        videoSoft.setMainWindow("精简模式下的主窗口");
    }

    @Override
    public void buildController() {
        videoSoft.setController("精简模式下的控制条");
    }

    @Override
    public void buildCollectList() {
        videoSoft.setCollectList(null);
    }

    @Override
    public void buildPlayList() {
        videoSoft.setPlayList(null);
    }
}
