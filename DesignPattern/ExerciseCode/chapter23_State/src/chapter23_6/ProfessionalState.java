package chapter23_6;

/**
 * @author lhang
 * @create 2019-11-19 10:38
 */
public class ProfessionalState extends RoleState {
    public ProfessionalState(RoleState state) {
        super();
        this.point = state.point;
        this.grade = "高手级";
        this.role = state.role;
    }

    @Override
    public void play(int score, String result) {
        this.doubleScore(score, result);
        this.check();
    }

    @Override
    public void doubleScore(int score, String result) {
        if (result.equalsIgnoreCase("win")) //获胜
        {
            this.point += (2 * score);
            System.out.println("玩家" + this.role.getNickname() + "获胜，增加积分" +
                    (2 * score) + "，当前积分为" + this.point + "。");
        } else if (result.equalsIgnoreCase("lose")) //失利
        {
            this.point -= score;
            System.out.println("玩家" + this.role.getNickname() + "失利，减少积分" +
                    score + "，当前积分为" + this.point + "。");
        }
    }

    @Override
    public void changeCards() {
        System.out.println("玩家" + this.role.getNickname() + "更换纸牌");
    }

    @Override
    public void peekCards() {
        System.out.println("暂不支持该功能！");
    }

    @Override
    public void check() {
        if (this.point >= 10000) {
            this.role.setState(new FinalState(this));
        } else if (this.point >= 1000 && this.point < 5000) {
            this.role.setState(new SecondaryState(this));
        } else if (this.point < 1000) {
            this.role.setState(new PrimaryState(this));
        }


    }
}
