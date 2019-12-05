package chapter24_5;

/**
 * @author lhang
 * @create 2019-11-19 13:47
 */
public interface Cipher {
    public abstract String doEncrypt(int key, String plainText);
}
