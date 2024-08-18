/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.AdminData;
import java.sql.*;
import Database.MySqlConnection;
/**
 *
 * @author 97798
 */
// Assume conn is a valid and open JDBC Connection object



public class LoginDAO {
    MySqlConnection mysql= new MySqlConnection();
    Connection conn= mysql.openConnection();

    // Constructor to initialize the database connection

    // Method to authenticate a user
    public boolean authenticateUser(String email, String password) {
      
        
        String query = "SELECT PASSWORD FROM user WHERE USER_ID = ?";

        try (java.sql.PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String realPassword = rs.getString("PASSWORD");
                return realPassword.equals(password); // Assuming passwords are stored as plain text
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Method to save a new user
    public boolean saveUser(AdminData user) {
        
        String query = "INSERT INTO user(USER_ID, PASSWORD) VALUES (?, ?)";

        try (java.sql.PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, user.getUserId());
            pstmt.setString(2, user.getPassword());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}




