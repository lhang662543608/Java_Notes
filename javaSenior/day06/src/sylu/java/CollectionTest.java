package sylu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection接口中声明的方法的测试
 *
 * 结论：
 * 向Collection接口的实现类的对象中添加数据obj时，要求obj所在的类要重写equals()方法。
 *
 * @author lhang
 * @create 2019-06-19 9:09
 */
public class CollectionTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();//ArrayList 有序的 可重复的

        coll.add(123);
        coll.add(456);
        coll.add(new java.lang.String("haha"));
        coll.add(false);
        coll.add(new Person("jerry", 20));

        //contains(Object obj):判断当前集合是否包含obj
        //我们在判断调用时会调用obj对象所在类的equals()
        boolean contains = coll.contains(123);
        System.out.println(contains);//true
        System.out.println(coll.contains(new String("haha")));//true
        System.out.println(coll.contains(new Person("jerry", 20)));//false ---(重写equals方法)----->true

        //2.containsAll(Collection coll1):判断形参coll1中所有的元素是否都存在于当前集合中。
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.contains(coll1));//true
    }

    @Test
    public void test2(){
        //3.remove(Object obj):从当前集合中删除obj元素。
        Collection coll = new ArrayList();//ArrayList 有序的 可重复的

        coll.add(123);
        coll.add(456);
        coll.add(new String("haha"));
        coll.add(false);
        coll.add(new Person("jerry", 20));

        coll.remove(1234);
        System.out.println(coll);//true

        coll.remove(new Person("jerry", 20));
        System.out.println(coll);//false ----(重写equals方法)----> true

        //4.removeAll(Collection coll1): 从当前集合中移除coll1中的所有元素(差集)。
        Collection coll1 = Arrays.asList(123,456);
        coll.removeAll(coll1);
        System.out.println(coll);
    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();//ArrayList 有序的 可重复的

        coll.add(123);
        coll.add(456);
        coll.add(new String("haha"));
        coll.add(false);
        coll.add(new Person("jerry", 20));

        //5.retainAll(Collection coll1):交集获取当前集合与coll1集合的交集，并返回给当前集合。
        Collection coll1 = Arrays.asList(123,456,789);
        coll.retainAll(coll1);
        System.out.println(coll);
    }

    @Test
    public void test4(){
        Collection coll = new ArrayList();//ArrayList 有序的 可重复的

        coll.add(123);
        coll.add(456);
        coll.add(new String("haha"));
        coll.add(false);
        coll.add(new Person("jerry", 20));

        Collection coll1 = new ArrayList();//ArrayList 有序的 可重复的

        coll1.add(456);

        coll1.add(123);

        coll1.add(new String("haha"));
        coll1.add(false);
        coll1.add(new Person("jerry", 20));
        //6.equals(Object obj):要想返回true，需要当前集合和形参集合的元素都<em>相同</em>。
        System.out.println(coll.equals(coll1));//false
    }
    @Test
    public void test5(){
        Collection coll = new ArrayList();//ArrayList 有序的 可重复的

        coll.add(123);
        coll.add(456);
        coll.add(new String("haha"));
        coll.add(false);
        coll.add(new Person("jerry", 20));

        //7.hashCode():返回当前对象的哈希值。
        System.out.println(coll.hashCode());

        //8.集合---->数组：toArray()
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //拓展：数组---->集合
        List<String> list = Arrays.asList(new String[]{"AA", "bb", "CC"});
        System.out.println(list);

        List arr1 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr1.size());//1

        List arr2 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(arr2.size());//2

        //9.iterator():返回Iterator接口的实例，用于遍历集合元素。放在IteratorTest.java中测试


    }

}
