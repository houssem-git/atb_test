package atb_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private static ConnectionDB instance;
    private Connection connexion;
    private String url = "JDBC:mysql://localhost:3306/atb";
    private String user = "root";
    private String password = "";

    private ConnectionDB() {
        try {
        	// Establish connection object
            connexion = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println("Probleme de connexion");
        }
    }

    public static ConnectionDB getInstance() {
        if (ConnectionDB.instance == null) {
            ConnectionDB.instance = new ConnectionDB();
        }
        return ConnectionDB.instance;
    }

    public Connection getConnexion() {
        return this.connexion;
    }

}
