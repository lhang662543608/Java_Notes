package chapter20_4;

/**
 * @author lhang
 * @create 2019-11-18 13:43
 */
public abstract class Country {
    protected UnitedNations un;

    public void setUnitedNations(UnitedNations un) {
        this.un = un;
    }

    public void declare(String message) {
        un.declare(message, this);
    }

    public abstract void getMessage(String message);
}
