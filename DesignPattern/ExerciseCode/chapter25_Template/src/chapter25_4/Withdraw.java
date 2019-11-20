package chapter25_4;

/**
 * @author lhang
 * @create 2019-11-20 10:09
 */
public class Withdraw extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("②取钱业务");
    }
}
