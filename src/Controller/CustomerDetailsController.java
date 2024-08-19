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
 * @author Lenovo
 */
public class CustomerDetailsController {
    private final CustomerDetails cd;
    
    
    public CustomerDetailsController(CustomerDetails cd){
        this.cd=cd;
        
        cd.getAddBtn().addActionListener(new AddButtonListener());
    }
    
    
    private class AddButtonListener implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            AddbtnActionPerformed(evt);
        }
    }
    
    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt){
    
        // s
    }
    
}
