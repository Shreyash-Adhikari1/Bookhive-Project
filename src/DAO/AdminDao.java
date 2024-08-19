package Dao;

import Database.MySqlConnection;
import Model.LoginRequest;
import Model.AdminData;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminDao {
    MySqlConnection mysql = new MySqlConnection();

    public AdminData login(LoginRequest login) {
        Connection conn = mysql.openConnection();
        String sql = "SELECT PASSWORD FROM admin WHERE USER_ID = ?";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, login.getUserId());
            ResultSet result = pstmt.executeQuery();
            
            if (result.next()) {
                String realPassword = result.getString("PASSWORD");
                if (realPassword.equals(login.getPassword())) {
                    System.out.println("LOGIN " + login.getUserId());
                    AdminData admin = new AdminData(login.getUserId(), realPassword);
                    return admin;
                } else {
                    return null; // Invalid password
                }
            } else {
                return null; // User ID not found
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            mysql.closeConnection(conn);
        }
        return null;
    }
}
