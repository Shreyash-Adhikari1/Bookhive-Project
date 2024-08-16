/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;



/**
 *
 * @author Lenovo
 */
import View.BookingDetails;
import View.BooksView;
import javax.swing.JOptionPane;
public class BookingDetailsController {
    private final BookingDetails bd;
    
    
    public BookingDetailsController(BookingDetails bd){
        this.bd=bd;
        
        bd.getAddButton().addActionListener(new AddButtonListener());
    }
    
    
    private class AddButtonListener implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            AddbtnActionPerformed(evt);
        }
    }
    
    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt){
    
        String customerName = bd.getCustomerNameField().getText().trim();
        String contact = bd.getContactField().getText().trim();
        String bookName = bd.getBookNameField().getText().trim();
        String issuedDate = bd.getIssuedField().getText().trim();
        String returnDate = bd.getReturnField().getText().trim();
        if(customerName.isEmpty() || contact.isEmpty() || bookName.isEmpty() || issuedDate.isEmpty() || returnDate.isEmpty()){
            JOptionPane.showMessageDialog(bd,"Please enter all the field");
            return;
        }
        if(contact.length()!=10){
            JOptionPane.showMessageDialog(bd,"Contact Number must be 10 digit");
        }
        else{          
            BooksView book = new BooksView();
            book.setVisible(true);
            bd.dispose();
        }
    }
}
