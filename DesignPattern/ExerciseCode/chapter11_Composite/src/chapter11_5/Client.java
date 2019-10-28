package chapter11_5;

import java.net.HttpURLConnection;

/**
 * 某教育机构的组织结构如图所示：
 * 在该教育机构的OA系统中可以给各级办公室下发公文，现采用组合模式设计该机构的组织结构，
 * 绘制相应的类图并使用java语言编程模拟实现，在客户端代码中模拟下发公文。
 *
 * @author lhang
 * @create 2019-10-25 8:52
 */
public class Client {
    public static void main(String[] args) {

        Office educationOffice, administrationOffice;
        educationOffice = new Office("教务办公室");
        administrationOffice = new Office("行政办公室");

        Institution BeiJing, HuNan, ChangSha, XiangTan;
        BeiJing = new Institution("北京总部");
        BeiJing.add(educationOffice);
        BeiJing.add(administrationOffice);
        HuNan = new Institution("湖南分校");
        BeiJing.add(HuNan);

        HuNan.add(educationOffice);
        HuNan.add(administrationOffice);

        ChangSha = new Institution("长沙教学点");
        XiangTan = new Institution("湘潭教学点");

        HuNan.add(ChangSha);
        HuNan.add(XiangTan);

        ChangSha.add(educationOffice);
        ChangSha.add(administrationOffice);

        XiangTan.add(educationOffice);
        XiangTan.add(administrationOffice);


        BeiJing.handleArchives();

    }
}
