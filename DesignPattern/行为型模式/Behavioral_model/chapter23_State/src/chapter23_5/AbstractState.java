package chapter23_5;

/**
 * @author lhang
 * @create 2019-11-19 9:53
 */
public abstract class AbstractState {
    protected ForumAccount acc;
    protected int point;
    protected String stateName;

    public abstract void checkState(int score);

    public abstract void downloadFile(int score);

    public abstract void writeNote(int score);

    public abstract void replyNote(int score);

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
