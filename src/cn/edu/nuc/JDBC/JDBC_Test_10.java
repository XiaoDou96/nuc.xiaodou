package cn.edu.nuc.JDBC;

public class JDBC_Test_10 {
    public static void main(String[] args) {
        String sql="select id,name,birth,email from customers where id= ?";
        int id=2;
        Customers customers=JDBCSelect.queForCustomers(sql,id);
        System.out.println(customers);
    }
}
