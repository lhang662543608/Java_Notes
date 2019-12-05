package chapter16_6;

/**
 * @author lhang
 * @create 2019-11-12 17:14
 */
public abstract class Leader {
    protected String name;
    protected Leader successor;

    public Leader(String name) {
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(LeaveRequest request);
}
