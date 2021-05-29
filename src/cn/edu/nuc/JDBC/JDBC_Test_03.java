package cn.edu.nuc.JDBC;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Test_03 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class clazz=Class.forName("com.mysql.jdbc.Driver");
        Driver driver= (Driver) clazz.newInstance();
        String url="jdbc:mysql://localhost:3306/test";
        String user="root";
        String password="root";
        DriverManager.registerDriver(driver);
        DriverManager.getConnection(url,user,password);
    }
}
