package StringRelationClassExer.StringTest;


import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @author lhang
 * @create 2019-07-10 20:02
 */
public class StringTest3 {
    /*
    String与基本数据类型的转换
    Integer包装类的public static int parseInt(String s)：可以将由“数字”字、符组成的字符串转换为整型。
    类似地,使用java.lang包中的Byte、Short、Long、Float、Double类调相应的类方法可以将由“数字”字符组成的字符串，转化为相应的基本数据类型。

    调用String类的public String valueOf(int n)可将int型转换为字符串
    相应的valueOf(byte b)、valueOf(long l)、valueOf(float f)、valueOf(doubled)、valueOf(boolean b)可由参数的相应类型到字符串的转换
     */
    @Test
    public void test1() {
        String s1 = "123";
        String s2 = "12.36";

        byte B = Byte.parseByte(s1);
        short S = Short.parseShort(s1);
        int I = Integer.parseInt(s1);
        long L = Long.parseLong(s1);
        double D = Double.parseDouble(s2);
        float F = Float.parseFloat(s2);

        System.out.println(B + "," + S + "," + I + "," + L + "," + D + "," + F);

        String s3 = String.valueOf(B);
        String s4 = String.valueOf(S);
        String s5 = String.valueOf(I);
        String s6 = String.valueOf(L);
        String s7 = String.valueOf(D);
        String s8 = String.valueOf(F);

        System.out.println(s3 + "," + s4 + "," + s5 + "," + s6 + "," + s7 + "," + s8);

    }

    /*
    String与字符数组的转换
    String 类的构造器：String(char[]) String(char[] int offset int length) 分别用字符数组中的全部字符和部分字符创建字符串对象。

    public char[] toCharArray() 将字符串中的全部字符存放在一个字符数组中的方法。
    public void getChars(int srcBegin, int srcEnd, char[] dst,int dstBegin) 提供了将指定索引范围内的字符串存放到数组中的方法。
     */
    @Test
    public void test2() {
        char[] chars = new char[]{'H','e','l','l','o'};
        String s1 = new String(chars);
        String s2 = new String(chars, 0, 2);
        System.out.println(s1);//"Hello"
        System.out.println(s2);//"He"
        
        String s3 = "JAVA";
        char[] chars1 = s3.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            System.out.print(chars1[i]);//JAVA
        }

        System.out.println();

        char[] chars2 = new char[20];
        s3.getChars(0,2,chars2,0);
        for (int i = 0; i < chars2.length; i++) {
            System.out.print(chars2[i]);//JA
        }

    }

    /*
    String与字节数组的转换:
    String(byte[]) 通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
    String(byte[] int offset int length) 用指定的字节数组的一部分，即从数组起始位置offset开始取length个字节构造一个字符串对象。

    public byte[] getBytes() 使用平台的默认字符集将此 String 编码为byte 序列，并将结果存储到一个新的 byte 数组中。
    public byte[] getBytes(String charsetName) 使用指定的字符集将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组
     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str = "中";
        System.out.println(str.getBytes("ISO8859-1").length);// -128~127
        System.out.println(str.getBytes("GBK").length);
        System.out.println(str.getBytes("UTF-8").length);
        System.out.println(new String(str.getBytes("ISO8859-1"), "ISO8859-1"));// 乱码，表示不了中文
        System.out.println(new String(str.getBytes("GBK"), "GBK"));
        System.out.println(new String(str.getBytes("UTF-8"), "UTF-8"));
    }
}
