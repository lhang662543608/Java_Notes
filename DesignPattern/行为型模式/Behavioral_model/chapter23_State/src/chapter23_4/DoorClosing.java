package chapter23_4;

/**
 * @author lhang
 * @create 2019-11-19 9:06
 */
public class DoorClosing extends DoorState {
    public DoorClosing(Door door) {
        super(door);
    }

    @Override
    public void click() {
        System.out.println("正在打开");
        door.setState(door.OPENING);
    }

    @Override
    public void timeout() {

    }

    @Override
    public void complete() {
        System.out.println("已关闭");
        door.setState(door.CLOSED);
    }
}
