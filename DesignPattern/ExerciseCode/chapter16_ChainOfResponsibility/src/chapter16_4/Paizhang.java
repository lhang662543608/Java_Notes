package chapter16_4;

/**
 * @author lhang
 * @create 2019-11-12 15:54
 */
public class Paizhang extends Officer {

    public Paizhang(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Mission request) {
        if (request.getEnemyNumber() >= 10 && request.getEnemyNumber() < 50) {
            System.out.println("排长" + name + "下达代号为" + request.getCode() + "的作" +
                    "战任务，敌人数量为" + request.getEnemyNumber());
        } else {
            if (this.successor != null) {
                this.successor.handleRequest(request);
            }
        }
    }
}
