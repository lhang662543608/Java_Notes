package chapter23_4;

/**
 * @author lhang
 * @create 2019-11-19 9:06
 */
public class DoorStayOpen extends DoorState {
    public DoorStayOpen(Door door) {
        super(door);
    }

    @Override
    public void click() {
        System.out.println("正在关闭");
        door.setState(door.CLOSING);
    }

    @Override
    public void timeout() {

    }

    @Override
    public void complete() {

    }
}
