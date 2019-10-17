package chapter3_5;

/**
 * @author lhang
 * @create 2019-10-10 22:47
 */
public class ShapeFactory {
    public static Shape createShape(String arg) throws UnSupportShapeException {
        Shape shape = null;
        if (arg.equalsIgnoreCase("Circle")) {
            shape = new Circle();
        } else if (arg.equalsIgnoreCase("Rectangle")) {
            shape = new Rectangle();
        } else if (arg.equalsIgnoreCase("Triangle")) {
            shape = new Triangle();
        }else {
            throw new UnSupportShapeException("输入的参数错误");
        }
        return shape;
    }
}
