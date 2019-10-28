package chapter13_5;

import java.util.Hashtable;

/**
 * @author lhang
 * @create 2019-10-25 21:37
 */
public class Mainframe {
    private Memory memory;
    private HardDisk hardDisk;
    private OS os;
    private CPU cpu;


    public Mainframe() {
        memory = new Memory();
        hardDisk = new HardDisk();
        os = new OS();
        cpu = new CPU();
    }

    public void on() {
        memory.check();
        hardDisk.read();
        os.load();
        cpu.run();
    }
}
