package TimeRelationClassExer.BeforeJava8;
import java.util.Date;
/**
 * @author lhang
 * @create 2019-07-13 13:38
 */
/*
2. java.util.Date类
    表示特定的瞬间，精确到毫秒
 构造器：
     Date()： 使用无参构造器创建的对象可以获取本地当前时间。
     Date(long date)
 常用方法
     getTime():返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象
    表示的毫秒数。
     toString():把此 Date 对象转换为以下形式的 String： dow mon dd
    hh:mm:ss zzz yyyy 其中： dow 是一周中的某一天 (Sun, Mon, Tue,
    Wed, Thu, Fri, Sat)， zzz是时间标准。
     其它很多方法都过时了。
 */
public class JavaUtilData {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(System.currentTimeMillis());

        System.out.println(date.toString());
        System.out.println(date1.toString());

        System.out.println(date.getTime());
        System.out.println(date1.getTime());
    }
}
