package chapter12_6;

/**
 * @author lhang
 * @create 2019-10-25 17:28
 */
public class AdvancedCipher extends CipherDecorator {
    public AdvancedCipher(Cipher cipher) {
        super(cipher);
    }

    @Override
    public String encrypt(String plainText) {
        return mod(super.encrypt(plainText));
    }
    public String mod(String Text){
        return Text+" +mod ";
    }
}
