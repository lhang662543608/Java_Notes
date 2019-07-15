package StringRelationClassExer.StringBufferTest;

import org.junit.Test;




/**
 * @author lhang
 * @create 2019-07-11 16:39
 */
public class StringBufferTest {
    /*
    StringBuffer对象的创建：
    StringBuffer类不同于String，其对象必须用构造器创建生成。有三个构造器：
        StringBuffer()：字符容量为16的字符串缓冲区
        StringBuffer(int size)：构造指定容量的字符串缓冲区
        StringBuffer(String str)：将内容初始化为指定字符串内容
     */
    @Test
    public void test1(){
        StringBuffer buff1 = new StringBuffer();//字符容量为16的字符串缓冲区
        StringBuffer buff2 = new StringBuffer("Hello");//将内容初始化为指定字符串内容，字符串缓冲区容量为"Hello".length()+16
        StringBuffer buff3 = new StringBuffer(10);//构造字符容量为10的字符串缓冲区
    }
    /*
    StringBuffer常用方法：
    StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
    StringBuffer delete(int start,int end)：删除指定位置的内容
    StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
    StringBuffer insert(int offset, xxx)：在指定位置插入xxx
    StringBuffer reverse() ：把当前字符序列逆转

    public int indexOf(String str)
    public String substring(int start,int end)
    public int length()
    public char charAt(int n )
    public void setCharAt(int n ,char ch)
     */
    @Test
    public void test2(){
        StringBuffer sBuffer = new StringBuffer();

        sBuffer.append("Hello");
        sBuffer.append(false);
        sBuffer.append(new char[]{'j','a','v','a'});
        sBuffer.append('!');
        sBuffer.append(5);
        sBuffer.append(5.20);

        System.out.println(sBuffer);//Hellofalsejava!55.2

        sBuffer.replace(5,10,"World");
        System.out.println(sBuffer);//HelloWorldjava!55.2

        sBuffer.delete(5,10);
        System.out.println(sBuffer);//Hellojava!55.2

        sBuffer.insert(5,"World");
        System.out.println(sBuffer);//HelloWorldjava!55.2

        sBuffer.reverse();
        System.out.println(sBuffer);//2.55!avajdlroWolleH

        int x = sBuffer.indexOf("H");
        System.out.println(x);//18

        String substring = sBuffer.substring(0, 4);
        System.out.println(substring);//2.55

        System.out.println(sBuffer.length());//19

        char c = sBuffer.charAt(0);
        System.out.println(c);//2

        sBuffer.setCharAt(0,'3');
        System.out.println(sBuffer);//3.55!avajdlroWolleH


    }

    /**
     * 测试题：
     */
    @Test
    public void test3(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//null
        /*StringBuffer sb1 = new StringBuffer(str);*//*err:java.lang.NullPointerException*//*
        System.out.println(sb1);//*/
    }

}
