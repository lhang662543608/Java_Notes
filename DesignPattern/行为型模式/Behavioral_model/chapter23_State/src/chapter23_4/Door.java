package chapter23_4;


/**
 * @author lhang
 * @create 2019-11-19 8:59
 */
public class Door {
    private DoorState state;
    public DoorState CLOSED = new DoorClosed(this);
    public DoorState OPENING = new DoorOpening(this);
    public DoorState OPEN = new DoorOpen(this);
    public DoorState CLOSING = new DoorClosing(this);
    public DoorState STAYOPEN = new DoorStayOpen(this);

    public void setState(DoorState state) {
        this.state = state;
    }

    public void click() {
        state.click();
    }

    public void timeout() {
        state.timeout();
    }

    public void complete() {
        state.complete();
    }
}
