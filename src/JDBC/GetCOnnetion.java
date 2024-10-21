package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetCOnnetion {
    static Connection con;
    static String url="jdbc:mysql://mysql-1eafdc82-siddharthshivwanshi-800b.e.aivencloud.com:16981/anudin";
    static String user="avnadmin";
    static String password="A6W";

    static Connection getcon(){
        if(con==null){
            GetCOnnetion.makeCon();
        }
        return con;
    }

    static void makeCon(){
        try {
            con= DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
