package chapter4_6;

/**
 * @author lhang
 * @create 2019-10-11 15:11
 */
public class TXTConvertorFactory implements ConvertorFactory {
    @Override
    public Convertor getConvertor() {
        return new TXTConvertor();
    }
}
