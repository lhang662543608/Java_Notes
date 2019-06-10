package sylu.exer;

/**
 * 银行有一个账户。有两个储户分别向同一个账户存3000元，每次存1000元，存3次。每次存完打印余额。
 * @author lhang
 * @create 2019-06-10 13:50
 */
class Account{
    private  double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    //存钱
    public synchronized void deposit(double rmb){
        if (rmb>0){
            balance += rmb;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":存钱成功，余额为："+ balance);
        }

    }
}
class Customer extends Thread{
    private Account account;

    public Customer(Account account) {
        this.account = account;

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();
    }
}
