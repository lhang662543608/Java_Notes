package chapter6_5;

/**
 * 具体建造者
 *
 * @author lhang
 * @create 2019-10-13 13:01
 */
public class FullModeBuilder extends ModeBuilder {
    @Override
    public void buildMenu() {
        videoSoft.setMenu("完整模式下的菜单");
    }

    @Override
    public void buildMainWindow() {
        videoSoft.setMainWindow("完整模式的主窗口");
    }

    @Override
    public void buildController() {
        videoSoft.setController("完整模式的控制条");
    }

    @Override
    public void buildCollectList() {
        videoSoft.setCollectList(null);
    }

    @Override
    public void buildPlayList() {
        videoSoft.setPlayList("完整模式的播放列表");
    }
}
