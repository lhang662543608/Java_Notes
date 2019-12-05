package chapter6_4;


/**
 * 产品
 *
 * @author lhang
 * @create 2019-10-13 11:17
 */
public class Computer {
    private String cpu;
    private String ram;
    private String harddisk;
    private String mainframe;
    private String monitor;


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }

    public String getMainframe() {
        return mainframe;
    }

    public void setMainframe(String mainframe) {
        this.mainframe = mainframe;
    }

    public String getMonitor() {
        if (this.monitor!=null){
            return this.monitor;
        }
        return "";
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    protected void startMachine() {
        System.out.println("电脑正在开机。。。");
        System.out.println("获取电脑配置中。。。");
        System.out.println(this.getCpu() + "\t" + this.getRam() + "\t" + this.getHarddisk() + "\t" + this.getMainframe() + "\t" + this.getMonitor());

    }
}
