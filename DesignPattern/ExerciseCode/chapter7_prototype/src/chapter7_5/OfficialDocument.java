package chapter7_5;

/**
 * 抽象原型类
 *
 * @author lhang
 * @create 2019-10-16 22:24
 */
public interface OfficialDocument extends Cloneable {
    public abstract OfficialDocument clone();

    public abstract void display();
}
