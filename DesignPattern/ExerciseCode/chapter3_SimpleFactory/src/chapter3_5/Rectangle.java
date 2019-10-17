package chapter3_5;

/**
 * @author lhang
 * @create 2019-10-10 22:43
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle draw....");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle erase...");
    }
}
