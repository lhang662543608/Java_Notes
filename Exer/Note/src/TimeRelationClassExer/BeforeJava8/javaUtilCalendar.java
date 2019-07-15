package TimeRelationClassExer.BeforeJava8;


import java.util.Calendar;
import java.util.Date;

/**
 * @author lhang
 * @create 2019-07-13 14:06
 */
/*
4. java.util.Calendar(日历)类
     Calendar是一个抽象基类，主用用于完成日期字段之间相互操作的功能。
     获取Calendar实例的方法
         使用Calendar.getInstance()方法
         调用它的子类GregorianCalendar的构造器。
     一个Calendar的实例是系统时间的抽象表示，通过get(int field)方法来取得想要的时间信息。
    比如YEAR、 MONTH、 DAY_OF_WEEK、 HOUR_OF_DAY 、MINUTE、 SECOND
         public void set(int field,int value)
         public void add(int field,int amount)
         public final Date getTime()
         public final void setTime(Date date)
     注意:
         获取月份时： 一月是0，二月是1，以此类推， 12月是11
         获取星期时： 周日是1，周二是2 ， 。 。。。周六是7
 */
public class javaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 从一个 Calendar 对象中获取 Date 对象
        Date date = calendar.getTime();
        // 使用给定的 Date 设置此 Calendar 的时间
        date = new Date(System.currentTimeMillis());
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        System.out.println("当前时间日设置为8后,时间是:" + calendar.getTime());
        calendar.add(Calendar.HOUR, 2);
        System.out.println("当前时间加2小时后,时间是:" + calendar.getTime());
        calendar.add(Calendar.MONTH, -2);
        System.out.println("当前日期减2个月后,时间是:" + calendar.getTime());
        calendar.clear();

    }
}
