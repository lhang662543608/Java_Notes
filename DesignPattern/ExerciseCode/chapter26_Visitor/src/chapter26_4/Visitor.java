package chapter26_4;


/**
 * @author lhang
 * @create 2019-11-20 14:55
 */
public abstract class Visitor {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void visit(Apple apple);

    public abstract void visit(Book book);

}
