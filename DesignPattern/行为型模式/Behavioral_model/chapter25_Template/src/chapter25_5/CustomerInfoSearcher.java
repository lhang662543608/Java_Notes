package chapter25_5;

/**
 * @author lhang
 * @create 2019-11-20 10:33
 */
public abstract class CustomerInfoSearcher {
    public CustomerInfoSearcher(DisplayMode mode) {
        this.mode = mode;
    }

    private DisplayMode mode;

    public void handle() {
        System.out.println("①关键词处理");
    }

    public abstract void search();

    public void display() {
        mode.display();
    }

    public void transact() {
        handle();
        ;
        search();
        display();
    }
}
