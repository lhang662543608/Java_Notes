package chapter6_5;

/**
 * 产品类
 * @author lhang
 * @create 2019-10-13 12:26
 */
public class VideoSoft {
        private String menu;
        private String mainWindow;
        private String controller;
        private String collectList;
        private String playList;

    @Override
    public String toString() {
        return "VideoSoft{" +
                "menu='" + menu + '\'' +
                ", mainWindow='" + mainWindow + '\'' +
                ", controller='" + controller + '\'' +
                ", collectList='" + collectList + '\'' +
                ", playList='" + playList + '\'' +
                '}';
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getCollectList() {
        return collectList;
    }

    public void setCollectList(String collectList) {
        this.collectList = collectList;
    }
}
