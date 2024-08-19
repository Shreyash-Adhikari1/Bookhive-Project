/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.populatorModel;
import java.util.List;
import Database.MySqlConnection;
import Model.Book;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 97798
 */
public class BookPopulatorDAO {
    MySqlConnection sql=new MySqlConnection();
    List<Book> listpopu=new ArrayList<>();
    public List<Book> fetchBook(){
        Connection conn=sql.openConnection();
        String sqlQuery="SELECT id,name,Cname,contact,issueDate,returnDate FROM book";
        try{
          ResultSet result=sql.runQuery(conn, sqlQuery);
          while(result.next()){
              Book pp=new Book();
              pp.setId(result.getInt("id"));
              pp.setName(result.getString("name"));
              pp.setCname(result.getString("Cname"));
              pp.setIssueDate(result.getString("issueDate"));
              pp.setContact(result.getString("contact"));
              pp.setReturnDate(result.getString("returnDate"));
              listpopu.add(pp);
          }
          result.close();
        }
        catch(Exception e){
            System.out.println(e);
        return null;
        }
        return listpopu;
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
