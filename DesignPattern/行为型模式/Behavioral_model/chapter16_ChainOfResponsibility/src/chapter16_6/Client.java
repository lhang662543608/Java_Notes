package chapter16_6;

/**
 * 某OA系统需要提供一个假条审批模块；
 * 如果员工请假天数小于3天，主任可以审批该假条；
 * 如果员工请假天数大于等于3天，小于10天，经理可以审批；
 * 如果请假天数超过10天，小于30天，总经理可以审批；
 * 如果超过30天，总经理不能审批，提示相应的拒绝信息。
 * 试使用职责链模式设计该假条审批模块，要求绘制相应的类图并使用java语言编程模拟实现。
 * @author lhang
 * @create 2019-11-12 16:47
 */
public class Client {
    public static void main(String[] args) {
        Leader director,manager,generalManager;
        director = new Director("刘强东");
        manager = new Manager("王大拿");
        generalManager = new GeneralManager("张无忌");
        //创建职责链
        director.setSuccessor(manager);
        manager.setSuccessor(generalManager);

        LeaveRequest leaveRequest = new LeaveRequest("小李",40);

        director.handleRequest(leaveRequest);
    }
}
