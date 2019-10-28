package chapter15_6;

/**
 * @author lhang
 * @create 2019-10-28 15:28
 */
public class PermissionProxy implements AbstractPermission {
    private RealPermission permission = new RealPermission();
    private int level = 0;

    @Override
    public void modifyUserInfo() {
        if (level > 0) {
            permission.modifyUserInfo();
        } else {
            System.out.println("请登录");
        }
    }

    @Override
    public void viewNote() {

        permission.viewNote();

    }

    @Override
    public void publishNote() {
        if (level > 0) {
            permission.publishNote();
        } else {
            System.out.println("请登录");
        }
    }

    @Override
    public void modifyNote() {
        if (level > 0) {
            permission.modifyNote();
        } else {
            System.out.println("请登录");
        }
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
