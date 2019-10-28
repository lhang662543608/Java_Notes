package chapter9_7;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author lhang
 * @create 2019-10-24 21:13
 */
public class XMLUtil {
    //方法用于从XML文件中提取具体的Dog类名，并返回一个实例对象。
    public static Object getFactory() {
        try {
            //获取DOM文档节点
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("chapter9_Adapter/src/chapter9_7/config.xml"));
            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("factoryClassName");
            Node node = nl.item(0).getFirstChild();
            String CName = node.getNodeValue();

            //通过类名生成实例对象
            Class name = Class.forName(CName);
            Object obj = name.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
