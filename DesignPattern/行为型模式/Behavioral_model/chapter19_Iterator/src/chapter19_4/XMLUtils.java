package chapter19_4;

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
 * @create 2019-11-17 13:36
 */
public class XMLUtils {
    public static Object getBean() {
        try {
            DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dfactory.newDocumentBuilder();
            Document doc = builder.parse(new File("chapter19_Iterator/src/chapter19_4/config.xml"));

            NodeList nl = doc.getElementsByTagName("className");
            Node node = nl.item(0).getFirstChild();
            String value = node.getNodeValue();

            Class cName = Class.forName(value);
            Object obj = cName.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
