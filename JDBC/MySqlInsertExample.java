package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlInsertExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://mysql-1eafdc82-siddharthshivwanshi-800b.e.aivencloud.com:16981/anudin";
        String user = "avnadmin";
        String password = "AVNS_p-pByAc3oT8SAs5Uh6W";

        String firstName = "laavn";
        String lastName = "Doe";
        String dateOfBirth = "2001-02-15"; // YYYY-MM-DD
        String grade = "B";

        String sql = "INSERT INTO students (first_name, last_name, date_of_birth, grade) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, dateOfBirth);
            preparedStatement.setString(4, grade);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
        } catch (SQLException e) {
            System.out.println("Insertion failed.");
            e.printStackTrace();
        }
    }
}
