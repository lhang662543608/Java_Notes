package chapter13_4;

/**
 * 某信息系统需要提供一个数据处理和报表显示模块，该模块可以读取不同类型的文件中的数据并将数据转换成XML格式，
 * 然后对数据进行统计分析，最后已报表的方式来显示数据。由于该过程需要涉及多个类，试使用外观模式设计数据处理和报表显示模块。
 * 考虑到有些文件本身已经是XML格式，无需进行合适转换，为了让系统具有更好的扩展性，在系统设计时引入抽象外观类。
 *
 * @author lhang
 * @create 2019-10-25 21:02
 */
public class Client {
    public static void main(String[] args) {
        AbstractFacade facade;
//        facade = new XMLFacade();
        facade = new ExtendedFacade();
        facade.execute();
    }
}
