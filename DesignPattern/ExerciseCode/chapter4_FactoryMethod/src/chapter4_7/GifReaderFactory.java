package chapter4_7;

/**
 * @author lhang
 * @create 2019-10-11 16:32
 */
public class GifReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader getImageReader() {
        return new GifReader();
    }
}
