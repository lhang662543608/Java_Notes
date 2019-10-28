package chapter15_5;

/**
 * 在某应用软件中需要记录业务方法的调用日志，在不修改现有业务类的基础上为每个类提供一个日志记录代理类，在代理类中输出日志，
 * 例如：在业务方法method()被调用之前输出“方法method()被调用，调用时间为2017-11-5 10:10:10”,
 * 调用之后如果没有抛出异常则输出“方法method()调用成功”,
 * 否则输出“方法method()调用失败”。
 * 在代理类中调用真实业务类的业务方法，
 * 使用代理模式设计该日志记录模块的结构，绘制类图并使用java语言编程模拟实现。
 * @author lhang
 * @create 2019-10-28 14:19
 */
public class Client {
    public static void main(String[] args) {
        AbstractSubject subject = new LoggerProxy();
        subject.method();
    }
}
