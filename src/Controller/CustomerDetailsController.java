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
    
        String name = cd.getNameField().getText().trim();
        String address = cd.getAddressField().getText().trim();
        String contact = cd.getContactField().getText().trim();
        String gender = (String) cd.getGenderCombo().getSelectedItem();
        String email = cd.getEmailField().getText().trim();
        if(name.isEmpty() || address.isEmpty() || contact.isEmpty() || email.isEmpty()){
            JOptionPane.showMessageDialog(cd,"Please enter all the field");
            return;
        }
        if(contact.length()!=10){
            JOptionPane.showMessageDialog(cd,"Contact Number must be 10 digit");
            return;
        }
        if(!email.endsWith("@gmail.com")){
            JOptionPane.showMessageDialog(cd,"Email must contain '@gmail.com'");
        }
        else{          
          CustomerView customer= new CustomerView();
            customer.setVisible(true);
            cd.dispose();  
        }
    }
    
}
