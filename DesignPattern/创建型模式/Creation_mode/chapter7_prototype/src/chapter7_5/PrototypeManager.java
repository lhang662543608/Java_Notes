package chapter7_5;

import java.util.Hashtable;

/**
 * 原型管理类
 *
 * @author lhang
 * @create 2019-10-16 22:33
 */
public class PrototypeManager {
    private Hashtable ht = new Hashtable();//使用Hashtable存储原型对象
    private static PrototypeManager pm = new PrototypeManager();

    private PrototypeManager() {
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    public void addOfficialDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    public OfficialDocument getOfficialDocument(String key) {
        return ((OfficialDocument) ht.get(key)).clone();

    }

    public static PrototypeManager getPrototypeManager() {
        return pm;
    }

}
