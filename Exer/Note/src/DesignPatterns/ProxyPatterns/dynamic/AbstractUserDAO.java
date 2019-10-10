package DesignPatterns.ProxyPatterns.dynamic;

/**
 * 抽象用户DAO类，抽象主题角色。
 *
 * @author lhang
 * @create 2019-09-23 16:27
 */
public interface AbstractUserDAO {
    public Boolean findUserById(String usrId);
}
