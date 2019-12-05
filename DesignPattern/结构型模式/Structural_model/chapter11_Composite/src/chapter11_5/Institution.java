package chapter11_5;

import java.util.ArrayList;

/**
 * @author lhang
 * @create 2019-10-25 9:26
 */
public class Institution extends Unit {
    private ArrayList<Unit> list;
    private String name;

    public Institution(String name) {
        this.name = name;
        list = new ArrayList();

    }

    public void add(Unit unit) {
      list.add(unit);
    }


    @Override
    public void handleArchives() {
        for (Unit unit:list){
            unit.handleArchives();
        }
    }
}
