package chapter17_3;

/**
 * @author lhang
 * @create 2019-11-12 19:15
 */
public class Switch {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void on(){
        command.executeOn();
    }
    public void off(){
        command.executeOff();
    }
}
