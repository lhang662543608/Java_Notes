package chapter16_5;

/**
 * @author lhang
 * @create 2019-11-12 16:33
 */
public abstract class SearchContext {
    protected SearchContext successor;

    public void setSuccessor(SearchContext successor) {
        this.successor = successor;
    }

    public abstract void search(String keyword);
}
