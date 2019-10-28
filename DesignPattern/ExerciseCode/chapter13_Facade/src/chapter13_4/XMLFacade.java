package chapter13_4;

/**
 * @author lhang
 * @create 2019-10-25 21:08
 */
public class XMLFacade extends AbstractFacade {
    @Override
    public void execute() {
        FileOperation.read();
        DataAnalysis.handle();
        ReportDisplay.display();
    }
}
