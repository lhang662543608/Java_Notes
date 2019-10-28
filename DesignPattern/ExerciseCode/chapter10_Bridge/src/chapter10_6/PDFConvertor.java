package chapter10_6;

/**
 * @author lhang
 * @create 2019-10-25 7:54
 */
public class PDFConvertor extends FileConvertor {
    @Override
    public void convert() {
        dataHandler.readData();
        System.out.println("memory data to PDF data");
    }
}
