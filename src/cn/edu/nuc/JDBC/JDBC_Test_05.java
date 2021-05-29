package cn.edu.nuc.JDBC;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class JDBC_Test_05 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        InputStream is = JDBC_Test_05.class.getClassLoader().getResourceAsStream(" jdbc.properties");
        Properties pros=new Properties();
        pros.load(is);
        String user= pros.getProperty("user");
        String password= pros.getProperty("password");
        String url= pros.getProperty("url");
        String driverClass= pros.getProperty("driverClass");
        Class.forName(driverClass);
        DriverManager.getConnection(url,user,password);

    }
}
