package jdbcTest02;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author lhang
 * @create 2019-07-19 19:49
 */
public class JDBCTools {

    /**
     * 获取数据库连接的方法
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
        String user = null;
        String password = null;
        String jdbcUrl = null;
        String driverClass = null;
        //0. 读取 jdbc.properties
        /**
         * 1). 属性文件对应 Java 中的 Properties 类
         * 2). 可以使用类加载器加载 bin 目录(类路径下)的文件
         */
        Properties properties = new Properties();
        InputStream in = JDBCTools.class.getClassLoader().getResourceAsStream("jdbc.properties");
        properties.load(in);
        //1.准备获取连接的4个字符串:user password jdbcUrl driverClass
        user = properties.getProperty("user");
        password = properties.getProperty("password");
        jdbcUrl = properties.getProperty("jdbcUrl");
        driverClass = properties.getProperty("driver");

        //2.加载驱动:Class.forName(driverClass)
        Class.forName(driverClass);
        //3.调用
        //DriverManager.getConnection(jdbcUrl,user,password);
        //获取数据库连接
        return DriverManager.getConnection(jdbcUrl, user, password);
    }

    /**
     * 释放资源的方法:ResultSet Statement Connection
     *
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void releaseDB(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        releaseDB(statement, connection);
    }

    /**
     * 释放资源的方法: Statement Connection
     *
     * @param statement
     * @param connection
     */
    public static void releaseDB(Statement statement, Connection connection) {
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
     * 执行sql方法
     *
     * @param sql：insert ，update ，delete 语句。不包含查询(select)语句。
     * @version 1.0
     */
    public static void update(String sql) {
        Connection connection = null;
        Statement statement = null;

        try {
            //1. 获取数据库连接
            connection = getConnection();

            //2. 调用 Connection 对象的 createStatement() 方法获取 Statement 对象
            statement = connection.createStatement();

            // 4. 发送 SQL 语句: 调用 Statement 对象的 executeUpdate(sql) 方法
            statement.executeUpdate(sql);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //6. 关闭数据库资源
            releaseDB( statement, connection);
        }
    }

    /**
     * 执行 SQL 语句, 使用 PreparedStatement
     * @param sql
     * @param args: 填写 SQL 占位符的可变参数
     */
    public static void update(String sql, Object ... args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCTools.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            for(int i = 0; i < args.length; i++){
                preparedStatement.setObject(i + 1, args[i]);
            }

            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            JDBCTools.releaseDB(null, preparedStatement, connection);
        }
    }
}
