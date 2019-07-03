package sylu.java2;

import org.junit.Test;
import sylu.java1.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 获取当前运行时类的属性结构。
 *
 * @author lhang
 * @create 2019-07-03 8:04
 */
public class FieldTest {
    @Test
    public void test1() {
        Class<Person> clazz = Person.class;
        //获取属性结构
        //getFields（）：获取当前运行时类及其父类中声明为public访问权限的属性。
        Field[] fields = clazz.getFields();
        for (Field f :
                fields) {
            System.out.println(f);
        }

        System.out.println("********************");
        //getDeclaredFields():获取当前运行时类中的声明所有的属性。(不包含父类中声明的属性)
        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field f :
                declaredFields) {
            System.out.println(f);
        }
    }

    //权限修饰符， 数据类型 ，变量名，
    @Test
    public void test2() {
        Class<Person> clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            //1.权限修饰符
                /*
                2=====>private
                0=====>
                1=====>public
                */
            int modifiers = f.getModifiers();
            System.out.print(modifiers + "=>" + Modifier.toString(modifiers)+"\t");
            //2.数据类型
            Class<?> type = f.getType();
            System.out.print(type.getName()+"\t");
            //3.变量名
            String name = f.getName();
            System.out.print(name);

            System.out.println();
        }
    }
}
