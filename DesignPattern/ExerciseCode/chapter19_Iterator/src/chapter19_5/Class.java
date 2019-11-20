package chapter19_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author lhang
 * @create 2019-11-17 16:43
 */
public class Class {
    private ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        Comparator comp = new MyComparator();
        Collections.sort(students, comp);
        Iterator<Student> i = students.iterator();
        while (i.hasNext()) {
            Student student = i.next();
            System.out.println(" 姓 名 ： " + student.getsName() + " ， 年 龄 ： " +
                    student.getsAge());
        }
    }
}

