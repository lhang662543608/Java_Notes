package chapter17_6;

/**
 * @author lhang
 * @create 2019-11-13 16:17
 */
public class OpenCommand implements Command {
    private BoardScreen screen;

    public OpenCommand(BoardScreen screen) {
        this.screen = screen;
    }

    public void execute() {
        screen.open();
    }
}
