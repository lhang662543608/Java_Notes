package chapter12_4;

/**
 * @author lhang
 * @create 2019-10-25 13:06
 */
public class PhoneDecorator extends CellPhone {
    private CellPhone phone;//维持一个对抽象对象的引用

    /**
     * 注入一个抽象构件类型的对象
     * @param phone 抽象构件类型的对象
     */
    public PhoneDecorator(CellPhone phone) {
        this.phone = phone;
    }

    @Override
    public void receiveCall() {
        phone.receiveCall();//调用原有的业务方法。
    }
}
