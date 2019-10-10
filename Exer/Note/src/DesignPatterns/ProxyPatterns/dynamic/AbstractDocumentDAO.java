package DesignPatterns.ProxyPatterns.dynamic;

/**
 * 抽象文档DAO类，抽象主题角色。
 *
 * @author lhang
 * @create 2019-09-23 16:34
 */
public interface AbstractDocumentDAO {
    public Boolean deleteDocumentById(String documentId);
}
