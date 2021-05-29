package cn.edu.nuc.JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC_Test_02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        //获取driver实现类对象，使用反射
        Class clazz=Class.forName("com.mysql.jdbc.Driver");
        Driver driver= (Driver) clazz.newInstance();
        //提供要连接的数据库
         String url="jdbc:mysql://localhost:3306/test";
        Properties info=new Properties();
        info.setProperty("user","root");
        info.setProperty("password","root");
        Connection connection=driver.connect(url,info);
    }
}
