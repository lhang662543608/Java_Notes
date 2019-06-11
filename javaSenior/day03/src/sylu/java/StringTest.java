package sylu.java;

import org.junit.Test;

/**
 * String 的使用
 *
 * @author lhang
 * @create 2019-06-11 9:49
 */
public class StringTest {
    /*
    结论：
    1.常量与常量的拼接结果在常量池中。且常量池不会存在相同内容的常量。
    2.只要有一个是变量，结果就在堆中。
     */
    @Test
    public void test3() {
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";

        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;
        String s8 = s7.intern();//返回值得到的s8使用的常量值中已经存在的“javaEEhadoop”
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

        System.out.println(s3 == s8);//true
    }

    /*
    String的实例化
    方式一：通过字面量定义的方式
    方式二：通过new+构造器的方式

        面试题：String s = new String("abc");方式创建对象，在内存中创建了几个对象？
            两个：一个是堆空间中new结构，另一个是char[]对应的常量池中的数据。
     */
    @Test
    public void test2() {
        //此时的s1和s2的数据javaEE声明在方法区中字符串常量池中。
        //通过字面量定义的方式，此时的s1和s2的数据javaEE声明在方法区中的字符串常量池中。
        String s1 = "javaEE";
        String s2 = "javaEE";
        //通过new+构造器的方式：此时的s3和s4保存的地址值，是数据在堆空间中开辟空间后对应的地址值。
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println("********************");
        Person p1 = new Person("tom", 12);
        Person p2 = new Person("tom", 12);
        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true
    }


    /*
    String : 字符串，使用一对""来表示
    1.String声明为final的，不可被继承。
    2.String实现了Serializable接口：表示字符串是支持序列化的。
            实现了compareable接口：表示字符串是可以表交大小的。
    3.String内部定义了final char[] value 用于存储字符串数据。
    4.String代表一个比克变得字符序列。简称不可变的特性。
        体现：1.当对字符串重新赋值，需要重写指定内存区域赋值，不能使用原有的value进行赋值。
              2.对现有的字符串进行连接操作时，需要重新指定内存区域赋值，能使用原有的value进行赋值。
              3.当调用String的replace()方法修改字符或字符串时，也需要在指定的内存区域赋值，不能使用原有的value进行赋值。
    5.通过字面量的方式(区别于new)给一个字符串赋值，此时的字符串值声明在字符串常量池中。
    6.字符串常量池中是不会存在相同内容的字符串的。
     */
    @Test
    public void test1() {
        String s1 = "abc";//字面量
        String s2 = "abc";
//        s1 = "hello";

        System.out.println(s1 == s2);//比较s1和s2的地址值。

        System.out.println(s1);//hello
        System.out.println(s2);//abc
        System.out.println("*************");
        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);//abcdef
        System.out.println(s2);
        System.out.println("****************");
        String s4 = "abc";
        String s5 = s4.replace("a", "m");
        System.out.println(s4);
        System.out.println(s5);
    }
}
