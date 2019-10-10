package nowcoder;


import org.junit.Test;

/**
 * @author lhang
 * @create 2019-09-18 17:49
 */


public class Test02 {
    /*public static void main(String[] args) {
     *//**
     * 在jdk1.5的环境下，有如下4条语句：
     * Integer i01 = 59;
     * int i02 = 59;
     * Integer i03 =Integer.valueOf(59);
     * Integer i04 = new Integer(59);
     * 以下输出结果为false的是：
     *//*
        {
            Integer i01 = 59;
            int i02 = 59;
            Integer i03 = Integer.valueOf(59);
            Integer i04 = new Integer(59);

            System.out.println(i01 == i02);//true
            System.out.println(i01 == i03);//true
            System.out.println(i03 == i04);//false
            System.out.println(i02 == i04);//true
        }

        */

    /**
     * 下面的程序将来打印什么?（）
     * public class TestIncr {
     * public static void main(String args[]) {
     * int i = 0;
     * i = i++ + i;
     * System.out.println("I = "a + i);
     * }
     * }
     *//*
        {
            int i = 0;
            i = i++ + i;
            System.out.println("I = " + i);
        }

    }*/
    /*
    public static void main(String[] args) {
        Thread t = new Thread() {

            public void run() {
                my360DW();
            }
        };

        t.run();
        System.out.print("DW");

    }

    static void my360DW() {

        System.out.print("360");

    }

     */


}

