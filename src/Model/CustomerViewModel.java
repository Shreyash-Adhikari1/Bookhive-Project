/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class CustomerViewModel {
    private final int customerID;
    private final String customerName;
    private final String contactNumber;
    private final String email;
    private final String address;
    private final String gender;
    
    public CustomerViewModel(int customerID, String customerName, String contactNumber, String email, String address, String gender){
        this.customerID=customerID;
        this.customerName= customerName;
        this.contactNumber= contactNumber;
        this.email=email;
        this.address=address;
        this.gender=gender;
    }
    
    public int getCustomerID(){
        return customerID;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public String getContactNumber(){
        return contactNumber;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getGender(){
        return gender;
    }
}
