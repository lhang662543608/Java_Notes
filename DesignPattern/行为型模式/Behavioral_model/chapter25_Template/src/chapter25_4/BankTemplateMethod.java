package chapter25_4;

/**
 * @author lhang
 * @create 2019-11-20 10:05
 */
public abstract class BankTemplateMethod {
    public void takeNumber() {
        System.out.println("①排队取号");
    }

    public abstract void transact();

    public void evaluate() {
        System.out.println("③服务评价");
    }

    public void process() {
        takeNumber();
        transact();
        evaluate();
    }
}
