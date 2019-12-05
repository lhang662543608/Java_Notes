package chapter20_4;

/**
 * @author lhang
 * @create 2019-11-18 14:59
 */
public class WTO extends UnitedNations {
    private China cn;
    private America us;

    public void setChina(China cn) {
        this.cn = cn;
    }

    public void setAmerica(America us) {
        this.us = us;
    }

    @Override
    public void declare(String message, Country country) {
        if (country == cn) {
            us.getMessage(message);
        } else {
            cn.getMessage(message);
        }
    }
}
