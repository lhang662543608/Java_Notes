package chapter23_6;

/**
 * @author lhang
 * @create 2019-11-19 10:34
 */
public class PlayerRole {
    private String nickname;
    private RoleState state;
    public PlayerRole(String nickname)
    {
        this.nickname = nickname;
    }
    public String getNickname()
    {
        return this.nickname;
    }
    public void setState(RoleState state)
    {
        this.state = state;
    }
    public void play(int score, String result)
    {
        state.play(score,result);
    }
    public void doubleScore(int score, String result)
    {
        state.doubleScore(score,result);
    }
    public void changeCards()
    {
        state.changeCards();
    }
    public void peekCards()
    {
        state.peekCards();
    }
}
