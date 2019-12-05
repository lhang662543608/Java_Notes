package chapter25_4;

/**
 * @author lhang
 * @create 2019-11-20 10:08
 */
public class Deposit extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("②办理存款业务");
    }
}
