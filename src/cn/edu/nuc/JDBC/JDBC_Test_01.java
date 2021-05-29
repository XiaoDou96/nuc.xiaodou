package cn.edu.nuc.JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC_Test_01 {
    public static void main(String[] args) throws SQLException {
        Driver diver=new com.mysql.jdbc.Driver();
        Properties info = new Properties();
        info.setProperty("user","root");
        info.setProperty("password","root");

        String url = "jdbc:mysql://localhost:3306/test";
        Connection connection= diver.connect(url,info);
    }
}
