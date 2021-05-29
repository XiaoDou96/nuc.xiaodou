package cn.edu.nuc.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCUpdate {
    public static void update(String sql,Object ...args){
        Connection connection= null;
        PreparedStatement preparedStatement= null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            for(int i=0;i<args.length;i++){
                preparedStatement.setObject(i+1,args[i]);
            }
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection,preparedStatement);
        }

    }
}
