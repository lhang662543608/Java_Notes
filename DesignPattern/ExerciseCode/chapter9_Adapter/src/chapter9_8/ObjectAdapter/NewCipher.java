package chapter9_8.ObjectAdapter;

/**
 * @author lhang
 * @create 2019-10-24 21:33
 */
public class NewCipher {

    public String doEncrypt(int key, String ps) {
        String str = Integer.toString(key)+ps+"<---->NewCipher" ;
        return str;
    }
}
