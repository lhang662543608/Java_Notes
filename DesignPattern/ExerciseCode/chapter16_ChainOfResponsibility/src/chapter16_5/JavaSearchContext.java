package chapter16_5;

/**
 * @author lhang
 * @create 2019-11-12 16:33
 */
public class JavaSearchContext extends SearchContext {
    public void search(String keyword) {
        //模拟实现
        if (keyword.contains("Java")) {
            System.out.println("查询关键字 Java！");
        } else {
            successor.search(keyword);
        }
    }
}
