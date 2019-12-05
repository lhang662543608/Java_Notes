package chapter4_7;

import javax.xml.bind.annotation.XmlAccessOrder;

/**
 * 使用工厂方法模式设计一个程序用来读取各种不同类型的图片格式，针对每一种图片格式都设计一个图片读取器（ImageReader），
 * 例如GIF图片读取器（GIFReeader）用于读取GIF格式的图片、JPG图片读取器用于读取JPG格式的图片。
 * 注意，需要充分考虑系统的灵活性和可扩展性。
 * @author lhang
 * @create 2019-10-11 15:32
 */
public class Client {
    public static void main(String[] args) {
        ImageReaderFactory factory;
        ImageReader imageReader;
        factory = (ImageReaderFactory) XMLUtil.getBean();
        imageReader = factory.getImageReader();
        imageReader.readImage();



    }

}
