package chapter23_4;

/**
 * @author lhang
 * @create 2019-11-19 9:04
 */
public class DoorClosed extends DoorState {

    public DoorClosed(Door door) {
        super(door);
    }

    @Override
    public void click() {
        System.out.println("正在打开。。。");
        door.setState(door.OPENING);
    }

    @Override
    public void timeout() {

    }

    @Override
    public void complete() {

    }
}
