package bank_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/bankmanagementsystem";
            String username = "root";
            String password = "Adiary56@";
            c = DriverManager.getConnection(url, username, password);
            
            // Create a statement
            s = c.createStatement();

        } catch (ClassNotFoundException | SQLException e) {
            // Handle exceptions appropriately
            e.printStackTrace();
        }
    }
}
