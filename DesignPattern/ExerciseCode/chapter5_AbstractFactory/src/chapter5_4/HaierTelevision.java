package chapter5_4;

/**
 * 具体产品
 * @author lhang
 * @create 2019-10-11 19:07
 */
public class HaierTelevision implements Television{
    @Override
    public void play() {
        System.out.println("Haier Television...");
    }
}
