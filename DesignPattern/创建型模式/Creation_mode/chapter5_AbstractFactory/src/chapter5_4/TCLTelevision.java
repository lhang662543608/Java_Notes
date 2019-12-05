package chapter5_4;

/**
 * 具体产品
 * @author lhang
 * @create 2019-10-11 19:11
 */
public class TCLTelevision  implements Television{

    @Override
    public void play() {
        System.out.println("TCL Television.....");
    }
}
