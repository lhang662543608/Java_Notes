package MathClassTest;

import org.junit.Test;

/**
 * @author lhang
 * @create 2019-07-14 17:30
 */

public class MathTest {
    @Test
    public void Mathtest() {
        double num1 = 12.4;
        double num2 = -12.4;
        //Math.abs():返回绝对值
        System.out.println("Math.abs(" + num1 + ")=" + Math.abs(num1));
        System.out.println("Math.abs(" + num2 + ")=" + Math.abs(num2));

        //max(double a,double b):返回最大值
        System.out.println("Math.max(" + num1 + "," + num2 + ")=" + Math.max(num1, num2));
        // min(double a,double b)：返回最小值
        System.out.println("Math.min(" + num1 + "," + num2 + ")=" + Math.min(num1, num2));

        //random() 返回0.0到1.0的随机数
        System.out.println(Math.random());

        //long round(double a):执行标准舍入，即它总是将数值四舍五入为最接近的整数
        System.out.println("Math.round(" + 12.4 + ")" + Math.round(12.4));//12
        System.out.println("Math.round(" + -12.4 + ")" + Math.round(-12.4));//-12
        System.out.println("Math.round(" + 12.5 + ")" + Math.round(12.5));//13
        System.out.println("Math.round(" + -12.5 + ")" + Math.round(-12.5));//-12

        //Math.floor():执行向下舍入，即它总是将数值向下舍入为最接近的整数；
        System.out.println("Math.floor(" + 12.4 + ")" + Math.floor(12.4));//12.0
        System.out.println("Math.floor(" + -12.4 + ")" + Math.floor(-12.4));//-13.0
        System.out.println("Math.floor(" + 12.5 + ")" + Math.floor(12.5));//12.0
        System.out.println("Math.floor(" + -12.5 + ")" + Math.floor(-12.5));//-13.0

        //Math.ceil():执行向上舍入，即它总是将数值向上舍入为最接近的整数；
        System.out.println("Math.ceil(" + 12.4 + ")" + Math.ceil(12.4));//13.0
        System.out.println("Math.ceil(" + -12.4 + ")" + Math.ceil(-12.4));//-12.0
        System.out.println("Math.ceil(" + 12.5 + ")" + Math.ceil(12.5));//13.0
        System.out.println("Math.ceil(" + -12.5 + ")" + Math.ceil(-12.5));//-12.0
    }

    @Test
    public void Mathtest2() {
        double num1 = 30;
        double num2 = 45;
        double num3 = 90;
        double num4 = 60;

        //toDegrees(double angrad) 弧度—>角度
        //toRadians(double angdeg) 角度—>弧度

        /*
        Math.sin(double a):a是以弧度为单位的角
         */
        System.out.println("Math.sin(Math.toRadians(" + num1 + "))=" + Math.sin(Math.toRadians(num1)));//0.49999999999999994
        System.out.println("Math.sin(Math.toRadians(" + num2 + "))=" + Math.sin(Math.toRadians(num2)));//0.7071067811865475
        System.out.println("Math.sin(Math.PI * 0.5)=" + Math.sin(Math.PI * 0.5));//1.0
        System.out.println("Math.sin(Math.toRadians(" + num3 + "))=" + Math.sin(Math.toRadians(num3)));//1.0
        /*
        Math.cos(double a):a是以弧度为单位的角
         */
        System.out.println("Math.cos(Math.toRadians(" + num4 + "))=" + Math.cos(Math.toRadians(num4)));//0.5000000000000001
    }
    @Test
    public void MathTest3(){
        double num1 = 64.0;

        //Math.sqrt():平方根
        System.out.println(Math.sqrt(num1));//8.0

        //pow(double a,doble b):a的b次幂
        System.out.println(Math.pow(2, 3));//8.0


        //Math.log():自然对数
        System.out.println(Math.log(Math.E));//1.0

        //Math.exp():e为底指数
        System.out.println(Math.exp(1)==Math.E);//true
        System.out.println(Math.E);//2.718281828459045
    }
}
