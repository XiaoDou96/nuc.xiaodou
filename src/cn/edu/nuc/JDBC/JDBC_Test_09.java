package cn.edu.nuc.JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_Test_09 {
    public static void main(String[] args) {
        ResultSet resultSet=null;
        Connection conn=null;
        PreparedStatement preparedStatement=null;
        try {
            conn=JDBCUtils.getConnection();
            String sql="select id,name,email,birth from customers ";
            preparedStatement= conn.prepareStatement(sql);
            resultSet= preparedStatement.executeQuery();
            if(resultSet.next()){
               int id=resultSet.getInt(1);
               String name=resultSet.getString(2);
               String email=resultSet.getString(3);
                Date birth=resultSet.getDate(4);
                Customers customers=new Customers(id,name,email,birth);
                System.out.println(customers.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            JDBCUtils.closeResource(conn,preparedStatement,resultSet);
        }
    }
}
