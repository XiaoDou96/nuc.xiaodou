package cn.edu.nuc.JDBC;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Properties;

public class JDBC_Test_06 {
    /**
     * 使用PreparedStatement来代替Statement,实现对数据表的增删改查
     * 增删改
     * 查
     */
    public static void main(String[] args)  {
        Connection conn=null;
        PreparedStatement preparedStatement=null;
        try {
            InputStream is =JDBC_Test_06.class.getClassLoader().getResourceAsStream(" jdbc.properties");
            Properties pros=new Properties();
            pros.load(is);
            String user=pros.getProperty("user");
            String password=pros.getProperty("password");
            String url=pros.getProperty("url");
            String driverClass=pros.getProperty("driverClass");
            Class.forName(driverClass);
            conn= DriverManager.getConnection(url,user,password);
            String sql="insert into customers (name,email,birth)values(?,?,?)";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,"小兜");
            preparedStatement.setString(2,"408460830@qq.com");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
            java.util.Date data = simpleDateFormat.parse("1999-09-06");
            preparedStatement.setDate(3, new java.sql.Date(data.getTime()));
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
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


    }
}
