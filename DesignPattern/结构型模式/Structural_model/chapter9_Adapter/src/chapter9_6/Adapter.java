package chapter9_6;

/**
 * @author lhang
 * @create 2019-10-24 16:01
 */
public class Adapter implements Cat, Dog {
    private Dog dog;
    private Cat cat;

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    //猫学狗叫
    public void cry() {
        dog.wang();
    }

    public void catchMouse() {
        cat.catchMouse();
    }

    public void wang() {
        dog.wang();
    }

    //狗学猫抓老鼠
    public void action() {
        cat.catchMouse();
    }
}
