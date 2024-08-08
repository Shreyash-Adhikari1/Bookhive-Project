/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class BookingDetailsModel {
    private final String cusName;
    private final String cusContact;
    private final String bookName;
    private final String issuedDate;
    private final String returnedDate;
    
    public BookingDetailsModel(String cusName, String cusContact, String bookName, String issuedDate, String returnedDate){
        this.cusName=cusName;
        this.cusContact=cusContact;
        this.bookName=bookName;
        this.issuedDate=issuedDate;
        this.returnedDate=returnedDate;
    }
    
    public String getCusName(){
        return cusName;
    }
    
    public String getCusContact(){
        return cusContact;
    }
    
    public String getBookName(){
        return bookName;
    }
    
    public String getIssuedDate(){
        return issuedDate;
    }
    
    public String getReturnedDate(){
        return returnedDate;
    }
}
