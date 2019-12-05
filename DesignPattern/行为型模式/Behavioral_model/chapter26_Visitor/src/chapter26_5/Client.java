package chapter26_5;

/**
 * 某软件公司要为某高校开发一套奖励审批系统，该系统可以实现教师奖励和学生奖励的审批（Award Check），
 * 如果教师发表论文数超过10篇或者学生论文数超过两篇就可以评选科研奖，如果教师教学反馈分大于等于90分或者学生平均成绩大于等于90分可以评选成绩优秀奖。
 * 试使用访问者设计模式设计并实现该系统，以判断候选人集合中的教师或学生是否符合某种获奖要求。
 *
 * @author lhang
 * @create 2019-11-20 15:18
 */
public class Client {
    public static void main(String[] args) {
        CandidateList list = new CandidateList();

        Teacher teacher = new Teacher();
        teacher.setFeedbackScore(88);
        teacher.setPaperAmount(12);
        Student student = new Student();
        student.setScore(92);
        student.setPaperAmount(1);

        list.addPerson(student);
        list.addPerson(teacher);

        AwardCheck scientificAwardCheck = new ScientificAwardCheck();
        AwardCheck excellenceAwardCheck = new ExcellenceAwardCheck();

        list.accept(scientificAwardCheck);
        list.accept(excellenceAwardCheck);

    }
}
