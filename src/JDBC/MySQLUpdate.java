package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySQLUpdate{
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://mysql-1eafdc82-siddharthshivwanshi-800b.e.aivencloud.com:16981/anudin";
        String user = "avnadmin";
        String password = "AVNS_p-pByAc3oT8SAs5Uh6W";

        String strQ="";

        try( Connection con=DriverManager.getConnection(url,user,password);
        PreparedStatement pstmt=con.prepareStatement(strQ)){
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        }catch (Exception e) {
            // TODO: handle exception

        }
    }
}