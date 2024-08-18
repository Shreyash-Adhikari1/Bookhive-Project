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
    
    private final String Email;
    private final String password;
    private final String conf_password;
    private final String registrationNO;
    
    public SignUpModel(String Email, String password, String conf_password , String registrationNO){
        this.Email= Email;
        this.password=password;
        this.conf_password=conf_password;
        this.registrationNO=registrationNO;
       
    }
    public String getEmail(){
        return Email;
    }
    public String getPassword(){
        return password;
    }
    public String getConfPassword(){
        return conf_password;
    }
    public String  getRegistrationNO(){
        return registrationNO;
    }
    
}
