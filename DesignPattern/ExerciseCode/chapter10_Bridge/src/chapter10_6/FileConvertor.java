package chapter10_6;

/**
 * @author lhang
 * @create 2019-10-25 7:50
 */
public abstract class FileConvertor {
    protected DataHandler dataHandler;

    public void setDataHandler(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    public abstract void convert();
}
