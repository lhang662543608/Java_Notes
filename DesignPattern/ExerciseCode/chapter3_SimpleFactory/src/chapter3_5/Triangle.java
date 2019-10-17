package chapter3_5;

/**
 * @author lhang
 * @create 2019-10-10 22:45
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle draw...");
    }

    @Override
    public void erase() {
        System.out.println("Triangle erase...");
    }
}
