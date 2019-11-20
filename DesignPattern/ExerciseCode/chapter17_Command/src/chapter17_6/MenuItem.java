package chapter17_6;

/**
 * @author lhang
 * @create 2019-11-13 16:16
 */
public class MenuItem {
    private String name;
    private Command command;

    public MenuItem(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Command getCommand() {
        return this.command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
