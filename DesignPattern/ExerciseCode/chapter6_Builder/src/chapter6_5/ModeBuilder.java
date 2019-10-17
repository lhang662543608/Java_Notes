package chapter6_5;

/**
 * 抽象建造者
 * @author lhang
 * @create 2019-10-13 12:57
 */
public abstract class ModeBuilder {
    protected VideoSoft videoSoft =new VideoSoft();
    public abstract void buildMenu();
    public abstract void buildMainWindow();
    public abstract void buildController();
    public abstract void buildCollectList();
    public abstract void buildPlayList();
    public VideoSoft getVideoSoft(){
        return videoSoft;
    }
}
