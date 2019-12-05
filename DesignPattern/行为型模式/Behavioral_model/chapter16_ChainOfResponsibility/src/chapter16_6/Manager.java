package chapter16_6;

/**
 * @author lhang
 * @create 2019-11-12 17:20
 */
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() >= 3 && request.getLeaveDays() < 10) {
            System.out.println("经理" + name + "批准" + request.getLeaveName() + request.getLeaveDays() + "天的假期！");
        } else if (successor != null) {
            this.successor.handleRequest(request);
        }
    }
}
