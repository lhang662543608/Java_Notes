package chapter17_3;

/**
 * @author lhang
 * @create 2019-11-12 19:17
 */
public class LampCommand extends Command {
    private Lamp lamp = new Lamp();
    @Override
    public void executeOn() {
        lamp.lighten();
    }

    @Override
    public void executeOff() {
        lamp.quench();
    }
}
