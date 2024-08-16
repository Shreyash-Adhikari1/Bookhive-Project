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
        private class UpdateCustomerButtonListener implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            UpdateCustomerButtonActionPerformed(evt);
        }


        
private void UpdateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt){
        String customerIdText=view.getCustomerIdField().getText().trim();
        if (!customerIdText.isEmpty()) {
        int customerId = Integer.parseInt(customerIdText);
        String name = view.getCustomerNameField().getText().trim();
        String address = view.getAddressField().getText().trim();
        String contact = view.getContactField().getText().trim();
        String gender = (String) view.getGenderCombo().getSelectedItem();
        String email = view.getEmailField().getText().trim();
        if(name.isEmpty() || address.isEmpty() || contact.isEmpty() || email.isEmpty()){
            JOptionPane.showMessageDialog(view,"Please enter all the field");
            return;
        }
        if(contact.length()!=10){
            JOptionPane.showMessageDialog(view,"Contact Number must be 10 digit");
            return;
        }
        if(!email.endsWith("@gmail.com")){
            JOptionPane.showMessageDialog(view,"Email must contain '@gmail.com'");
        }
                 
        }else {
    JOptionPane.showMessageDialog(null, "Customer ID is required");
}
   
}

}   

private void DeleteCustomerbutotnMouseClicked(java.awt.event.MouseEvent evt) {
String id = view.getCustomerIdField().getText().trim(); 

    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(view, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(view, "Are you sure you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
}
}
