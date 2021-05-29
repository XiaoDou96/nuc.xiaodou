package cn.edu.nuc.JDBC;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBCSelect {
    public static Customers queForCustomers(String sql,Object...args){
        Connection conn= null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            conn = JDBCUtils.getConnection();
            preparedStatement = conn.prepareStatement(sql);
            for(int i=0;i<args.length;i++){
                preparedStatement.setObject(i+1,args[i]);
            }

            resultSet = preparedStatement.executeQuery();
            ResultSetMetaData rsmd=resultSet.getMetaData();
            int Columncount= rsmd.getColumnCount();
            if(resultSet.next()){
                Customers customers=new Customers();
                for(int i=0;i<Columncount;i++){
                    Object columnObject=resultSet.getObject(i+1);
                    String columnLabel=rsmd.getColumnLabel(i+1);
                    Field field = Customers.class.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(customers,columnObject);
                }
                JDBCUtils.closeResource(conn,preparedStatement,resultSet);
                return customers;

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,preparedStatement,resultSet);
        }
            return null;

    }
}
