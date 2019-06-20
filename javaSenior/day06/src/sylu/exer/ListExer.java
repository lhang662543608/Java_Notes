package sylu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhang
 * @create 2019-06-20 9:36
 */
public class ListExer {
    /*
    区分List中remove(int index)和remove(Object obj)
     */
    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        updateList(list);
        System.out.println(list);//
    }

    private void updateList(List list) {
        //list [1,2,3,2]
        list.remove(2);//[1,2,2]
        list.remove(new Integer(2));//[1,2]
        list.remove(new Integer(4));//[1,2]

    }

}
