package chapter22_7;

import java.util.EventObject;


/**
 * @author lhang
 * @create 2019-11-18 22:06
 */
public class LoginEvent extends EventObject {

    private String userName;
    private String password;

    public LoginEvent(Object source, String userName, String password) {
        super(source);
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
}
