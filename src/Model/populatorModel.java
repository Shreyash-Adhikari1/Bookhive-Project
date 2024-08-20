/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class populatorModel{
    public int id;
    private  String customerName;
    private  String gender;
    private String address;
    private String contact;
    private String customerEmail;
                
    public String getName(){
        return customerName;
    }
    
    public String getGender(){
       return gender; 
    }

    public String getAddress(){
        return address;
    }
    
    public String getContact(){
        return contact;
    }
    
    public String getEmail(){
        return customerEmail;
    }
    public void setName(String name){
        this.customerName=name;
    }
    
    public void setGender(String gender){
       this.gender= gender;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public void setContact(String contact){
       this.contact=contact;
    }
    
    public void setEmail(String customerEmail){
        this.customerEmail=customerEmail;
    }
}
