package chapter19_4;

/**
 * @author lhang
 * @create 2019-11-15 10:12
 */
public interface TVIterator {
    public abstract void setChannel(int i);

    public abstract Object currentChannel();

    public abstract void next();

    public abstract void previous();

    public abstract boolean isLast();

    public abstract boolean isFirst();


}
