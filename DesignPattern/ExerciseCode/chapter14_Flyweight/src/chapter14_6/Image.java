package chapter14_6;

/**
 * @author lhang
 * @create 2019-10-28 10:23
 */
public class Image extends MultimediaFile {
    @Override
    void display() {
        System.out.println(this + "size：" + size + "location:" + location);
    }
}
