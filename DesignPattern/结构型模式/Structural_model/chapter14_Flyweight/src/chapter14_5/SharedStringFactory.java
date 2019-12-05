package chapter14_5;

import java.util.Hashtable;

/**
 * @author lhang
 * @create 2019-10-28 9:34
 */
public class SharedStringFactory {
    private Hashtable<String, SharedString> ht;

    public SharedStringFactory() {
        ht = new Hashtable();
    }

    public SharedString getSharedString(String arg) {
        if (ht.containsKey(arg)) {
            return ht.get(arg);
        } else {
            ht.put(arg, new SharedString(arg));
            return ht.get(arg);
        }
    }
}
