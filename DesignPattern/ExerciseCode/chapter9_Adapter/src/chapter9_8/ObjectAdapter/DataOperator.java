package chapter9_8.ObjectAdapter;

/**
 * @author lhang
 * @create 2019-10-24 21:30
 */
public abstract class DataOperator {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public abstract String doEncrypt(int key, String ps);
}
