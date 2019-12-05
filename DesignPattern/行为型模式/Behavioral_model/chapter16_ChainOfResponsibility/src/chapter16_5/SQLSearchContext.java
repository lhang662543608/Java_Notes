package chapter16_5;

/**
 * @author lhang
 * @create 2019-11-12 16:35
 */
public class SQLSearchContext extends SearchContext {
    public void search(String keyword) {
        //模拟实现
        if (keyword.contains("SQL")) {
            System.out.println("查询关键字 SQL！");
        } else {
            successor.search(keyword);
        }
    }
}
