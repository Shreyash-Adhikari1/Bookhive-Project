/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.CustomerDetails;
import View.CustomerView;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CustomerViewController {
    private final CustomerView view;
    
        public CustomerViewController(CustomerView view){
        this.view=view;
        
        view.getUpdateDetailsButton().addActionListener(new UpdateCustomerButtonListener());
        
        view.getDeleteCustomerButton().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteCustomerbutotnMouseClicked(evt);
            }
        });
        
        }
}
