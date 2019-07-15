package DesignPatterns.ProxyPatterns.StaticProxy;

/**
 * 经纪人扮演代理类的对象，实现Sing接口。
 * @author lhang
 * @create 2019-07-05 15:15
 */
public class Broker implements Sing {
    private Singer singer;

    public Broker(Singer singer) {
        this.singer = singer;
    }

    private void confer() {
        System.out.println("经纪人面谈");
    }

    private void signContract() {
        System.out.println("经纪人签合同");
    }

    private void bookTicket() {
        System.out.println("经纪人订票");
    }

    public void sing() {
        confer();
        signContract();
        bookTicket();
        singer.sing();
        collectMoney();
    }

    private void collectMoney() {
        System.out.println("经纪人收钱");
    }
}
