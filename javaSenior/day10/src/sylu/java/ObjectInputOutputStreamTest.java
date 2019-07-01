package sylu.java;

import org.junit.Test;

import java.io.*;

/**
 * 对象流的使用：
 * 1、ObjectInputStream 和 ObjectOutputStream
 * 2、作用：用于存储和读取基本数据类型数据或对象的处理流。它的强大之处就是
 *          可以把java中对象写入到数据源，也能把对象化从数据源中还原出来。
 *
 * 3、要想一个java对象是可序列化的，需要满足相应的要求。见:Person.java
 * 4、序列化机制：
 *      对象序列化机制允许吧内存中的java对象转换成平台无关的二进制流，从而允许吧这种
 *      二进制流持久保存到磁盘中，或通过网络讲这种二进制流传输到另一个网络节点。
 *      当其他程序获取了这种二进制流，就可以恢复成原来的java对象。
 * @author lhang
 * @create 2019-06-28 18:02
 */
public class ObjectInputOutputStreamTest {

    /*
    序列化过程：将内存中的java对象保存到磁盘中，或者通过网络传输出去。
    使用ObjectOutputStream实现。
     */
    @Test
    public void testObjectOutputStream(){
        ObjectOutputStream oos = null;

        try {
            //1.
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            //2.
            oos.writeObject(new String("我爱北京天安门"));
            oos.flush();//刷新操作
            oos.writeObject(new Person("雷锋",22));
            oos.flush();//刷新操作
            oos.writeObject(new Person("邱少云",22,1001,new Account(5000)));
            oos.flush();//刷新操作
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null){
                //3.
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    /*
       反序列化：将磁盘文件中的对象还原为内存中的一个java对象。
       使用ObjectInputStream实现。
     */
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            //1.
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            //2.
            Object strObj = ois.readObject();
            String str = (String)strObj;
            Person p = (Person) ois.readObject();
            Person p1 = (Person) ois.readObject();
            System.out.println(str);
            System.out.println(p);
            System.out.println(p1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois!=null){
                //3.
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }
}
