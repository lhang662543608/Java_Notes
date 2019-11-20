package chapter22_7;

import java.util.EventListener;

/**
 * @author lhang
 * @create 2019-11-18 22:07
 */
public interface LoginEventListener extends EventListener {
    public void validateLogin(LoginEvent event); //声明响应方法
}
