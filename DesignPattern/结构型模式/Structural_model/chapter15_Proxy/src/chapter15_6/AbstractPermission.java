package chapter15_6;

/**
 * @author lhang
 * @create 2019-10-28 15:00
 */
public interface AbstractPermission {
    void modifyUserInfo();

    void viewNote();

    void publishNote();

    void modifyNote();

    void setLevel(int level);
}
