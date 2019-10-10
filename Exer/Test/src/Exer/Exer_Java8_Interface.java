package Exer;


/**
 * @author lhang
 * @create 2019-10-08 15:10
 */


public interface Exer_Java8_Interface {
    //public interface Exer_Java8_Interface extends people {        //编译通过
//public interface Exer_Java8_Interface extends person{      //编译失败:interface expected here
    default void display() {
        System.out.println("default method!");
        play();
    }

    static void play() {
        System.out.println("static method!");
    }

    String work();

}

interface extendInterface extends Exer_Java8_Interface {
    @Override
    default void display() {

    }

    @Override
    String work();
}

/*
class implementInterface implements Exer_Java8_Interface {

     //重写接口的默认方法
    @Override
    public void display() {

    }

   //实现接口的抽象方法。
    @Override
    public String work() {
        return null;
    }
}
*/




/*class person {
    private String name;
    private int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

interface people {
    public int age = 0;
    public String name = "";
}*/




