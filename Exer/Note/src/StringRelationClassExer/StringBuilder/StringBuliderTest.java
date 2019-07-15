package StringRelationClassExer.StringBuilder;

import org.junit.Test;

/**
 * @author lhang
 * @create 2019-07-11 18:25
 */

/*
 String 和 StringBuffer 和 StringBuilder的对比
    String(JDK1.0)：不可变字符序列
    StringBuffer(JDK1.0)：可变字符序列、效率低、线程安全
    StringBuilder(JDK 5.0)：可变字符序列、效率高、线程不安全
注意：作为参数传递的话，方法内部String不会改变其值，StringBuffer和StringBuilder
会改变其值


 */
public class StringBuliderTest {
    @Test
    public void test() {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder("haha");
        StringBuilder builder2 = new StringBuilder(10);
    }
    @Test
    public void test1(){
        StringBuilder builder1 = new StringBuilder();

        System.out.println(builder1.append("sylu456lhang"));//sylu456lhang
        System.out.println(builder1.delete(4, 7));//sylulhang
        System.out.println(builder1.insert(4, 123));//sylu123lhang
        System.out.println(builder1.replace(4, 7, "456"));//sylu456lhang
        System.out.println(builder1.reverse());//gnahl654ulys
    }
}
