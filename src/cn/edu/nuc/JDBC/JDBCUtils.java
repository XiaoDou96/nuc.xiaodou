package cn.edu.nuc.JDBC;


import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
/**
 * 工具类
 */
public class JDBCUtils {
    /*
    获取数据库连接
     */

    public static Connection getConnection() throws Exception {
        InputStream is =ClassLoader.getSystemClassLoader().getResourceAsStream(" jdbc.properties");
        Properties pros=new Properties();
        pros.load(is);
        String user= pros.getProperty("user");
        String password= pros.getProperty("password");
        String url= pros.getProperty("url");
        String driverClass= pros.getProperty("driverClass");
        Class.forName(driverClass);
        Connection conn= DriverManager.getConnection(url,user,password);
        return conn;
    }
    /*
    关闭数据库连接
     */
    public static void closeResource(Connection conn, PreparedStatement preparedStatement){
        try {
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void closeResource(Connection conn, PreparedStatement preparedStatement, ResultSet resultSet){
        try {
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }try {
            resultSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
