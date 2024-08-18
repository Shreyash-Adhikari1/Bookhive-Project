/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Database.MySqlConnection;
import Model.Book;
import Model.CustomerDetailsMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 97798
 */
public class bookDAO {
    MySqlConnection sql=new MySqlConnection();
    Connection connection= sql.openConnection();
    public boolean addBook(Book bkk) {
        String sql = "INSERT INTO book(name,Cname, contact,issueDate,returnDate) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, bkk.getName());
            statement.setString(2, bkk.getCname());
            statement.setString(3, bkk.getContact());
            statement.setString(4, bkk.getIssueDate());
            statement.setString(5, bkk.getReturnDate());
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
       }
    public boolean deleteBook(int id){
       Connection conn=sql.openConnection();
       try{
           
           String sql="DELETE FROM book WHERE id="+id;
           PreparedStatement pst=conn.prepareStatement(sql);
           pst.execute();
           return true;
           
        }catch(Exception e){
            System.out.println(e);
        }
       finally{
           sql.closeConnection(conn);
       }
       return false;
   }
}
