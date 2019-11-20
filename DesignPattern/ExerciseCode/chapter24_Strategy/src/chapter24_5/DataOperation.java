package chapter24_5;

/**
 * @author lhang
 * @create 2019-11-19 13:48
 */
public class DataOperation {
    private Cipher cipher;

    public void setCipher(Cipher cipher) {
        this.cipher = cipher;
    }

    public String doEncrypt(int key, String plainText) {
        return cipher.doEncrypt(key, plainText);
    }
}
