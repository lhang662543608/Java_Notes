package chapter7_6.shallowClone;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 浅克隆
 *
 * @author lhang
 * @create 2019-10-16 22:49
 */
public class Customer implements Cloneable {
    public Address getAddress() {
        return address;
    }

    private Address address = null;

    public Customer() {
        address = new Address();
    }

    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failure!");
        }
        return object;
    }
}
