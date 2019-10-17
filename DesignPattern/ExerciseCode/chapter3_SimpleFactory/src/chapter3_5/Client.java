package chapter3_5;

/**
 * @author lhang
 * @create 2019-10-10 22:53
 */
public class Client {
    public static void main(String[] args) {
        Shape shape;
        try {
            shape = ShapeFactory.createShape("xxxx");
            //shape = ShapeFactory.createShape("Circle");
            //shape = ShapeFactory.createShape("Rectangle");
            //shape = ShapeFactory.createShape("Triangle");
            shape.draw();
            shape.erase();
        } catch (UnSupportShapeException e) {
            e.printStackTrace();
        }
    }
}
