package chapter19_5;

/**
 * 某教务管理系统中一个班级（Class）包含多个学生（Student），使用java内置迭代器实现对学生信息的遍历，
 * 要求按学生年龄由大到小的次序输出学生信息。
 *
 * @author lhang
 * @create 2019-11-17 16:35
 */
public class Client {
    public static void main(String[] args) {
        Class obj = new Class();
        Student student1, student2, student3, student4;
        student1 = new Student("杨过", 20, "男");
        student2 = new Student("令狐冲", 22, "男");
        student3 = new Student("小龙女", 18, "女");
        student4 = new Student("王语嫣", 19, "女");
        obj.addStudent(student1);
        obj.addStudent(student2);
        obj.addStudent(student3);
        obj.addStudent(student4);
        obj.displayStudents();
    }
}
