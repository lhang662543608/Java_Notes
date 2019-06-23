package sylu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhang
 * @create 2019-06-23 11:16
 */
public class SubOrder extends Order<Integer> {//SubOrder:不是泛型类


    public static <E> List<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();

        for(E e : arr){
            list.add(e);
        }
        return list;

    }


}