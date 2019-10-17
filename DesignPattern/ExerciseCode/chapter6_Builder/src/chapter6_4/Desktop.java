package chapter6_4;

/**
 * 具体建造者
 * @author lhang
 * @create 2019-10-13 11:24
 */
public class Desktop extends ComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCpu("DeskTop's Cpu");
        System.out.println("building DeskTop's Cpu...");

    }

    @Override
    public void buildRam() {
        computer.setRam("DeskTop's Ram");
        System.out.println("building DeskTop's Ram...");

    }

    @Override
    public void buildHarddisk() {
        computer.setHarddisk("DeskTop's HardDisk");
        System.out.println("building DeskTop's hardDisk...");

    }

    @Override
    public void buildMainframe() {
        computer.setMainframe("DeskTop's Mainframe");
        System.out.println("building DeskTop's mainframe...");

    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("DeskTop's Monitor");
        System.out.println("building DeskTop's Monitor...");

    }
}
