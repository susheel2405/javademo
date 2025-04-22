package com.neoteric.javademo.mysqlconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RetrieveEmployee {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/febwork";
        String username = "root";
        String password = "legion@2428";

        List<Employee> employeeList = new ArrayList<>();

        try {

            // loading the MYSQL JDBC Driver to establish the connection with MYSQL DatBase

            System.out.println("Loading JDBC Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");



            // Connecting to MYSQL Database
            Connection connection = DriverManager.getConnection(url, username, password);



            // Statement Object is created using connection object to execute the SQL Queries
            Statement statement = connection.createStatement();



            String sql = "SELECT * FROM febemployee";



            // Stores the data from the database which can be iterated
            ResultSet rs = statement.executeQuery(sql);



            // while Loop is used to iterate the resulset
            // This is a loop that continues as long as there are rows in the result set.
            while (rs.next()) {



                // Cretaing space in the heap
                Employee emp = new Employee(
                 rs.getString("name"),
                 rs.getInt("ID"),
                 rs.getString("department"),
                 rs.getDouble("salary")
                );

                // A new employee is created and added to the employeelist
                employeeList.add(emp);
            }

            rs.close();            //
            statement.close();    //    It is important to close the connection to free up the resources
            connection.close();  //

            System.out.println("\nEmployee List:");
            employeeList.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Exception Type: " + e.getClass().getName());
            System.out.println("Exception Message: " + e.getMessage());
            throw new Exception("Error occurred: " + e.getMessage());       // Rethrows the excption with a custom exception
        }
    }
}
