package chapter12_4;

/**
 * @author lhang
 * @create 2019-10-25 13:09
 */
public class JarPhone extends PhoneDecorator {

    public JarPhone(CellPhone phone) {
        super(phone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();//调用原有业务方法
        jar();//调用新增业务方法
    }

    //新增业务方法
    private void jar() {
        System.out.println("振动提示...");
    }
}
