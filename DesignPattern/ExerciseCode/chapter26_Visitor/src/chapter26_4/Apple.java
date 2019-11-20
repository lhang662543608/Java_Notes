package chapter26_4;

/**
 * @author lhang
 * @create 2019-11-20 15:04
 */
public class Apple implements Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
