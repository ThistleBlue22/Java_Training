package com.spartaglobal.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Connection connection = null;
    public static Connection getConnection() throws IOException, SQLException {
        if (connection == null){
            // initialise the connection
            Properties properties = new Properties();
            properties.load(new FileReader("JDBCExample/mysql.properties"));
            connection = DriverManager.getConnection(
                    properties.getProperty("dbURL"),
                    properties.getProperty("dbUsername"),
                    properties.getProperty("dbPassword"));
        }
        return connection;
    }
    public static void closeConnection() throws SQLException {
        if (connection != null){
            connection.close();
        }
    }

    private ConnectionFactory(){

    }
}
