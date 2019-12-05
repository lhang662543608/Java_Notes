package chapter19_5;

import java.util.Comparator;

/**
 * @author lhang
 * @create 2019-11-17 16:49
 */
public class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Student s1 = (Student) obj1;
        Student s2 = (Student) obj2;
        if (s1.getsAge() < s2.getsAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
