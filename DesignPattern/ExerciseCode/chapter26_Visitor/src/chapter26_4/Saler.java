package chapter26_4;

/**
 * @author lhang
 * @create 2019-11-20 15:05
 */
public class Saler extends Visitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("苹果过秤计价");
    }

    @Override
    public void visit(Book book) {
        System.out.println("书本计价");
    }
}
