package chapter12_4;

/**
 * @author lhang
 * @create 2019-10-25 13:12
 */
public class ComplexPhone extends PhoneDecorator {
    public ComplexPhone(CellPhone phone) {
        super(phone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();//调用原有业务方法
        complex();//调用新增业务方法
    }

    //新增业务方法
    private void complex() {
        System.out.println("振动提示。。。");
        System.out.println("灯光提示。。。");
    }
}
