package chapter16_6;

/**
 * @author lhang
 * @create 2019-11-12 17:22
 */
public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays()>=10&&request.getLeaveDays()<30){
            System.out.println("总经理"+name+"批准"+request.getLeaveName()+request.getLeaveDays()+"天的假期！");
        }else {
            System.out.println("不批准，假期超过30天！！！");
        }
    }
}
