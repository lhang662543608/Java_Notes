package chapter10_6;

/**
 * @author lhang
 * @create 2019-10-25 7:53
 */
public class TXTConvertor extends FileConvertor {
    @Override
    public void convert() {
        dataHandler.readData();
        System.out.println("Memory data to TXT data");
    }
}
