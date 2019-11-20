package chapter22_5;

/**
 * @author lhang
 * @create 2019-11-18 21:35
 */
public class Teacher implements Observer {
    private String teacherName;
    private Department department;
    public Teacher(String teacherName,Department department){
        this.teacherName =teacherName;
        this.department = department;
        department.attach(this);
    }
    @Override
    public void change() {
        System.out.println(teacherName+department.getDepartmentName());
    }
}
