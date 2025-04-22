package com.neoteric.javademo.bookmyshowdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bookmyshowdb", "root", "legion@2428");

        }catch (ClassNotFoundException | SQLException exception){
            throw new RuntimeException("Database connection failed: " + exception.getMessage());
        }

    }
}
