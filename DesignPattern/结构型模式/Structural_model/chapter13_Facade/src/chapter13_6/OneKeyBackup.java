package chapter13_6;

/**
 * @author lhang
 * @create 2019-10-25 22:04
 */
public class OneKeyBackup {
    private FileManager fm = new FileManager();
    private MessageManager mm = new MessageManager();
    private ContactManager cm = new ContactManager();

    public void click() {
        fm.backup();
        mm.backup();
        cm.backup();
    }
}
