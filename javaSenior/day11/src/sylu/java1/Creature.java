package sylu.java1;

import java.io.Serializable;

/**
 * @author lhang
 * @create 2019-07-03 7:47
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    public void breath(){
        System.out.println("生物呼吸");
    }
    public void eat(){
        System.out.println("生物吃东西");
    }


}
