package chapter6_4;

/**
 * 指挥者类
 * @author lhang
 * @create 2019-10-13 11:28
 */
public class ComputerAssembleDirector {
    private ComputerBuilder cb;

    public void setComputerBuilder(ComputerBuilder cb) {
        this.cb = cb;
    }

    public Computer assemble() {
        cb.buildCpu();
        cb.buildHarddisk();
        cb.buildRam();
        if (!cb.hasNotMoitor()) {
            cb.buildMonitor();
        }
        cb.buildMainframe();
        return cb.produceComputer();
    }

}
