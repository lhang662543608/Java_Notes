package chapter26_5;

/**
 * @author lhang
 * @create 2019-11-20 15:28
 */
public class Student implements Person {
    private int paperAmount;
    private double score;

    public int getPaperAmount() {
        return paperAmount;
    }

    public void setPaperAmount(int paperAmount) {
        this.paperAmount = paperAmount;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public void accept(AwardCheck check) {
        check.visit(this);
    }
}
