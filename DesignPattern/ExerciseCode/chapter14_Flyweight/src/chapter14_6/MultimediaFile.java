package chapter14_6;


/**
 * @author lhang
 * @create 2019-10-28 10:20
 */
public abstract class MultimediaFile {
    protected Size size;
    protected Location location;

    abstract void display();

    public void setSize(Size size) {
        this.size = size;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
