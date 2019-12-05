package chapter23_6;

/**
 * @author lhang
 * @create 2019-11-19 10:34
 */
public abstract class RoleState {
    protected PlayerRole role;
    protected int point; //积分
    protected String grade; //等级

    public abstract void play(int score, String result);

    public abstract void doubleScore(int score, String result);

    public abstract void changeCards();

    public abstract void peekCards();

    public abstract void check();
}
