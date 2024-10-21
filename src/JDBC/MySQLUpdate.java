package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySQLUpdate{
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://mysql-1eafdc82-siddharthshivwanshi-800b.e.aivencloud.com:16981/anudin";
        String user = "avnadmin";
        String password = "AVNS_p-A6W";

        String strQ="update students set first_name=?, last_name=?, date_of_birth=?, grade=? where student_id=? ;";
        String stuId="2";
        try( Connection con=DriverManager.getConnection(url,user,password);
        PreparedStatement pstmt=con.prepareStatement(strQ)){
            Class.forName("com.mysql.cj.jdbc.Driver");
            pstmt.setString(1, "Siddharth");
            pstmt.setString(2, "Shivwanshi");
            pstmt.setString(3, "2001-01-2");
            pstmt.setString(4, "A");
            pstmt.setString(5, stuId);

            int executeUpdate = pstmt.executeUpdate();

            System.out.println(executeUpdate+" row updated ");

        }catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

}
