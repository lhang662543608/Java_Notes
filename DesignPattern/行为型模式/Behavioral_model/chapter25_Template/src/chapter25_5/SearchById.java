package chapter25_5;

/**
 * @author lhang
 * @create 2019-11-20 10:39
 */
public class SearchById extends CustomerInfoSearcher {
    public SearchById(DisplayMode mode) {
        super(mode);
    }

    @Override
    public void search() {
        System.out.println("②Id查找");
    }
}
