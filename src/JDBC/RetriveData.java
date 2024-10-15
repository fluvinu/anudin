package JDBC;

import java.sql.*;

public class RetriveData {
    public static void main(String[] args)  {
        String url = "jdbc:mysql://mysql-1eafdc82-siddharthshivwanshi-800b.e.aivencloud.com:16981/anudin";
        String user = "avnadmin";
        String password = "AVNS_p-pByAc3oT8SAs5Uh6W";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String qry="select * from students";
        try (final Connection conc= DriverManager.getConnection(url,user,password)){

            Statement stmt=conc.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            while (rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
