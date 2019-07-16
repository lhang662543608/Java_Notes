package sylu.java;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 了解类的加载器
 *
 * @author lhang
 * @create 2019-07-03 5:39
 */
public class ClassLoaderTest {
    @Test
    public void test1() {
        //对于自定义类，使用系统类加载器进行加载。
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        //调用系统类加载器的getParent(),可以获取扩展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
        //调用扩展类的getParent()，无法获取引导类的加载器。
        //引导类加载器主要负责加载java核心类库无法加载自定义类。
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);
    }

    /*
        Properties:用来读取配置文件。
     */
    @Test
    public void test2() throws Exception {
        Properties pros = new Properties();
        //此时的文件默认在当前module下。
        //读取配置文件的方式一
        //FileInputStream fis = new FileInputStream(new File("jdbc.properties"));
        FileInputStream fis = new FileInputStream(new File("src\\jdbc1.properties"));
        pros.load(fis);

        //读取配置文件的方式二：使用ClassLoader
        //配置文件默认识别为，当前module的src下
//        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
//        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
//        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println(user + ":" + password);


    }
}
