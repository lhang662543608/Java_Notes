package chapter26_4;

/**
 * @author lhang
 * @create 2019-11-20 15:04
 */
public class Customer extends Visitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("顾客检查苹果质量");
    }

    @Override
    public void visit(Book book) {
        System.out.println("顾客检查书本质量");
    }
}
