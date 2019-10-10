package Exer;

import org.junit.Test;

/**
 * @author lhang
 * @create 2019-10-05 9:12
 */
public class Exer_ValueTransfer {
    /**
     * 针对于方法内变量的赋值举例：
     * 规则：
     * 如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
     * 如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值。
     */
    @Test
    public void TestValueTransfer() {
        System.out.println("***********基本数据类型：****************");
        int m = 10;
        int n = m;

        System.out.println("m = " + m + ", n = " + n);

        n = 20;

        System.out.println("m = " + m + ", n = " + n);

        System.out.println("***********引用数据类型：****************");

        Order o1 = new Order();
        o1.orderId = 1001;

        Order o2 = o1;//赋值以后，o1和o2的地址值相同，都指向了堆空间中同一个对象实体。

        System.out.println("o1.orderId = " + o1.orderId + ",o2.orderId = " + o2.orderId);

        o2.orderId = 1002;

        System.out.println("o1.orderId = " + o1.orderId + ",o2.orderId = " + o2.orderId);
    }

    /**
     * java中参数传递机制：值传递
     *
     * 如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
     * 如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值。
     */
    @Test
    public void TestParaValueTracsfer() {
        System.out.println("***********基本数据类型：****************");
        int m = 10;
        int n = 20;
        new Data().swap(m, n);//m = 20 n= 10
        System.out.println("m = " + m + " n= " + n);//m = 10 n= 20

        System.out.println("***********引用数据类型：****************");
        Data data = new Data();
        data.m=10;
        data.n=20;
        new Data().swap(data);
        System.out.println("data.m= " + data.m + " data.n= " + data.n);
    }

}

class Order {

    public int orderId;
}

class Data {
    public int m;
    public int n;

    public void swap(int m, int n) {
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("m = " + m + " n= " + n);
    }

    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
        System.out.println("data.m= " + data.m + " data.n= " + data.n);
    }
}
