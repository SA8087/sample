package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

    public static void main(String[] args) {
        try {
            // loading driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");

            // create connection object
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "root");
            System.out.println("Connected to the database successfully");

            // create statement
            String query = "CREATE TABLE IF NOT EXISTS student(stno INT, stname VARCHAR(20), age INT)";
            Statement st = con.createStatement();

            // execute query
            st.executeUpdate(query);
            System.out.println("Table created successfully");

            // close connection
            con.close();
            System.out.println("Connection closed successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        } catch (SQLException e) {
            System.out.println("Error in database connection or query execution");
        }
    }
}


