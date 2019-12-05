package chapter14_5;

/**
 * 在屏幕中显示一个文本文档，其中相同的字符串“java”共享同一个对象，而这些字符串的颜色和大小可以不同。
 * 现使用享元模式设计一个方案实现字符串对象的共享，要求绘制类图并使用java语言编程模拟实现。
 *
 * @author lhang
 * @create 2019-10-28 9:19
 */
public class Client {
    public static void main(String[] args) {
        SharedStringFactory factory = new SharedStringFactory();
        SharedString java = factory.getSharedString("java");
        SharedString java1 = factory.getSharedString("java");

        java.setColor(new Color("red"));
        java.setSize(new Size(15));
        java.display();//SharedString{content='java', color=Color{color='red'}, size=Size{value=15}}

        java1.setColor(new Color("green"));
        java1.setSize(new Size(16));
        java1.display();//SharedString{content='java', color=Color{color='green'}, size=Size{value=16}}

        System.out.println(java==java1);//true

    }
}
