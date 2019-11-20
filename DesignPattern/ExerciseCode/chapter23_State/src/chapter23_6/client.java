package chapter23_6;

/**
 * 在某纸牌游戏软件中人物角色具有入门级（Primary）、熟练级（Secondary）、高手级（Professional）和骨灰级（Final）4种角色，角色的的等级与其积分相对应，
 * 游戏胜利将增加形影的积分，失败则扣除积分。
 * 入门级具有最基本的游戏功能play()，熟练级增加了游戏胜利积分加倍功能doubleScore()，高手级在熟练级的基础上再增加换牌功能changeCards()，
 * 骨灰级在高手级的基础上在增加偷看他人牌的功能peekCards()。
 * 试使用状态模式来设计该系统，绘制相应的类图并使用java语言编程模拟实现。
 *
 * @author lhang
 * @create 2019-11-19 10:25
 */
public class client {
    public static void main(String[] args) {
        PlayerRole role = new PlayerRole("阿力");
        role.setState(new PrimaryState(role));
        role.play(30, "win");
        role.changeCards();
        role.play(1000, "win");
        role.changeCards();
        role.play(2000, "win");
        role.changeCards();
        role.peekCards();
        role.play(3000, "win");
        role.peekCards();

    }
}
