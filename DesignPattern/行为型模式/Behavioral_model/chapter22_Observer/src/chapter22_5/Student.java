package chapter22_5;

/**
 * @author lhang
 * @create 2019-11-18 21:37
 */
public class Student implements Observer {
    private String stuName;
    private Department department;

    public Student(String name, Department department) {
        this.stuName = name;
        this.department = department;
        department.attach(this);
    }

    @Override
    public void change() {
        System.out.println(this.stuName + this.department.getDepartmentName());
    }
}
