package chapter23_4;

/**
 * @author lhang
 * @create 2019-11-19 9:05
 */
public class DoorOpen extends DoorState {
    public DoorOpen(Door door) {
        super(door);
    }

    @Override
    public void click() {
        System.out.println("保持打开");
        door.setState(door.STAYOPEN);
    }

    @Override
    public void timeout() {
        System.out.println("正在关闭");
        door.setState(door.CLOSING);
    }

    @Override
    public void complete() {

    }
}
