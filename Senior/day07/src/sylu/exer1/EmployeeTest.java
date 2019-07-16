package sylu.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章：
 * TreeSet 需使用泛型来定义）
 * 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 * 1). 使 Employee 实现 Comparable 接口，并按 name 排序
 * 2). 创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序。
 *
 * @author lhang
 * @create 2019-06-22 10:57
 */
public class EmployeeTest {
    //使用生日日期的先后顺序。
    @Test
    public void Test2() {
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof  Employee && o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();

                    //方式一：
//                    //比较年
//                    int minusYear = b1.getYear() - b2.getYear();
//                    if (minusYear!=0){
//                        return minusYear;
//                    }
//
//                    //比较月
//                    int minusMonth = b1.getMonth() - b2.getMonth();
//                    if (minusMonth!=0){
//                        return minusMonth;
//                    }
//                    //比较日
//                    return b1.getDay()-b2.getDay();

                    //方式二
                    return b1.compareTo(b2);
                }
                throw new RuntimeException("输入的类型错误！");
            }
        });
        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 10, 4));
        Employee e2 = new Employee("liming", 53, new MyDate(1967, 2, 4));
        Employee e3 = new Employee("zhangxueyou", 61, new MyDate(1959, 5, 3));
        Employee e4 = new Employee("liangchaowei", 57, new MyDate(1963, 8, 4));
        Employee e5 = new Employee("guofucheng", 58, new MyDate(1962, 4, 8));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //使用自然排序
    @Test
    public void Test1() {
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 10, 4));
        Employee e2 = new Employee("liming", 53, new MyDate(1967, 2, 4));
        Employee e3 = new Employee("zhangxueyou", 61, new MyDate(1959, 5, 3));
        Employee e4 = new Employee("liangchaowei", 57, new MyDate(1963, 8, 4));
        Employee e5 = new Employee("guofucheng", 58, new MyDate(1962, 4, 8));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
