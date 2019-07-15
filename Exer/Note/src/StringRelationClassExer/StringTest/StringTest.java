package StringRelationClassExer.StringTest;


import org.junit.Test;

/**
 * @author lhang
 * @create 2019-07-09 17:42
 */
public class StringTest {

    /*
    String的特性
    1.Java程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
    2.String是一个final类，代表不可变的字符序列。
    3.字符串是常量，用双引号引起来表示。它们的值在创建之后不能更改。
    4.String对象的字符内容是存储在一个字符数组value[]中的
    String s1 = "abc";//字面量的定义方式
     */

    //String对象的创建
    @Test
    public void test1() {
        String s1 = "haha";//"haha"

        String s2 = new String();//""

        String s3 = new String(s1);//"haha"

        char[] a = new char[]{'H', 'e', 'l', 'l', 'o'};
        String s4 = new String(a);//"Hello"

        String s5 = new String(a, 0, 2);//"He"

        System.out.println(">" + s1 + "<");
        System.out.println(">" + s2 + "<");
        System.out.println(">" + s3 + "<");
        System.out.println(">" + s4 + "<");
        System.out.println(">" + s5 + "<");


    }

    @Test
    public void test2() {

        String s1;//未初始化

        String s2 = "";//""

        String s3 = null;//"null"

        String s4 = new String();//""

        String s5 = new String("");//""

//        System.out.println("s1"+s1+"s1");
        System.out.println(">" + (s2.equals("")) + "<");//true
//        System.out.println(">" + (s3.equals(null)) + "<");//NullPointerException
        System.out.println(">" + (s2 == "") + "<");//true
        System.out.println(">" + (s2 == null) + "<");//false
        System.out.println(">" + (s3 == null) + "<");//true
        System.out.println(">" + (s3 == "") + "<");//false

        System.out.println(">" + ("".equals(s4)) + "<");//true
        System.out.println(">" + ("".equals(s5)) + "<");//true
        System.out.println(">" + (s4.intern() == "") + "<");//true
        System.out.println(">" + (s5.intern() == "") + "<");//true
        System.out.println(">" + (s4 == "") + "<");//false
        System.out.println(">" + (s5 == "") + "<");//false



    }

    @Test
    public void test3() {
        Person p1 = new Person();
        p1.name = new String("atguigu");//构造函数创建

        Person p2 = new Person();
        p2.name = "atguigu";//字面量方式创建

        System.out.println(p1.name.equals(p2.name)); //true

        System.out.println(p1.name == p2.name); //false

        System.out.println(p1.name == "atguigu"); //false

        String s1 = new String("bcde");
        String s2 = new String("bcde");
        System.out.println(s1 == s2);//false
    }

    @Test
    public void test4() {
        /*结论：
         * 常量与常量的拼接结果在常量池。且常量池中不会存在相同内容的常量。
         * 只要其中有一个是变量，结果就在堆中
         * 如果拼接的结果调用intern()方法，返回值就在常量池中
         */
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello" + "World";
        String s4 = s1 + "World";
        String s5 = s1 + s2;
        String s6 = (s1 + s2).intern();

        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s4 == s5);//false
        System.out.println(s3 == s6);//true

    }

}

