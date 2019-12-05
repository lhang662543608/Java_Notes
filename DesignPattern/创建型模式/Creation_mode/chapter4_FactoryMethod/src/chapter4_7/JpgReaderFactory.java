package chapter4_7;

/**
 * @author lhang
 * @create 2019-10-11 16:33
 */
public class JpgReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader getImageReader() {
        return new JpgReader();
    }
}
