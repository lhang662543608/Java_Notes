package chapter14_6;

/**
 * @author lhang
 * @create 2019-10-28 10:26
 */
public class Video extends MultimediaFile {
    @Override
    void display() {
        System.out.println("Video  " + "size:" + size + "location:" + location);
    }
}
