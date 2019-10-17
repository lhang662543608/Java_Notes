package chapter7_5;

/**
 * 某公司要创建一个公文管理器，在公文管理器中提供一个集合对象来存储一些常用的公文模板，用户可以通过复制这些公文模板快速创建新的公文。
 * 试使用带有原型管理器的原型模式来设计该公文管理器并使用java代码编程模拟。
 *
 * @author lhang
 * @create 2019-10-16 14:47
 */
public class Client {
    public static void main(String[] args) {
        //获取原型管理器对象
        PrototypeManager pm = PrototypeManager.getPrototypeManager();
        OfficialDocument doc1, doc2, doc3, doc4;
        doc1 = pm.getOfficialDocument("far");
        doc1.display();
        doc2 = pm.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1 == doc2);//false
        doc3 = pm.getOfficialDocument("srs");
        doc3.display();
        doc4 = pm.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3 == doc4);//false
    }
}
