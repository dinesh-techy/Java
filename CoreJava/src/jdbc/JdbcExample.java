package jdbc;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) throws SQLException {

        // Configuration properties
        String url="jdbc:postgresql://localhost:5432/postgres";
        String userName="postgres";
        String password="dinesh12345";

        // Create connection
        Connection connection = DriverManager.getConnection(url,userName,password);
        // Create Statement
        Statement statement = connection.createStatement();
        // Execute a Statement
        ResultSet resultSet = statement.executeQuery("SELECT * from student_model;");

        String databaseData="";
        // We are mentioning the column Index
        while (resultSet.next()){
            databaseData=resultSet.getInt(1)+"...."+resultSet.getString(2)+"...."+resultSet.getInt(3)+"...."+resultSet.getString(4);
            System.out.println(databaseData);
        }

        // Close the statement and connection
        statement.close();
        connection.close();

    }
}
