package chapter13_4;

/**
 * @author lhang
 * @create 2019-10-25 21:08
 */
public class ExtendedFacade extends AbstractFacade {
    @Override
    public void execute() {
        FileOperation.read();
        XMLDataConvertor.convert();
        DataAnalysis.handle();
        ReportDisplay.display();
    }
}
