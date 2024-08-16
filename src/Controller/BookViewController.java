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
}
