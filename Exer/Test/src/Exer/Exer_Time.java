package Exer;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

/**
 * @author lhang
 * @create 2019-09-23 7:59
 */
public class Exer_Time {
    /**
     * public class Date extends java.util.Date {
     * java.util.Date类
     * |---java.sql.Date类
     * <p>
     * 1.两个构造器的使用
     * >构造器一：Date()：创建一个对应当前时间的Date对象
     * >构造器二：创建指定毫秒数的Date对象
     * 2.两个方法的使用
     * >toString():显示当前的年、月、日、时、分、秒
     * >getTime():获取当前Date对象对应的毫秒数。（时间戳）
     * <p>
     * 3. java.sql.Date对应着数据库中的日期类型的变量
     * >如何实例化
     * >如何将java.util.Date对象转换为java.sql.Date对象
     */
    @Test
    public void test_UtilDate_SqlDate() {
        //构造器一：Date()：创建一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());//Sat Feb 16 16:35:31 GMT+08:00 2019

        System.out.println(date1.getTime());//1550306204104

        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(155030620410L);
        System.out.println(date2.toString());

        //创建java.sql.Date对象
        java.sql.Date date3 = new java.sql.Date(35235325345L);
        System.out.println(date3);//1971-02-13

        //如何将java.util.Date对象转换为java.sql.Date对象
        //情况一：
//        Date date4 = new java.sql.Date(2343243242323L);
//        java.sql.Date date5 = (java.sql.Date) date4;
        //情况二：
        Date date6 = new Date();
        java.sql.Date date7 = new java.sql.Date(date6.getTime());
    }

    @Test
    public void testSimpleDateFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        //格式化
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
        //解析:要求字符串必须是符合SimpleDateFormat识别的格式(通过构造器参数体现),
        //否则，抛异常
        try {
            Date date2 = simpleDateFormat.parse("2020.02.18 11:48:27");
            System.out.println(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testCalendar() {

        //1.实例化
        //方式一：创建其子类（GregorianCalendar的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getClass());

        //2.常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);//23 -->今天是本月的第23天
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));//266 -->今天是本年的第266天

        //set()
        //calendar可变性
        calendar.set(Calendar.DAY_OF_MONTH, 22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);//22 -->查看本月的第22天

        //add()
        calendar.add(Calendar.DAY_OF_MONTH, -3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);//19  -->查看  本月第22天向前的第3天

        //getTime():日历类---> Date
        Date date = calendar.getTime();
        System.out.println(date);//Thu Sep 19 08:31:10 CST 2019
        // -->返回当前的日历时间（现在是2019年9月23日08:31:10，
        //而日历时间是Thu Sep 19 08:31:10 CST 2019）

        //setTime():Date ---> 日历类
        Date date1 = new Date();//获取当前时间
        calendar.setTime(date1);//设置日历时间
        days = calendar.get(Calendar.DAY_OF_MONTH);//获取日历的的当前天数-->今天是本月的第几天，那么这个数就是几
        System.out.println(days);//23
        System.out.println(calendar.getTime());//Mon Sep 23 08:41:47 CST 2019
    }


    @Test
    public void testLocalDateTime_DateTimeFormatter() {

        //  重点：自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化

        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);//2019-02-18 03:52:09
        //解析
        TemporalAccessor accessor = formatter3.parse("2019-02-18 03:52:09");
        System.out.println(accessor);
    }

    @Test
    public void testZoneID_ZonedDateTime() {
        /**
         * ZoneId:类中包含了所的时区信息
         */

        //getAvailableZoneIds():获取所的ZoneId
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String s : zoneIds) {
            System.out.println(s);
        }
        System.out.println();

        //获取“Asia/Tokyo”时区对应的时间
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localDateTime);//2019-09-24T09:50:02.078
        System.out.println("-----------------------------------");
        /**
         * ZonedDateTime:带时区的日期时间
         */
        //now():获取本时区的ZonedDateTime对象
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);//2019-09-24T08:50:02.192+08:00[Asia/Shanghai]
        //now(ZoneId id):获取指定时区的ZonedDateTime对象
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(zonedDateTime1);//2019-09-24T09:50:02.192+09:00[Asia/Tokyo]
    }

    /**
     * 时间间隔：Duration--用于计算两个“时间”间隔，以秒和纳秒为基准
     */
    @Test
    public void testDuration() {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(15, 23, 32);
        //between():静态方法，返回Duration对象，表示两个时间的间隔
        Duration duration = Duration.between(localTime1, localTime);
        System.out.println(duration);


        System.out.println(duration.getSeconds());
        System.out.println(duration.getNano());
        System.out.println("----------------------------");
        LocalDateTime localDateTime = LocalDateTime.of(2016, 6, 12, 15, 23, 32);
        LocalDateTime localDateTime1 = LocalDateTime.of(2017, 6, 12, 15, 23, 32);
        Duration duration1 = Duration.between(localDateTime1, localDateTime);
        System.out.println(duration1.toDays());
    }

    /**
     * 日期间隔：Period --用于计算两个“日期”间隔，以年、月、日衡量
     */
    @Test
    public void testPeriod() {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2019, 10, 1);

        Period period = Period.between(localDate, localDate1);
        System.out.println(period);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());


        Period period1 = period.withYears(2);
        System.out.println(period1.toString());

        Period period2 = period.minusYears(2);
        System.out.println(period2);


        Period period3 = period.plusYears(2);
        System.out.println(period3);
    }

    @Test
    public void testTemporalAdjuster() {
        //获取当前日期的下一个周日是哪天？
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.next(DayOfWeek.SUNDAY);

        LocalDateTime localDateTime = LocalDateTime.now().with(temporalAdjuster);
        System.out.println(localDateTime);

        //获取下一个工作日是哪天？
        LocalDate localDate = LocalDate.now().with(new TemporalAdjuster() {

            @Override
            public Temporal adjustInto(Temporal temporal) {
                LocalDate date = (LocalDate) temporal;
                if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                    return date.plusDays(3);
                } else if (date.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                    return date.plusDays(2);
                } else {
                    return date.plusDays(1);
                }

            }

        });

        System.out.println("下一个工作日是：" + localDate);


    }
}
