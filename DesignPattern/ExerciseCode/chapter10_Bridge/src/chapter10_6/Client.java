package chapter10_6;

/**
 * 某软件公司要开发一个数据转换工具，可以将数据库中的数据转换成多种文件格式，
 * 例如Txt、XML、PDF等格式，同时该工具需要支持多种不同的数据库。
 * 试使用桥接模式对其进行设计并使用java代码编程模拟实现。
 * @author lhang
 * @create 2019-10-25 7:42
 */
public class Client {
    public static void main(String[] args) {
        DataHandler handler;
//        handler = new SQLServerHandler();
        handler = (DataHandler) XMLUtil.getDataHandler();

        FileConvertor convertor;
//        convertor = new TXTConvertor();
        convertor = (FileConvertor) XMLUtil.getFileConvertor();
        convertor.setDataHandler(handler);
        convertor.convert();
    }
}
