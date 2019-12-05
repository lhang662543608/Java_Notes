package chapter17_6;

/**
 * @author lhang
 * @create 2019-11-13 16:18
 */
public class EditCommand implements Command {
    private BoardScreen screen;

    public EditCommand(BoardScreen screen) {
        this.screen = screen;
    }

    public void execute() {
        screen.edit();
    }
}
