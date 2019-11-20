package chapter16_5;

/**
 * 某公司要开发一个软件系统的在线文档帮助系统，用户可以以在任何一个可以查询上下文中输入查询关键字，如果当前查询环境下没有任何相关内容，
 * 则系统会按照一定的顺序转发给其他查询环境。基于上述需求，是采用职责链模式对该系统进行设计。
 * @author lhang
 * @create 2019-11-12 16:29
 */
public class Client {
    public static void main(String[] args) {
        SearchContext jContext,sContext,uContext;
        jContext = new JavaSearchContext();
        sContext = new SQLSearchContext();
        uContext = new UMLSearchContext();
        jContext.setSuccessor(sContext);
        sContext.setSuccessor(uContext);
        String keyword = "Java 类图绘制疑惑";
        jContext.search(keyword);
    }
}
