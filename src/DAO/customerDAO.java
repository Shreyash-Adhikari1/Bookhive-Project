/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Database.MySqlConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import Model.CustomerDetailsMode;

/**
 *
 * @author 97798
 */

    

public class customerDAO {

    MySqlConnection sql=new MySqlConnection();
    Connection connection= sql.openConnection();

    public boolean addCustomer(CustomerDetailsMode customer) {
        String sql = "INSERT INTO customers(name, address, gender, contact, email) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, customer.getCustomerName());
            statement.setString(2, customer.getAddress());
            statement.setString(3, customer.getGender());
            statement.setString(4, customer.getContact());
            statement.setString(5, customer.getCustomerEmail());
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        finally{
        closeConnection();
        }
       }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        CustomerDetailDAO customerDAO = new CustomerDetailDAO();
//        
//        // Create the table
//        customerDAO.createTable("John Doe", "123 Main St", "Male", "555-1234", "johndoe@example.com");
//
//        // Create a new Customer object
//        CustomerDetailDAO customer = new CustomerDetailDAO();
//
//        // Add the customer to the database
//        boolean success = customerDAO.addCustomer(customer);
//        if (success) {
//            System.out.println("Customer added successfully!");
//        } else {
//            System.out.println("Failed to add customer.");
//        }
//
//        // Close the connection
//        customerDAO.closeConnection();
//    }
}
