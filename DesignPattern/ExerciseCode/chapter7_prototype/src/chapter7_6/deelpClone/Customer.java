package chapter7_6.deelpClone;

import java.io.*;

/**
 * @author lhang
 * @create 2019-10-16 22:53
 */
public class Customer implements Serializable {
    public Address getAddress() {
        return address;
    }

    private Address address = null;

    public Customer() {
        address = new Address();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中读出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();

    }
}
