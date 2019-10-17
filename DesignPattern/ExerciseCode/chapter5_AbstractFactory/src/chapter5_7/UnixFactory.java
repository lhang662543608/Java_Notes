package chapter5_7;

/**
 * @author lhang
 * @create 2019-10-11 21:50
 */
public class UnixFactory implements AbstractFactory {
    @Override
    public Button getButton() {
        return new UnixButton();
    }

    @Override
    public Text getText() {
        return new UnixText();
    }
}
