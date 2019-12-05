package chapter4_6;

/**
 * 在软件公司要开发一个数据格式转换工具，可以将不同的数据源（如 TXT文件、数据库、Excel表格）中的数据转换成XML格式。
 * 为了让系统具有更好的扩展性，在未来支持新类型的数据源，开发人员决定使用工厂方法设计该工具。
 * 在工厂类中封装了具体转化类的初始化和创建过程，客户端只需要使用工厂类即可获得具体的转换类对象，在调用其相对应方法实现数据转换操作。
 * 绘制该工具的类图并使用java语言编程模拟实现，要求在实现时引入配置文件。
 *
 * @author lhang
 * @create 2019-10-11 14:59
 */
public class Client {
    public static void main(String[] args) {
        ConvertorFactory factory;
        Convertor convertor;

        factory = (ConvertorFactory) XMLUtil.getBean();
        convertor = factory.getConvertor();

        convertor.transform();

    }
}
