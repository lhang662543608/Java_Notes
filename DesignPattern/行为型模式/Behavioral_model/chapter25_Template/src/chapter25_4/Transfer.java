package chapter25_4;

/**
 * @author lhang
 * @create 2019-11-20 10:10
 */
public class Transfer extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("②转账业务");
    }
}
