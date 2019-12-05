package chapter6_4;

/**
 * 抽象建造者
 * @author lhang
 * @create 2019-10-13 11:16
 */
public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    public abstract void buildCpu();

    public abstract void buildRam();

    public abstract void buildHarddisk();

    public abstract void buildMainframe();

    public abstract void buildMonitor();

    //钩子方法
    public boolean hasNotMoitor(){
        return false;
    }


    public Computer produceComputer() {
        return computer;
    }
}
