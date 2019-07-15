package TimeRelationClassExer.Java8_JavaTime;

import com.sun.org.apache.xerces.internal.xni.parser.XMLDTDFilter;
import com.sun.scenario.effect.Offset;
import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.*;
import java.util.Map;
import java.util.Set;

/**
 * @author lhang
 * @create 2019-07-13 15:00
 */
public class JavaTimeTest1 {
    //LocalDate类
    @Test
    public void LocalDateTest() {
        LocalDate ofaLD = LocalDate.of(2019, 7, 13);
        System.out.println(ofaLD);//2019-07-13

        LocalDate nowLD = LocalDate.now();
        System.out.println("nowLD:" + nowLD);//nowLD:2019-07-13
        LocalDate nowLD1 = LocalDate.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("nowLD1:" + nowLD1);//nowLD1:2019-07-13

        LocalDate ofYearDayLD = LocalDate.ofYearDay(2019, 5);
        System.out.println(ofYearDayLD);//2019-01-05

        LocalDate parseLD = LocalDate.parse("2019年06月06日", DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
        System.out.println(parseLD);//2019-06-06

    }
    //LocalTime类

    @Test
    public void LocalTimeTest() {
        LocalTime nowLT = LocalTime.now();
        LocalTime nowLT1 = LocalTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("nowLT>>" + nowLT);//nowLT>>15:20:49.263
        System.out.println("nowLT1>>" + nowLT1);//nowLT1>>15:20:49.263

        LocalTime ofLT = LocalTime.of(15, 22, 56);
        System.out.println(ofLT);//15:22:56

        /*
         from {@code 0} to {@code 24 * 60 * 60 - 1}
         */
        LocalTime ofSecondOfDayLD = LocalTime.ofSecondOfDay(0);//00:00
        ofSecondOfDayLD = LocalTime.ofSecondOfDay(24 * 60 * 60 - 1); //23:59:59

        System.out.println(LocalTime.MIN);//00:00
        System.out.println(LocalTime.MIDNIGHT);//00:00
        System.out.println(LocalTime.MAX);//23:59:59.999999999

        LocalTime parseLT = LocalTime.parse("15:37:15", DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(parseLT); //15:37:15
    }

    //LocalDateTime类
    @Test
    public void LocalDateTimeTest() {
        //LocalDateTime的类方法
        LocalDateTime nowLDT = LocalDateTime.now();
        LocalDateTime nowLDT1 = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(nowLDT);//2019-07-13T15:42:48.334
        System.out.println(nowLDT1);//2019-07-13T15:42:48.334

        LocalDateTime ofLDT = LocalDateTime.of(2019, 06, 06, 15, 15, 15);
        System.out.println(ofLDT);//2019-06-06T15:15:15

        LocalDateTime ofInstantLDT = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Shanghai"));
        System.out.println(ofInstantLDT);//2019-07-13T15:48:29.621

        LocalDateTime parseLDT = LocalDateTime.parse("2008年08月08日 08:08:08", DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss"));
        System.out.println(parseLDT);//2008-08-08T08:08:08

        //LocalDateTime的实例方法

        LocalDateTime ldtOf = LocalDateTime.of(2019, 8, 30, 16, 16, 16);
        LocalDateTime ldtOf1 = LocalDateTime.of(2018, 7, 29, 15, 15, 15);

        LocalDateTime minusDaysLDT = ldtOf.minusDays(1);
        LocalDateTime minusDaysLDT1 = ldtOf1.minusDays(1);
        System.out.println(ldtOf); //2019-08-30T16:16:16
        System.out.println(minusDaysLDT.plusHours(2).plusMinutes(1));// 2019-08-29T18:17:16
        System.out.println(ldtOf1);//2018-07-29T15:15:15
        System.out.println(minusDaysLDT1.plusHours(2).plusMinutes(1));// 2018-07-28T17:16:15
        System.out.println(ldtOf.getDayOfMonth());//30
        System.out.println(ldtOf.getDayOfWeek()); //FRIDAY
        System.out.println(ldtOf.getDayOfYear()); //242
        System.out.println(ldtOf.getYear());//2019
        System.out.println(ldtOf.getMonth());//AUGUST
        System.out.println(ldtOf.getMonthValue());//8
        System.out.println(ldtOf.getDayOfWeek());//FRIDAY
        System.out.println(ldtOf.getHour());//16
        System.out.println(ldtOf.getMinute());//16
        System.out.println(ldtOf.getSecond());//16
        System.out.println(ldtOf.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(ldtOf.isEqual(ldtOf1)); //false
        System.out.println(ldtOf.isBefore(ldtOf1));//false
        System.out.println(ldtOf.isAfter(ldtOf1));//true
        System.out.println(ldtOf.toLocalDate());//2019-08-30
        System.out.println(ldtOf.toLocalTime());//16:16:16
        System.out.println(ldtOf.toString()); //2019-08-30T16:16:16
        System.out.println(ldtOf.withYear(1998).withMonth(12).
                withDayOfMonth(12).withHour(12).withMinute(12).withSecond(12));//1998-12-12T12:12:12
        ZonedDateTime zonedDateTime = ldtOf.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime); //2019-08-30T16:16:16+08:00[Asia/Shanghai]


    }

    //Duration类:用于计算两个“时间”间隔，以秒和纳秒为基准
    @Test
    public void DurationTest(){
        //Duration:用于计算两个“时间”间隔，以秒和纳秒为基准
        LocalTime localTime = LocalTime.of(20, 13, 01,1);
        LocalTime localTime1 = LocalTime.of(19, 12, 00);
        //between():静态方法，返回Duration对象，表示两个时间的间隔
        Duration duration = Duration.between(localTime1, localTime);
        System.out.println(duration);//PT1H1M1.000000001S
        System.out.println(duration.getSeconds());//3661
        System.out.println(duration.getNano());//1
        LocalDateTime localDateTime = LocalDateTime.of(2016, 6, 12, 15, 23, 32);
        LocalDateTime localDateTime1 = LocalDateTime.of(2017, 6, 12, 15, 23, 32);
        Duration duration1 = Duration.between(localDateTime1, localDateTime);
        System.out.println(duration1.toDays());//-365
    }

    //Period类:用于计算两个“日期”间隔，以年、月、日衡量
    @Test
    public void PeriodTest(){
//        LocalDate localDate = LocalDate.now();
        LocalDate localDate = LocalDate.of(2019, 7, 13);
        LocalDate localDate1 = LocalDate.of(2028, 3, 18);
        Period period = Period.between(localDate, localDate1);
        System.out.println(period);//P8Y8M5D
        System.out.println(period.getYears());//8
        System.out.println(period.getMonths());//8
        System.out.println(period.getDays());//5
        Period period1 = period.withYears(2);
        System.out.println(period1);//P2Y8M5D
    }
    //TemporalAdjuster类:时间校正器
    @Test
    public void TemporalAdjusterTest(){
        // 获取当前日期的下一个周日是哪天？
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.next(DayOfWeek.SUNDAY);
        LocalDateTime localDateTime = LocalDateTime.now().with(temporalAdjuster);
        System.out.println(localDateTime);
        // 获取下一个工作日是哪天？'

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
        System.out.println("下一个工作日是： " + localDate);

    }
}