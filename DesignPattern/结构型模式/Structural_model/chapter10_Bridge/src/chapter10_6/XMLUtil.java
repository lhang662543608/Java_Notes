package chapter10_6;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author lhang
 * @create 2019-10-25 8:05
 */
public class XMLUtil {
    public static Object getDataHandler() {
        try {
            //获取DOM节点
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("chapter10_Bridge/src/chapter10_6/config.xml"));
            //获取文本节点的值
            NodeList nl = doc.getElementsByTagName("DataHandler");
            Node node = nl.item(0).getFirstChild();
            String value = node.getNodeValue();


            //生成实例对象
            Class CName = Class.forName(value);
            Object obj = CName.newInstance();

            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object getFileConvertor() {
        try {
            //获取DOM节点
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("chapter10_Bridge/src/chapter10_6/config.xml"));
            //获取文本节点的值
            NodeList nl = doc.getElementsByTagName("FileConvertor");
            Node node = nl.item(0).getFirstChild();
            String value = node.getNodeValue();


            //生成实例对象
            Class CName = Class.forName(value);
            Object obj = CName.newInstance();

            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
