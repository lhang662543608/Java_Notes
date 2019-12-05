package chapter17_3;

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
 * @create 2019-11-12 19:26
 */
public class XMLUtils {
    public static Object getBean(){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("chapter17_Command/src/chapter17_3/config.xml"));

            NodeList tagName = document.getElementsByTagName("className");
            Node node = tagName.item(0).getFirstChild();
            String nodeValue = node.getNodeValue();

            Class ClassName = Class.forName(nodeValue);
            Object obj = ClassName.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
