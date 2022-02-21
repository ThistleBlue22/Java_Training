package com.spartaglobal.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCMain {
    public static void main(String[] args) {
        //useStatement();
        userPreparedStatement();
    }

    private static void userPreparedStatement() {
        PreparedStatement preparedStatement;
        ResultSet rs;


        try(Connection connection = ConnectionFactory.getConnection()){
            preparedStatement = connection.prepareStatement("SELECT * FROM actor WHERE last_name LIKE ?");
            preparedStatement.setString(1, "Hurt");
            rs = preparedStatement.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString("first_name") + " " + rs.getString("last_name"));
            }
        } catch (SQLException|IOException e) {
            e.printStackTrace();
        }
    }

    private static void useStatement() {
        Statement statement;
        ResultSet rs;


        try(Connection connection = ConnectionFactory.getConnection()){
            statement = connection.createStatement();
            rs = statement.executeQuery("select * from actor");

            while(rs.next()){
                System.out.println(rs.getString("first_name") + " " + rs.getString("last_name"));
            }
        } catch (SQLException|IOException e) {
            e.printStackTrace();
        }
    }
}
