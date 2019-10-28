package chapter9_6;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * @author lhang
 * @create 2019-10-24 16:35
 */
public class XMLUtil {
    //该方法用于从XML文件中提取具体的Cat类名，并返回一个实例对象。
    public static Object getCat() {
        try {
            //创建DOM文档对象
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("chapter9_Adapter/src/chapter9_6/config.xml"));
            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("concreteCatClass");
            Node nodeClass = nl.item(0).getFirstChild();
            String value = nodeClass.getNodeValue();

//            System.out.println(value);
            //通过类名生成实例对象并将其返回
            Class catClass = Class.forName(value);
            Object obj = catClass.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    //该方法用于从XML文件中提取具体的Dog类名，并返回一个实例对象。
    public static Object getDog() {
        try {
            //获取DOM文档对象
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("chapter9_Adapter/src/chapter9_6/config.xml"));
            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("concreteDogClass");
            Node nodeClass = nl.item(0).getFirstChild();
            String value = nodeClass.getNodeValue();

//            System.out.println(value);
            //通过类名生成实例对象并将其返回
            Class catClass = Class.forName(value);
            Object obj = catClass.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
