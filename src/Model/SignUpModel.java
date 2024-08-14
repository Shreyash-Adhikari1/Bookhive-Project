/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class SignUpModel {
    
    private final String email;
    private final String password;
    private final String conf_password;
    private final int registrationNO;
    
    public SignUpModel(String email, String password, String conf_password , int registrationNO){
        this.email= email;
        this.password=password;
        this.conf_password=conf_password;
        this.registrationNO=registrationNO;
       
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getConfPassword(){
        return conf_password;
    }
    public int getRegistrationNO(){
        return registrationNO;
    }
    
}
