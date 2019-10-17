package chapter6_5;

/**
 * @author lhang
 * @create 2019-10-13 13:10
 */
public class ScreenModeController {
    private ModeBuilder mb;

    public void setModeBuilder(ModeBuilder mb) {
        this.mb = mb;
    }

    public VideoSoft construct(){
        mb.buildMenu();
        mb.buildMainWindow();
        mb.buildController();
        mb.buildCollectList();
        mb.buildPlayList();
        return mb.getVideoSoft();
    }

}
