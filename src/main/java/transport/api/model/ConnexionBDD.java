package transport.api.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBDD {
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/nba";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "elyse";

    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
    }
}
