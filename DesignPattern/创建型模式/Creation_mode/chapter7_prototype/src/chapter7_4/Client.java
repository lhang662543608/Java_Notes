package chapter7_4;

import java.io.IOException;

/**
 * 某数据处理单元需要增加一个图表复制功能，在图表（DataChart）对象中包含一个数据集（DataSet）对象，
 * 数据集对象用于封装待显示的数据，用户可以通过界面上的“复制”按钮将该图表复制一份，
 * 复制后即可得到新的图表对象，然后可以修改新图标的编号、颜色和数据。
 * 试使用原型设计模式设计该软件并使用java代码模拟>>深克隆<<实现。
 *
 * @author lhang
 * @create 2019-10-16 14:42
 */
public class Client {
    public static void main(String[] args) {
        DataChart chart_prev, chart_new = null;
        chart_prev = new DataChart();
        DataSet dataSet = new DataSet();
        chart_prev.setDs(dataSet);
        try {
            chart_new = (DataChart) chart_prev.deepClone();
        } catch (Exception e) {
            System.out.println("克隆失败！！！");
        }

        //比较DataChart
        System.out.println("图表是否相同？" + (chart_prev == chart_new));//false
        //比较DataSet
        System.out.println("数据集是否相同？" + (chart_prev.getDs() == chart_new.getDs()));//false
    }
}
