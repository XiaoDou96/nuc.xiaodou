package cn.edu.nuc.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class  JDBC_Test_07 {
    public static void main(String[] args) throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql="update  customers set name = ? where id= ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1,"小兜兜");
        preparedStatement.setObject(2,19);
        JDBCUtils.closeResource(connection,preparedStatement);
    }
}
