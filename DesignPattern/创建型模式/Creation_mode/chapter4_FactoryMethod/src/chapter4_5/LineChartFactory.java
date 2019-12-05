package chapter4_5;

/**
 * @author lhang
 * @create 2019-10-11 14:43
 */
public class LineChartFactory implements ChartFactory {
    @Override
    public Chart produceChart() {
        return new LineChart();
    }
}
