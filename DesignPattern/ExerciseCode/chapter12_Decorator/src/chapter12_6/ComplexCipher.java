package chapter12_6;

/**
 * @author lhang
 * @create 2019-10-25 17:25
 */
public class ComplexCipher extends CipherDecorator {
    public ComplexCipher(Cipher cipher) {
        super(cipher);
    }


    @Override
    public String encrypt(String plainText) {
        return reverse(super.encrypt(plainText));
    }

    public String reverse(String text) {
        return text+" +reverse ";
    }
}
