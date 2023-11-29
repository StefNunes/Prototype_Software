/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype_software;

/**
 *
 * @author Stefani Nunes
 */
public class Regular_User extends User implements UserInterface{
     String name;
     String surname;

    public Regular_User(String username, String password) {
        super(username, password);
    }
    
   @Override
    public void modifyProfile(){
         //// Implement modification for RegularUsers profile
        
    }
   
}
