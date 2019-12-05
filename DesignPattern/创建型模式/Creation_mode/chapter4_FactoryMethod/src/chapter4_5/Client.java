package chapter4_5;

/**
 * 在某数据统计系统中，曲线图创建器生成曲线图，柱状图生成器生成柱状图，
 * 试使用工厂方法模式设计该系统，要求绘制相应的类图并使用java语言编程模拟实现。
 * @author lhang
 * @create 2019-10-11 13:23
 */
public class Client {
    public static void main(String[] args) {
        ChartFactory factory;
        Chart chart;
        factory = (ChartFactory) XMLUtil.getBean();
        chart = factory.produceChart();
        chart.display();
    }
}
