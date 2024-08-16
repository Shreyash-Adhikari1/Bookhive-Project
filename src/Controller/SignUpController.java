/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.LoginPage;
import View.SignUp;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class SignUpController {
    private final SignUp sign;

    public SignUpController(SignUp sign){
        this.sign=sign;

        sign.getRegisterButton().addActionListener(e -> SignupButtonClicked());
    } 
    private void SignupButtonClicked(){
         String RegNO  = sign.getRegNoField().getText().trim();
        String email = sign.getEmailField().getText().trim();
        String password = new String (sign.getPasswordField().getPassword()).trim();
        String confirm = new String (sign.getConfirmPassField().getPassword()).trim();

        // to ensure text feilds not empty
if(RegNO.equals("")){
    JOptionPane.showMessageDialog(sign, "Enter Registration Number!");

}
else if(email.equals("")){
    JOptionPane.showMessageDialog(sign,"Enter Email!");
    return;
}
else if(!email.endsWith("@gmail.com")){
            JOptionPane.showMessageDialog(sign,"Email must contain '@gmail.com'");
            return;
        }
else if (password.equals("")){
        JOptionPane.showMessageDialog(sign,"Enter Password!");
    return;
}
else if (confirm.equals("")){
        JOptionPane.showMessageDialog(sign,"Enter Confirmation Password!");
    return;
}
else if(!confirm.equals( password)){
JOptionPane.showMessageDialog(sign, "Passwords Dont Match");
}
else{
JOptionPane.showMessageDialog(sign, "Registration Successfull");
sign.dispose();
LoginPage log = new LoginPage();
log.setVisible(true);

}
    }
    
}
