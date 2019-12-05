package chapter10_5;

/**
 * 空客（Airbus）波音（Boeing）和麦道（McDonnel-Douglas）都是飞机制造商，
 * 它们都生产载客飞机（Passenger Plane）和载货飞机（Cargo Plane）。
 * 现在需要设计一个系统，描述这些飞机制造商以及它们所制造的飞机的种类。
 * @author lhang
 * @create 2019-10-24 22:55
 */
public class Client {
    public static void main(String[] args) {
//        Manufacturer manufacturer = new Boeing();
        Manufacturer manufacturer = (Manufacturer) XMLUtil.getCompanyObject();
        Plane plane;
//        plane = new PassengerPlane();
        plane = (Plane) XMLUtil.getPlaneTypeObject();
        manufacturer.setPlane(plane);
        manufacturer.PlaneFly();
    }
}
