package chapter6_4;

import java.awt.print.Book;

/**
 * 电脑组装工厂可以将CPU、内存、硬盘、主机、显示器等硬件设备组装在一起构成一台完整的电脑，
 * 且构成的电脑可以是笔记本，也可以是台式机，还可以是不提供显示器的服务器主机。
 * 对于用户而言，无需关心电脑的组成设备和组装过程，工厂返回给用户的是完整的电脑对象。
 * 使用建造者模式实现电脑组装过程，要求绘制类图并使用java代码编程模拟实现。
 *
 * @author lhang
 * @create 2019-10-11 22:20
 */
public class Client {
    public static void main(String[] args) {
//        ComputerBuilder computerBuilder = new NoteBook();
//        ComputerBuilder computerBuilder = new Desktop();
//        ComputerBuilder computerBuilder = new Server();
        ComputerBuilder computerBuilder = (ComputerBuilder) XMLUtil.getBean();
        ComputerAssembleDirector director;
        director = new ComputerAssembleDirector();
        director.setComputerBuilder(computerBuilder);
        Computer computer = director.assemble();
        computer.startMachine();

    }
}
