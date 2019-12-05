package chapter3_4;

/**
 * 习题4、使用简单工厂模式模拟女娲（Nvwa）造人（Person），如果向人的工厂方法传入参数“M”，则返回一个男人（Man）对象，
 * 如果传入参数“W”，则返回一个女人（Woman）对象，绘制相应的类图并使用java语言模拟实现该场景。
 * 现需要增加一个新的机器人（Robot）类，如果传入参数“R”，则返回一个机器人对象，对代码进行修改并注意“女娲”类的变化。
 * 参考类图如下：
 * 其中Nvwa类充当工厂类，其中定义了工厂方法makePerson（），Person类充当抽象产品类，Man、Woman和Robot充当具体产品类。
 *
 * @author lhang
 * @create 2019-10-10 22:16
 */
public class Client {
    public static void main(String[] args) {
        Person person;
//        person = Nvwa.makePerson('M');
//        person = Nvwa.makePerson('W');
        person = Nvwa.makePerson('R');

        person.eat();
        person.sleep();
    }
}
