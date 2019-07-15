package TimeRelationClassExer.Java8_JavaTime;

import org.junit.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;

/**
 * @author lhang
 * @create 2019-07-13 19:08
 */
public class JavaTimeTest2 {
    //ZoneId类
    @Test
    public void ZoneIdTest() {
        //ZoneId:类中包含了所有的时区信息
        // ZoneId的getAvailableZoneIds():获取所有的ZoneId
        /*Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String s : zoneIds) {
            System.out.println(s);
        }*/
        //ZoneId的systemDefault()：获取系统默认时区
        System.out.println(ZoneId.systemDefault());
        // ZoneId的of():获取指定时区的时间
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localDateTime);
        //ZonedDateTime:带时区的日期时间
        // ZonedDateTime的now():获取本时区的ZonedDateTime对象
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        System.out.println(zonedDateTime.getOffset());//+08:00
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss")));//2019/07/13  18:12:53
        System.out.println(zonedDateTime.getDayOfWeek());//SATURDAY
        System.out.println(zonedDateTime.getDayOfYear());//194

    }

    //DateTimeFormatter类
    @Test
    public void DateTimeFormatterTest() {
        LocalDateTime localDateTime = LocalDateTime.now();

        //DateTimeFormatter的ofLocalizedDate()方法：
        String format = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String format1 = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String format2 = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String format3 = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(format);//2019年7月13日 星期六
        System.out.println(format1);//2019年7月13日
        System.out.println(format2);//2019-7-13
        System.out.println(format3);//19-7-13
        //FormatStyle的values()方法：返回枚举类FormatStyle的所有值
        /*FormatStyle[] values = FormatStyle.values();
        for (FormatStyle f :
                values) {
            System.out.println(f);
        }*/


        System.out.println("************");

        localDateTime = LocalDateTime.now();
//        String format4 = localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));//err
        String format5 = localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG));
        String format6 = localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String format7 = localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
//        System.out.println(format4);//err
        System.out.println(format5);//2019年7月13日 下午06时36分49秒
        System.out.println(format6);//2019-7-13 18:36:49
        System.out.println(format7);//19-7-13 下午6:36

        //DateTimeFormatter.ofPattern():自定义日期格式
        localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH::mm::ss")));//  2019/07/13 18:41:29
        //使用DateTimeFormatter.ISO_LOCAL_DATE_TIME的日期格式
        localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));//2019-07-13T18:46:39.739


    }

    //Instant类
    @Test
    public void InstantTest() {
        System.out.println(Instant.now());
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant now = Instant.now();
        System.out.println(now);//
        System.out.println(now.getLong(ChronoField.INSTANT_SECONDS));//
        System.out.println(now.getEpochSecond());


    }

}
