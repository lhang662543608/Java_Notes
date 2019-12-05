package chapter21_6;

/**
 * 某软件公司正在开发一款RPG网游，为了给玩家提供更多的方便，在游戏过程中可以设置一个恢复点，
 * 用于保存当前的游戏场景，如果在后续游戏过程中玩家角色不幸牺牲，
 * 可以返回到先前保存的场景，从所恢复点开始重新游戏。
 * 试使用备忘录模式设计该功能，要求绘制相应的类图并使用java语言编程模拟实现。
 *
 * @author lhang
 * @create 2019-11-18 17:26
 */
public class Client {
    public static void main(String[] args) {
        GameScene scene = new GameScene();
        Caretaker ct = new Caretaker();
        scene.setScene("无名湖");
        scene.setLifeValue(3);
        System.out.println("原始状态：");
        scene.display();
        ct.setSceneMemento(scene.save());
        System.out.println("------------------------");
        scene.setScene("魔鬼洞");
        scene.setLifeValue(0);
        System.out.println("牺牲状态：");
        scene.display();
        System.out.println("------------------------");
        scene.restore(ct.getSceneMemento());
        System.out.println("恢复到原始状态：");
        scene.display();
        System.out.println("------------------------");
    }
}
