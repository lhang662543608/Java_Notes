package chapter3_4;

/**
 * 工厂角色
 * @author lhang
 * @create 2019-10-10 22:10
 */
public class Nvwa {
    public static Person makePerson(char arg) {
        Person person = null;
        if (arg == 'M') {
            person = new Man();
        } else if (arg == 'W') {
            person = new Woman();
        } else if (arg == 'R') {
            person = new Robot();
        }
        return person;
    }
}
