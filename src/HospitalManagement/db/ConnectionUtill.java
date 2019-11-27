/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rasel
 */
public class ConnectionUtill {

    Connection connection = null;
    String driverName = "com.mysql.jdbc.Driver";
    static String URL = "jdbc:mysql://localhost:3306/hospitalmanagement";
    static String USER = "root";
    static String PASSWORD = "";

    public ConnectionUtill() {
    }

    protected Connection doConnection() throws ClassNotFoundException, SQLException {

        Class.forName(driverName);
        connection = DriverManager.getConnection(URL, USER, PASSWORD);

        return connection;
    }
}
