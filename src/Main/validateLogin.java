/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**s
 *
 * @author yashtalegaonkar
 */
public class validateLogin {

    String name, pass;
    
   
    public validateLogin(String name, String pass) {
        this.name=name;
        this.pass=pass;
        
        System.out.println("In ValidLogin Constructor");
         loginForm loginForm = new loginForm();
       
            System.out.println(name +pass);
       
    }
    
      
        
        
      
       
    }
    
    
    
    
  // private static final Logger LOG = Logger.getLogger(validateLogin.class.getName());
 
}
