package chapter15_6;

/**
 * @author lhang
 * @create 2019-10-28 15:26
 */
public class RealPermission implements AbstractPermission {
    @Override
    public void modifyUserInfo() {
        System.out.println("修改注册信息");
    }

    @Override
    public void viewNote() {
        System.out.println("查看帖子");
    }

    @Override
    public void publishNote() {
        System.out.println("发帖");
    }

    @Override
    public void modifyNote() {
        System.out.println("修改帖子");
    }

    @Override
    public void setLevel(int level) {

    }
}
