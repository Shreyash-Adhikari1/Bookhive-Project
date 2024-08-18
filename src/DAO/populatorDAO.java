/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.populatorModel;
import java.util.List;
import Database.MySqlConnection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 97798
 */
public class populatorDAO {
    MySqlConnection sql=new MySqlConnection();
    List<populatorModel> listpopu=new ArrayList<>();
    public List<populatorModel> fetchCustomers(){
        Connection conn=sql.openConnection();
        String sqlQuery="SELECT id,name,address,gender,contact,email FROM customers";
        try{
          ResultSet result=sql.runQuery(conn, sqlQuery);
          while(result.next()){
              populatorModel pp=new populatorModel();
              pp.id=result.getInt("id");
              pp.setName(result.getString("name"));
              pp.setAddress(result.getString("address"));
              pp.setGender(result.getString("gender"));
              pp.setContact(result.getString("contact"));
              pp.setEmail(result.getString("email"));
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
    public boolean deleteCustomer(int id){
       Connection conn=sql.openConnection();
       try{
           
           String sql="DELETE FROM customers WHERE id="+id;
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
