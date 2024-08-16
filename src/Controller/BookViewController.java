/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.BooksView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class BookViewController {
    public BookViewController(BooksView book){
        this.book=book;
        
        book.getUpdateBookButton().addActionListener(new BookViewController.UpdateButtonListener());
        
          book.getDeleteBookButton().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBookbuttonMouseClicked(evt);
            }
        });
        
    }
    private class UpdateButtonListener implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            UpdateBookButtonActionPerformed(evt);
        }
}

private void UpdateBookButtonActionPerformed(java.awt.event.ActionEvent evt){
        String bookIdText = book.getBookIdField().getText();
        String customerName = book.getCustomerNameField().getText().trim();
        String contact = book.getContactField().getText().trim();
        String bookName = book.getBookNameField().getText().trim();
        String issuedDate = book.getIssuedDateField().getText().trim();
        String returnDate = book.getReturnDateField().getText().trim();
        if(customerName.isEmpty() || contact.isEmpty() || bookName.isEmpty() || issuedDate.isEmpty() || returnDate.isEmpty()){
            JOptionPane.showMessageDialog(book,"Please enter all the field");
            return;
        }
        if(contact.length()!=10){
            JOptionPane.showMessageDialog(book,"Contact Number must be 10 digit");
        }
        int bookID = Integer.parseInt(bookIdText);
    String datePattern = "MM/dd/yyyy";
    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
        dateFormat.setLenient(false);
        dateFormat.parse(issuedDate);
        dateFormat.parse(returnDate);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(book,"Invalid date format. Please use MM/dd/yyyy");
        return;
    }
}
}
