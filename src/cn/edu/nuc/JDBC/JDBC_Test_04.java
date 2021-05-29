package cn.edu.nuc.JDBC;


import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Test_04 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/test";
        String user="root";
        String password="root";
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection(url,user,password);
    }
}
