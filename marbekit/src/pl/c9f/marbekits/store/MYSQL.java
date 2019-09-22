package pl.c9f.marbekits.store;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MYSQL{

    private Connection connection;
    
    public void connect() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://" + Settings.DATABASE_MYSQL_HOST + ":" + Settings.DATABASE_MYSQL_PORT + "/" + Settings.DATABASE_MYSQL_NAME, Settings.DATABASE_MYSQL_USER, Settings.DATABASE_MYSQL_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (this.connection != null) this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String query) {
        try {
            if (this.connection != null) return this.connection.createStatement().executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void executeUpdate(String update) {
        try {
            if (this.connection != null) this.connection.createStatement().executeUpdate(update);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
