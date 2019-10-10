package Exer;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author lhang
 * @create 2019-09-22 20:44
 */
public class Exer_String {
    @Test
    public void test1() {
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        System.out.println(s1 == s3);//false

        final String s4 = "javaEE";//s4:常量
        String s5 = s4 + "hadoop";
        System.out.println(s1 == s5);//true
    }

    @Test
    public void test2() {
        String str1 = "123";
//        int num = (int)str1;//错误的
        int num = Integer.parseInt(str1);

        String str2 = String.valueOf(num);//"123"
        String str3 = num + "";

        System.out.println(str1 == str3);//false
        System.out.println(str1 == str2);//false
        System.out.println(str2 == str3);//false
    }

    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123中国";
        byte[] bytes = str1.getBytes();//使用默认的字符集，进行编码。
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str1.getBytes("gbk");//使用gbk字符集进行编码。
        System.out.println(Arrays.toString(gbks));

        System.out.println("******************");

        String str2 = new String(bytes);//使用默认的字符集，进行解码。
        System.out.println(str2);

        String str3 = new String(gbks);
        System.out.println(str3);//出现乱码。原因：编码集和解码集不一致！


        String str4 = new String(gbks, "gbk");
        System.out.println(str4);//没出现乱码。原因：编码集和解码集一致！


    }


    @Test
    public void test4() {
        String s1 = new String();
        StringBuffer sb = new StringBuffer();
        StringBuilder sbb = new StringBuilder();
        System.out.println(s1.length());//0
        System.out.println(sb.length());//0
        System.out.println(sbb.length());//0
        System.out.println(sb.capacity());//16
        System.out.println(sbb.capacity());//16
    }
}
