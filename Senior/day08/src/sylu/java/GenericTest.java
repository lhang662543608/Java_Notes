package sylu.java;

import org.junit.Test;

import java.util.*;

/**
 * 泛型的使用：
 * 1.JDK5.0新增的特性。
 *
 * 2.在集合中使用泛型。
 * 总结：
 * ①集合接口和集合类在JDK5.0时都修改为带泛型的结构。
 * ②在实例化集合类可以指明泛型的类型。
 * ③指明完以后，在集合类或接口中凡是定义类或接口时，内部结构(比如：方法，属性，构造器等)使用到类的泛型位置，都指定为实例化时的泛型类型。、
 * 比如:add(E e) --->实例化以后：add(Integer e)
 * ④注意点：泛型的类型必须是一个类。不能是基本数据类型。需要用到基本数据类型的时候，用包装类替换。
 * ⑤如果实例化时没有指明泛型的类型，默认类型为java.lang.Object
 * 3.如何自定义泛型类，泛型接口，泛型方法。见GenericTest1.java
 * @author lhang
 * @create 2019-06-23 10:04
 */
public class GenericTest {
    //在集合中使用泛型之前的情况
    @Test
    public void Test1() {
        ArrayList list = new ArrayList();
        //需求存放学生成绩
        list.add(98);
        list.add(88);
        list.add(89);
        list.add(66);
        list.add(78);
        //问题一：类型不安全
        list.add("Tom");

        for (Object score : list) {
            //问题二：强转时，可能出先ClassCastException异常
            int stuScore = (Integer) score;
            System.out.println(stuScore);

        }
    }

    //在集合中使用泛型的情况:以ArrayList为例
    @Test
    public void Test2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(45);
        list.add(65);
        list.add(75);
        list.add(85);
        //编译时，就会进行类型检查，保证数据安全。
//        list.add("Tom");
        /*for (Integer score : list) {
            //避免了强转操作。
            int stuScore = score;
            System.out.println(stuScore);
        }*/

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer stuScore = iterator.next();
            System.out.println(stuScore);
        }

    }

    //在集合中使用泛型的情况:以HashMap为例
    @Test
    public void Test3() {
//        Map<String, Integer> map = new HashMap<String, Integer>();
        //JDK7新特性：类型推断
        Map<String, Integer> map = new HashMap<>();
        map.put("a",12);
        map.put("b",22);
        map.put("c",12);
        map.put("a",33);

//        map.put(123,"aaa");
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+ "----->"+value);

        }

    }
}
