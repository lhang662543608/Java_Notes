package chapter16_4;

/**
 * @author lhang
 * @create 2019-11-12 15:45
 */
public abstract class Officer {
    protected String name;
    protected Officer successor;

    public Officer(String name) {
        this.name = name;
    }

    public void setSuccessor(Officer successor) {
        this.successor = successor;
    }
    public abstract void handleRequest(Mission request);
}
