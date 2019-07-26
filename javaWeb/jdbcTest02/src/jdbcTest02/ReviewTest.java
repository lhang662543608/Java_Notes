package jdbcTest02;


import jdk.nashorn.internal.scripts.JD;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author lhang
 * @create 2019-07-19 11:45
 */
public class ReviewTest {
    /**
     * 1. ResultSet 封装 JDBC 的查询结果.
     */
    @Test
    public void testResultSet(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            //1. 获取数据库连接
            connection = JDBCTools.getConnection();

            //2. 调用 Connection 对象的 createStatement() 方法获取 Statement 对象
            statement = connection.createStatement();

            //3. 准备 SQL 语句
//            String sql = "SELECT id, name, email, birth FROM customers";
            String sql = "SELECT id,name, email, birth FROM customers";

            //4. 发送 SQL 语句: 调用 Statement 对象的  executeQuery(sql) 方法.
            //得到结果集对象 ResultSet
            resultSet = statement.executeQuery(sql);

            //5. 处理结果集:
            //5.1 调用 ResultSet 的 next() 方法: 查看结果集的下一条记录是否有效,
            //若有效则下移指针
            while(resultSet.next()){
                //5.2 getXxx() 方法获取具体的列的值.
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                Date birth = resultSet.getDate(4);

                System.out.println(id+"\t"+name+"\t"+email+"\t\t"+birth);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            //6. 关闭数据库资源
            JDBCTools.releaseDB(resultSet,statement , connection);
        }
    }
    /**
     * 1. Statement 是用于操作 SQL 的对象
     */
    @Test
    public void testStatement() throws Exception {
        Connection connection = null;
        Statement statement = null;
        try {
            //1.获取数据库连接
            connection = JDBCTools.getConnection();
            //2.创建Statement对象：调用Connection对象的createStatement()方法获取Statement对象
            statement = connection.createStatement();
            //3.准备SQl语句
            String sql = "update customers set name = 'Tom' where id = 3";
            //4.执行sql语句：调用Statement对象的executeUpate(sql)方法
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //5.关闭资源:由里向外
            JDBCTools.releaseDB(statement, connection);
        }
    }

    /*public void releaseDB( ResultSet resultSet,Connection connection, Statement statement) {
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
    public void releaseDB(Connection connection, Statement statement) {
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
    }*/

    @Test
    public void testGetConnection2() throws Exception {
        Connection connection = JDBCTools.getConnection();

        System.out.println(connection);
    }

    /*public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
        String user = null;
        String password = null;
        String jdbcUrl = null;
        String driverClass = null;
        //0. 读取 jdbc.properties
        *//**
         * 1). 属性文件对应 Java 中的 Properties 类
         * 2). 可以使用类加载器加载 bin 目录(类路径下)的文件
         *//*
        Properties properties = new Properties();
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("jdbc.properties");
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
    }*/

    /**
     * Connection代表应用程序与数据库的链接
     */
    @Test
    public void testGetConnection() throws Exception {
        //1.准备获取连接的4个字符串:user password jdbcUrl driverClass
        String user = "root";
        String password = "lhang";
        String jdbcUrl = "jdbc:mysql:///project_java";
        String driverClass = "com.mysql.jdbc.Driver";
        //2.加载驱动:Class.forName(driverClass)
        Class.forName(driverClass);
        //3.调用
        //DriverManager.getConnection(jdbcUrl,user,password);
        //获取数据库连接
        Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

        System.out.println(connection);
    }

}
