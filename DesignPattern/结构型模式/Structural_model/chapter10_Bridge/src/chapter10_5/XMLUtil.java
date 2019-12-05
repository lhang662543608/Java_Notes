package chapter10_5;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author lhang
 * @create 2019-10-24 23:17
 */
public class XMLUtil {
    //获取公司
    public static Object getCompanyObject() {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document docment = builder.parse(new File("chapter10_Bridge/src/chapter10_5/config.xml"));

            NodeList nl = docment.getElementsByTagName("companyClassName");
            Node firstChild = nl.item(0).getFirstChild();
            String value = firstChild.getNodeValue();

            Class cName = Class.forName(value);
            Object obj = cName.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    //获取飞机类型
    public static Object getPlaneTypeObject() {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document docment = builder.parse(new File("chapter10_Bridge/src/chapter10_5/config.xml"));

            NodeList nl = docment.getElementsByTagName("planeTypeClassName");
            Node firstChild = nl.item(0).getFirstChild();
            String value = firstChild.getNodeValue();

            Class cName = Class.forName(value);
            Object obj = cName.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
