package chapter25_4;

/**
 * 在银行办理业务时一般都包含几个基本步骤，首先需要排队取号，然后办理具体业务，最后需要对银行工作人员进行评分。
 * 无论具体业务是取款、存款还是转账，其基本流程都一样。
 * 现使用模板方法模式模拟银行业务办理流程，要求绘制相应的类图并使用java语言编程模拟实现。
 *
 * @author lhang
 * @create 2019-11-20 9:59
 */
public class Client {
    public static void main(String[] args) {
        BankTemplateMethod bank = (BankTemplateMethod) XMLUtil.getBean();
        bank.process();
    }
}
