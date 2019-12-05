package chapter26_5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lhang
 * @create 2019-11-20 15:42
 */
public class CandidateList {
    private ArrayList<Person> list = new ArrayList<Person>();

    public void accept(AwardCheck check) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            ((Person) iterator.next()).accept(check);
        }
    }

    public void addPerson(Person person) {
        list.add(person);
    }

    public void removePerson(Person person) {
        list.remove(person);
    }
}
