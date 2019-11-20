package chapter21_6;

/**
 * @author lhang
 * @create 2019-11-18 17:31
 */
//负责人
public class Caretaker {
    private SceneMemento memento;

    public SceneMemento getSceneMemento() {
        return this.memento;
    }

    public void setSceneMemento(SceneMemento memento) {
        this.memento = memento;
    }
}
