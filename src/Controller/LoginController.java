/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.HomePage;
import View.LoginPage;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class LoginController {
    private final LoginPage login;
    
    public LoginController(LoginPage login){
        this.login=login;
        
        login.getLoginBtn().addActionListener(e -> loginButtonClicked());
    }
    
     private void loginButtonClicked() {
        String email = login.getEmailField().getText().trim();
        String password =new String(login.getPasswordField().getPassword()).trim();
        if(email.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(login,"Please enter all the field.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!email.endsWith("@gmail.com")){
            JOptionPane.showMessageDialog(login,"Email must contain '@gmail.com'");
        }
        else{          
            HomePage home= new HomePage();
            home.setVisible(true);
            login.dispose();
        }
     }
}
