package chapter23_4;

/**
 * @author lhang
 * @create 2019-11-19 8:59
 */
public abstract class DoorState {
    protected Door door;

    public DoorState(Door door) {
        this.door = door;
    }

    public abstract void click();

    public abstract void timeout();

    public abstract void complete();

}
