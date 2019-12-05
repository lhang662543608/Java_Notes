package chapter17_6;

/**
 * @author lhang
 * @create 2019-11-13 16:17
 */
public class CreateCommand implements Command {
    private BoardScreen screen;
    public CreateCommand(BoardScreen screen)
    {
        this.screen = screen;
    }
    public void execute()
    {
        screen.create();
    }
}
