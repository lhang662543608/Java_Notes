package chapter26_5;

/**
 * @author lhang
 * @create 2019-11-20 15:27
 */
public class Teacher implements Person {
    private int paperAmount;
    private double feedbackScore;

    public int getPaperAmount() {
        return paperAmount;
    }

    public void setPaperAmount(int paperAmount) {
        this.paperAmount = paperAmount;
    }

    public double getFeedbackScore() {
        return feedbackScore;
    }

    public void setFeedbackScore(double feedbackScore) {
        this.feedbackScore = feedbackScore;
    }

    @Override
    public void accept(AwardCheck check) {
        check.visit(this);
    }
}
