package chapter17_6;

import java.util.ArrayList;

/**
 * @author lhang
 * @create 2019-11-13 16:16
 */
public class Menu {
    public ArrayList itemList = new ArrayList();

    public void addMenuItem(MenuItem item) {
        itemList.add(item);
    }
}
