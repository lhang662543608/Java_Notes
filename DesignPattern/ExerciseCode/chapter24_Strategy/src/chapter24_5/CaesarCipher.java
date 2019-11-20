package chapter24_5;

/**
 * @author lhang
 * @create 2019-11-19 13:49
 */
public class CaesarCipher implements Cipher {
    @Override
    public String doEncrypt(int key, String plainText) {
        return plainText + " +CaesarCipherEncrypt";
    }
}
