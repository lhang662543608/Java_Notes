package chapter5_7;

/**
 * @author lhang
 * @create 2019-10-11 21:50
 */
public class WindowsFactory implements AbstractFactory {
    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public Text getText() {
        return new WindowsText();
    }
}
