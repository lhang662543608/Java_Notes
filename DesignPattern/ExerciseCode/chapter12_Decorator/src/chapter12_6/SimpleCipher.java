package chapter12_6;

/**
 * @author lhang
 * @create 2019-10-25 17:18
 */
public class SimpleCipher implements Cipher {
    @Override
    public String encrypt(String plainText) {
        return plainText+" +simpleencrypt ";
    }
}
