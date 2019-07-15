package javaComparable.javaLangComparable;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 在Java中经常会涉及到对象数组的排序问题，那么就涉及到对象之间的比较问题。
 * Java实现对象排序的方式有两种：
      自然排序： java.lang.Comparable
      定制排序： java.util.Comparator

 Comparable 的典型实现： (默认都是从小到大排列的)
     String：按照字符串中字符的Unicode值进行比较
     Character：按照字符的Unicode值来进行比较
     数值类型对应的包装类以及BigInteger、 BigDecimal：按照它们对应的数值大小进行比较
     Boolean： true 对应的包装类实例大于 false 对应的包装类实例
     Date、 Time等：后面的日期时间比前面的日期时间大
 * @author lhang
 * @create 2019-07-13 19:47
 */

public class ComparableTest {
    /*
    Comparable接口的使用举例：  自然排序
    1.像String、包装类等实现了Comparable接口，重写了compareTo(obj)方法，给出了比较两个对象大小的方式。
    2.像String、包装类重写compareTo()方法以后，进行了从小到大的排列
    3. 重写compareTo(obj)的规则：
        如果当前对象this大于形参对象obj，则返回正整数，
        如果当前对象this小于形参对象obj，则返回负整数，
        如果当前对象this等于形参对象obj，则返回零。
    4. 对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，重写compareTo(obj)方法。
       在compareTo(obj)方法中指明如何排序
     */
    @Test
    public void test1(){
        String[] arr = new String[]{"AA","CC","KK","MM","GG","JJ","DD"};
        //
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test2(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lenovoMouse",34);
        arr[1] = new Goods("dellMouse",43);
        arr[2] = new Goods("xiaomiMouse",12);
        arr[3] = new Goods("huaweiMouse",65);
        arr[4] = new Goods("microsoftMouse",43);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }


}
