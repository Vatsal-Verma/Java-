import java.sql.*;

public class Conn2 {
    public static void main(String[] args) {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set the connection URL
            String url = "jdbc:mysql://localhost/conn";

            // Set the username and password
            String username = "root";
            String password = "";

            // Connect to the database
            Connection conn = DriverManager.getConnection(url, username, password);

            // Check if the connection is successful
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to connect to the database.");
            }

            // Close the connection
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error while connecting to the database.");
            e.printStackTrace();
        }
    }
}