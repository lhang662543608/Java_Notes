package chapter10_6;

/**
 * @author lhang
 * @create 2019-10-25 7:53
 */
public class XMLConvertor extends FileConvertor {
    @Override
    public void convert() {
        dataHandler.readData();
        System.out.println("memory data to XML data");
    }
}
