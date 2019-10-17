package chapter6_4;

/**
 * 具体建造者
 * @author lhang
 * @create 2019-10-13 11:26
 */
public class Server extends ComputerBuilder {

    @Override
    public void buildCpu() {
        computer.setCpu("Server's Cpu");
        System.out.println("building Server's Cpu...");
    }

    @Override
    public void buildRam() {
        computer.setRam("Server's Ram");
        System.out.println("building Server's Ram...");

    }

    @Override
    public void buildHarddisk() {
        computer.setHarddisk("Server's hardDisk");
        System.out.println("building Server's HardDisk...");

    }

    @Override
    public void buildMainframe() {
        computer.setMainframe("Server's MainFrame");
        System.out.println("building Server's mainframe...");
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor(null);
        System.out.println("building Server's Monitor...");

    }

    @Override
    public boolean hasNotMoitor() {
        return true;
    }


}
