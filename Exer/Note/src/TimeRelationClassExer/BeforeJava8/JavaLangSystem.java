package TimeRelationClassExer.BeforeJava8;

import java.net.PasswordAuthentication;

/**
 * @author lhang
 * @create 2019-07-13 13:31
 */
/*
1. java.lang.System类
System类提供的public static long currentTimeMillis()用来返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
     此方法适于计算时间差。
计算世界时间的主要标准有：
UTC(Coordinated Universal Time)
GMT(Greenwich Mean Time)
CST(Central Standard Time)
 */
public class JavaLangSystem {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {

        }
        long t2 = System.currentTimeMillis();

        System.out.println("t1 is "+ t1 + " t2 is "  + t2+" t2-t1 is "+ (t2-t1));

    }
}
