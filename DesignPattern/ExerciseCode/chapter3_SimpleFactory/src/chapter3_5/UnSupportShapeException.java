package chapter3_5;

/**
 * @author lhang
 * @create 2019-10-10 22:52
 */
public class UnSupportShapeException extends Exception {
    static final long serialVersionUID = -7034897193246939L;

    public UnSupportShapeException(){

    }

    public UnSupportShapeException(String msg){
        super(msg);
    }
}
