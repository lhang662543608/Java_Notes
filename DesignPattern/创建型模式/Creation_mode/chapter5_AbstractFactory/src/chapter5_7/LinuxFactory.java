package chapter5_7;

/**
 * @author lhang
 * @create 2019-10-11 21:51
 */
public class LinuxFactory implements AbstractFactory {
    @Override
    public Button getButton() {
        return new LinuxButton();
    }

    @Override
    public Text getText() {
        return new LinuxText();
    }
}
