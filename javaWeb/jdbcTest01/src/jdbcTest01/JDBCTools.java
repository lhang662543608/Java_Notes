package jdbcTest01;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 操作JDBC的工具类。其中封装了一些工具方法。
 *
 * @author lhang
 * @version 1.0
 * @create 2019-07-19 9:46
 */
public class JDBCTools {
    public static void release(ResultSet resultSet,
                               Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 关闭Statement和Connection
     * @param statement
     * @param connection
     */
    public static void release(Statement statement, Connection connection) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 1.获取连接的方法。
     * 通过读取配置文件从数据库服务器获取一个连接。
     *
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        //1. 准备连接数据库的 4 个字符串.
        //1). 创建 Properties 对象
        Properties properties = new Properties();

        //2). 获取 jdbc.properties 对应的输入流
        InputStream in =
                JDBCTools.class.getClassLoader().getResourceAsStream("jdbc.properties");
        System.out.println();
        //3). 加载 2） 对应的输入流
        properties.load(in);

        //4). 具体决定 user, password 等4 个字符串.
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String jdbcUrl = properties.getProperty("jdbcUrl");
        String driver = properties.getProperty("driver");

        //2. 加载数据库驱动程序(对应的 Driver 实现类中有注册驱动的静态代码块.)
        Class.forName(driver);

        //3. 通过 DriverManager 的 getConnection() 方法获取数据库连接.
        return DriverManager.getConnection(jdbcUrl, user, password);
    }
}
