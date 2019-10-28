package chapter15_6;

/**
 * 在一个论坛中已注册用户和游客的权限不同，
 * 已注册的用户拥有发帖、修改自己的注册信息、修改自己的帖子的功能；
 * 而游客只能看到别人发的帖子，没有其他权限。
 * 试使用保护代理设计该权限管理模块。
 * @author lhang
 * @create 2019-10-28 15:19
 */
public class Client {
    public static void main(String[] args) {
        AbstractPermission permission = new PermissionProxy();
        permission.modifyUserInfo();
        permission.publishNote();
        permission.modifyNote();
        permission.viewNote();
        permission.setLevel(3);
        permission.modifyUserInfo();
        permission.publishNote();
        permission.modifyNote();
        permission.viewNote();
    }
}
