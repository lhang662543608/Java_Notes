package chapter11_5;

/**
 * @author lhang
 * @create 2019-10-25 9:24
 */
public class Office extends Unit {
    private String name;


    public Office(String name) {
        this.name = name;
    }

    @Override
    public void handleArchives() {
        System.out.println(name+"_收到公文！");
    }
}
