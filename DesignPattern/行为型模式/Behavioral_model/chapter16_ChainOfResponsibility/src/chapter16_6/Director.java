package chapter16_6;

/**
 * @author lhang
 * @create 2019-11-12 17:16
 */
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 3) {
            System.out.println("主任"+name+"批准"+request.getLeaveName()+request.getLeaveDays()+"天的假期！");
        } else if (successor != null) {
            this.successor.handleRequest(request);

        }
    }
}
