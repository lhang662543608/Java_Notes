package chapter7_4;

import java.io.*;

/**
 * @author lhang
 * @create 2019-10-16 22:02
 */
public class DataChart implements Serializable {
    private DataSet ds;
    private String color;
    private int no;

    public DataSet getDs() {
        return ds;
    }

    public void setDs(DataSet ds) {
        this.ds = ds;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void display() {
        System.out.println("display chart!!!");
    }

    //使用序列化技术实现深克隆
    public Object deepClone() throws IOException, ClassNotFoundException {
        Object object;
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

}
