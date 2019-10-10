package Exer;

import org.junit.Test;


/**
 * @author lhang
 * @create 2019-10-05 12:10
 */
public class Exer_Object {
    /**
     * == ：运算符
     * 1. 可以使用在基本数据类型变量和引用数据类型变量中
     * 2. 如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。（不一定类型要相同）
     * 如果比较的是引用数据类型变量：比较两个对象的地址值是否相同.即两个引用是否指向同一个对象实体
     * 补充： == 符号使用时，必须保证符号左右两边的变量类型一致。
     */
    @Test
    public void test() {
        int m = 2;
        double n = 2.00;
        System.out.println(m == n);//true

        float x = 0f;
        double y = 0;
        System.out.println(x == y);//true

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 == b1);//fasle
        System.out.println(b2 = b1);//true

    }


}
