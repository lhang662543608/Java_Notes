package sylu.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 涉及到String类与其他结构的相互转换
 *
 * @author lhang
 * @create 2019-06-11 16:22
 */
public class StringTest1 {

    /*
    String 与 byte[]之间的转换

    编码：String ---> byte[]:调用String的getBytes()
    解码：byte[] --->String:调用String的构造器

    编码：字符串-->字节(看得懂-->看不懂的二进制数据)
    解码：编码的逆过程；字节-->字符串(看不懂的二进制数据-->看得懂)

    说明：解码时，要求用的字符集必须与编码时使用的字符集一致。否则会出现乱码。
     */
    @Test
    public void test4(){
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        System.out.println(s1 == s3);//false

        final String s4 = "javaEE";//s4：常量
        String s5 = s4 +"hadoop";
        System.out.println(s1 == s5);//true
    }
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123沈阳";
        byte[] bytes = str1.getBytes();//使用默认的字符集，进行转换
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str1.getBytes("gbk");//使用gbk字符集进行编码
        System.out.println(Arrays.toString(gbks));

        System.out.println("*******************");
        String str2 = new String(bytes);//使用默认的字符集进行解码
        System.out.println(str2);

        String str3 = new String(gbks);
        System.out.println(str3);//出现乱码。原因：编码集合解码集不一致。

        String gbk = new String(gbks, "gbk");
        System.out.println(gbk);//没有出现乱码。原因：编码集合解码集一致。


    }
    /*
    String与char[]之间的转换

    String -->char[]:调用String的toCharArray()
    char[] -->String:调用String的构造器
     */
    @Test
    public  void tets2(){
        String s1 = "abc123";
        char[] charArray = s1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        System.out.println("**********************");

        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);
    }
    /*
    String 与 基本数据类型、包装类之间的转换
    String -->基本数据类型、包装类:调用包装类的静态方法：parseXxx(str)
    基本数据类型、包装类--->String:调用String重载的ValueOf(xxx)
     */
    @Test
    public void test1() {
        String str = "123";//常量池
//        int num = (int)str;//错误的
        int num = Integer.parseInt(str);
        System.out.println(num);

        String s1 = String.valueOf(num);
        System.out.println(s1);
        String s2 = num + "";//堆

        System.out.println(s1 == s2);//false
    }
}
