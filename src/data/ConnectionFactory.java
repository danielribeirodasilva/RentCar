package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

        public Connection getConnection() {
            try {
                return DriverManager.getConnection("jdbc:mysql://localhost/rentcar", "root", "25425643");
            } catch (SQLException e) {
                System.out.println("Falha conexão....");
                throw new RuntimeException(e);
                
            }
        }
    }