package chapter9_8;

import chapter9_8.ObjectAdapter.CipherAdapter;
import chapter9_8.ObjectAdapter.DataOperator;
import chapter9_8.ObjectAdapter.NewCipherAdapter;

/**
 * 某OA系统需要提供一个加密某块，将用户机密信息（例如口令、邮箱等）加密之后存储在数据库中，系统易筋经定义好了数据库的操作类。
 * 为了提供开发效率，现在需要重用已有的加密算法，这些算法 封装在第三方提供的类中，有些甚至没有源代码。
 * 试使用适配器模式设计该加密模块，实现在不修改现有类的基础上重用第三方加密方法。
 * 要求绘制相应的类图并使用java 语言编程模拟实现，需提供对象适配器和类适配器两台解决方案。
 * @author lhang
 * @create 2019-10-24 21:21
 */
public class Client {
    public static void main(String[] args) {
        DataOperator dataOperator;
//        dataOperator = new NewCipherAdapter();
        dataOperator = new CipherAdapter();
        dataOperator.setPassword("haha");
        String doEncryptPassword = dataOperator.doEncrypt(1024, dataOperator.getPassword());
        System.out.println(doEncryptPassword);
    }
}
