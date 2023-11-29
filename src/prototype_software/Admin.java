/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype_software;

/**
 *
 * @author Stefani Nunes
 */

public class Admin extends User{

    String name;
    String surname;
   
    //CONSTRUCTOR

    public Admin(String name, String surname, String username, String password) {
        super(username, password);
        this.name = name;
        this.surname = surname;
    }

    

  //METHODS DECLARATIONS
    public void modifyProfile(){
        //to modify their onw profile
    }
    
    public void accessUsers(){
        //to access a list of all users
    }
    
    public void removeUsers(User user){
        //to remove other users from the system
    }
    
    public void reviewOperations(){
        //to review operations performed by others users
    }
}
