package chapter4_5;

/**
 * @author lhang
 * @create 2019-10-11 14:45
 */
public class BarChartFactory implements ChartFactory {
    @Override
    public Chart produceChart() {
        return new BarChart();
    }
}
