/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class BookViewModel {
    private final int bookID;
    private final String bookName;
    private final String customerName;
    private final String contactNumber;
    private final String issuedDate;
    private final String  returnDate;
    
    public BookViewModel(int bookID, String bookName, String customerName, String contactNumber, String issuedDate, String returnDate){
        this.bookID=bookID;
        this.bookName=bookName;
        this.customerName=customerName;
        this.contactNumber=contactNumber;
        this.issuedDate=issuedDate;
        this.returnDate=returnDate;
    }
    
    public int getBookID(){
        return bookID;
    }
    
    public String getBookName(){
        return bookName;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public String getContactNumber(){
        return contactNumber;
    }
    
    public String getIssuedDate(){
        return issuedDate;
    }
    
    public String getReturnDate(){
        return returnDate;
    }
}

