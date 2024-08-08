/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class CustomerDetailsModel {
    private final String customerName;
    private final String gender;
    private final String address;
    private final String contact;
    private final String customerEmail;
    
    public CustomerDetailsModel(String customerName, String gender, String address, String contact, String customerEmail){
        this.customerName=customerName;
        this.gender= gender;
        this.address=address;
        this.contact=contact;
        this.customerEmail=customerEmail;
    }
    
    public String getCustomerName(){
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
    
    public String getCustomerEmail(){
        return customerEmail;
    }
}
