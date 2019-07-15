package TimeRelationClassExer.BeforeJava8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author lhang
 * @create 2019-07-13 13:47
 */
/*
3. java.text.SimpleDateFormat类
Date类的API不易于国际化，大部分被废弃了， java.text.SimpleDateFormat类是一个不与语言环境有关的方式
来格式化和解析日期的具体类。
     它允许进行格式化：日期文本、 解析：文本日期
     格式化：
         SimpleDateFormat() ：默认的模式和语言环境创建对象
         public SimpleDateFormat(String pattern)： 该构造方法可以用参数pattern指定的格式创建一个对象，该对象调用：
         public String format(Date date)： 方法格式化时间对象date
     解析：
         public Date parse(String source)： 从给定字符串的开始解析文本，以生成一个日期。


 */
public class javaTextSimpleDateFormat {
    public static void main(String[] args) {
        Date date = new Date(); // 产生一个Date实例
        // 产生一个formater格式化的实例
        SimpleDateFormat formater = new SimpleDateFormat();
        System.out.println(formater.format(date));// 打印输出默认的格式
        SimpleDateFormat formater2 = new SimpleDateFormat("yyyy年MM月dd日 EEE HH:mm:ss");
        System.out.println(formater2.format(date));
        try {
            // 实例化一个指定的格式对象
            Date date2 = formater2.parse("2008年08月08日 星期一 08:08:08");
            // 将指定的日期解析后格式化按指定的格式输出
            System.out.println(date2.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
