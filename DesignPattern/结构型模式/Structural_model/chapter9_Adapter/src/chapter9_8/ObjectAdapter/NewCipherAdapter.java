package chapter9_8.ObjectAdapter;

/**
 * @author lhang
 * @create 2019-10-24 21:36
 */
public class NewCipherAdapter extends DataOperator {
    private NewCipher cipher;

    public NewCipherAdapter() {
        cipher = new NewCipher();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key, ps);
    }
}
