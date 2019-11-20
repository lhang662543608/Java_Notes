package chapter17_3;

/**
 * @author lhang
 * @create 2019-11-12 19:20
 */
public class FanCommand extends Command {
    private Fan fan = new Fan();
    @Override
    public void executeOn() {
        fan.run();
    }

    @Override
    public void executeOff() {
        fan.stop();
    }
}
