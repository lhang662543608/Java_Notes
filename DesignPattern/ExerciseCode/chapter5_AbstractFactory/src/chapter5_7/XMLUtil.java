package chapter5_7;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * @author lhang
 * @create 2019-10-11 21:56
 */
public class XMLUtil {
    public static Object getBean() {
        try {
            //获取DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("chapter5_AbstractFactory/src/chapter5_7/config.xml"));

            //获取包含类名的文本结点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();


            //通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
