package cn.edu.nuc.JDBC;

public class JDBC_Test_08 {
    public static void main(String[] args) {
        String sql="delete from customers where id = ?";
        int id=19;
        JDBCUpdate. update(sql,id);

    }
}
