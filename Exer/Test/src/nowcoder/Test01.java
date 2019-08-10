package nowcoder;

/**
 * @author lhang
 * @create 2019-08-10 9:35
 */
public class Test01 {
    public static void main(String[] args) {
        Base base = new Son();
        base.method();
//        base.methodB();
                    /*err：编译不通过
                        ---> Base base = new Son();
                        多态Base没有声明methodB方法。*/
    }
}

class Base {
    public void method() {
        System.out.println("Base");
    }
}

class Son extends Base {
    public void method() {
        System.out.println("Son");
    }

    public void methodB() {
        System.out.println("SonB");
    }
}