package chapter26_5;

/**
 * @author lhang
 * @create 2019-11-20 15:30
 */
public class ExcellenceAwardCheck extends AwardCheck {
    @Override
    public void visit(Teacher teacher) {
        if (teacher.getFeedbackScore() >= 90) {
            System.out.println("该教师的符合“成绩优秀奖”评选资格，反馈成绩为" + teacher.getFeedbackScore());
        } else {
            System.out.println("该教师反馈成绩为" + teacher.getFeedbackScore() + ",不符合“成绩优秀奖”评选资格!");
        }
    }

    @Override
    public void visit(Student student) {
        if (student.getScore() >= 90) {
            System.out.println("该学生的符合“成绩优秀奖”评选资格，平均成绩为" + student.getScore());
        } else {
            System.out.println("该学生的平均成绩为" + student.getScore() + ",不符合“成绩优秀奖”评选资格!");

        }
    }
}
