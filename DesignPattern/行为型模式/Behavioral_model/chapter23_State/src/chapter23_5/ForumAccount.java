package chapter23_5;

/**
 * @author lhang
 * @create 2019-11-19 9:53
 */
public class ForumAccount {
    private AbstractState state;
    private String name;

    public ForumAccount(String name) {
        this.name = name;
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void downloadFile(int score) {
        state.downloadFile(score);
    }

    public void writeNote(int score) {
        state.writeNote(score);
    }

    public void replyNote(int score) {
        state.replyNote(score);
    }
}
