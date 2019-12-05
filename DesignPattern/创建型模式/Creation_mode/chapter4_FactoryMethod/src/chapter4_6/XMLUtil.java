package chapter4_6;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * @author lhang
 * @create 2019-10-11 15:12
 */
public class XMLUtil {
    /**
     * 该方法用于从XML文件中提取出具体类的类名并将返回一个实例对象。
     */
    public static Object getBean() {
        try {
            //创建DOM文档对象
            DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dfactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse("chapter4_FactoryMethod/src/chapter4_6/config.xml");

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();
//            System.out.println(cName);

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
