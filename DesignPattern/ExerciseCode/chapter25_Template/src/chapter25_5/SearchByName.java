package chapter25_5;

/**
 * @author lhang
 * @create 2019-11-20 10:38
 */
public class SearchByName extends CustomerInfoSearcher {
    public SearchByName(DisplayMode mode) {
        super(mode);
    }

    @Override
    public void search() {
        System.out.println("②name查找");
    }
}
