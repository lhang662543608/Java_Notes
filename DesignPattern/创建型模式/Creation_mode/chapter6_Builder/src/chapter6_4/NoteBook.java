package chapter6_4;

/**
 * 具体建造者
 *
 * @author lhang
 * @create 2019-10-13 11:21
 */
public class NoteBook extends ComputerBuilder {

    @Override
    public void buildCpu() {
        computer.setCpu("NoteBook's Cpu");
        System.out.println("building NoteBook's Cpu...");
    }

    @Override
    public void buildRam() {
        computer.setRam("NoteBook's Ram");
        System.out.println("building NoteBook's Ram...");
    }

    @Override
    public void buildHarddisk() {
        computer.setHarddisk("NoteBook's HardDisk");
        System.out.println("building NoteBook's hardDisk...");

    }

    @Override
    public void buildMainframe() {
        computer.setMainframe("NoteBook's MainFrame");
        System.out.println("building NoteBook's MainFrame...");

    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("NoteBook's Monitor");
        System.out.println("building NoteBook's Monitor...");

    }
}
