/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype_software;

/**
 *
 * @author Stefani Nunes
 */

public class Admin implements User{

    String username;
    String password;
   
    //CONSTRUCTOR

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

  //METHODS DECLARATIONS
    public void modifyProfile(){
        //to modify their onw profile
    }
    
    public void accessUsers(){
        //to access a list of all users
    }
    
    public void removeUsers(){
        //to remove other users from the system
    }
    
    public void reviewOperations(){
        //to review operations performed by others users
    }
}
