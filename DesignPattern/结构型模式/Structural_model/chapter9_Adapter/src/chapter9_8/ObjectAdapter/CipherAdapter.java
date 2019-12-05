package chapter9_8.ObjectAdapter;

/**
 * @author lhang
 * @create 2019-10-24 21:32
 */
public class CipherAdapter extends DataOperator {
    private Caesar cipher;

    public CipherAdapter() {
        cipher = new Caesar();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key, ps);
    }
}
