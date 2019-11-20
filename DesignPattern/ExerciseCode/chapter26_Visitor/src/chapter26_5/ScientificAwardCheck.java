package chapter26_5;

/**
 * @author lhang
 * @create 2019-11-20 15:30
 */
public class ScientificAwardCheck extends AwardCheck {
    @Override
    public void visit(Teacher teacher) {
        if (teacher.getPaperAmount() > 10) {
            System.out.println("该教师的符合“科研奖”评选资格，论文数为" + teacher.getPaperAmount());
        } else {
            System.out.println("该教师的论文数为" + teacher.getPaperAmount() + "不符合“科研奖”评选资格!");
        }
    }

    @Override
    public void visit(Student student) {
        if (student.getPaperAmount() > 2) {
            System.out.println("该学生的符合“科研奖”评选资格，论文数为" + student.getPaperAmount());
        } else {
            System.out.println("该学生的论文数为" + student.getPaperAmount() + "不符合“科研奖”评选资格!");
        }
    }
}
