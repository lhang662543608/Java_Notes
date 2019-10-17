package chapter7_6;

import chapter7_6.shallowClone.Address;
import chapter7_6.shallowClone.Customer;

import java.io.IOException;

/**
 * 请为某些销售管理系统设计实现一个客户类Customer，在客户类中包含一个名为客户地址的成员变量，客户地址的类型为Address，
 * 用浅克隆和深克隆分别实现Customer对象的复制并比较这两种克隆方式的异同。
 *
 * @author lhang
 * @create 2019-10-16 21:34
 */
public class Client {

    public static void main(String[] args) {

        //浅克隆
        Customer customer_prev, customer_new = null;
        customer_prev = new Customer();
        customer_new = (Customer) customer_prev.clone();

        System.out.println("浅克隆中Customer是否相同？" + (customer_prev == customer_new));
        System.out.println("浅克隆中Address是否相同？" + (customer_prev.getAddress() == customer_new.getAddress()));

        //深克隆

        chapter7_6.deelpClone.Customer customer_deep_prev, customer_deep_new = null;
        customer_deep_prev = new chapter7_6.deelpClone.Customer();
        try {
            customer_deep_new = (chapter7_6.deelpClone.Customer) customer_deep_prev.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("深克隆中Customer是否相同？" + (customer_deep_prev == customer_deep_new));
        System.out.println("深克隆中Address是否相同？" + (customer_deep_prev.getAddress() == customer_deep_new.getAddress()));
    }


}
