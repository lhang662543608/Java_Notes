package chapter16_4;

/**
 * @author lhang
 * @create 2019-11-12 15:48
 */
public class Banzhang extends Officer {
    public Banzhang(String name) {
        super(name);
    }

    public void handleRequest(Mission request) {
        if (request.getEnemyNumber() < 10) {
            System.out.println("班长" + name + "下达代号为" + request.getCode() + "的作 战任务，敌人数量为" + request.getEnemyNumber());
        } else {
            if (this.successor != null) {
                this.successor.handleRequest(request);
            }
        }
    }
}
