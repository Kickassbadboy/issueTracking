/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import facadePattern.facadepattern;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**s
 *
 * @author yashtalegaonkar
 */
public class validateLogin extends loginForm{
 loginForm loginForm = new loginForm();
    
    
   
        
      void valid(String name, String pass){
         
         
        Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/issueTrackingSystem","root","ac0de52dh");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      String sql;
      sql = "SELECT * FROM login";
      stmt =conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
           int i=0;
           if(rs!=null){
            while(rs.next()){
              String  namedatabse=rs.getString(1);
              String  passdatabase=rs.getString(2);
                System.out.println("Inside While rs.next");
                i++;
                
                if(name.equals(namedatabse) && pass.equals(passdatabase))
                {
                System.out.print("in if loop");
                loginForm.setVisible(false);
                facadepattern facade = new facadepattern();
                facade.setVisible(true);
                this.loginForm.setVisible(false);
                
                }
                else{
                     loginForm.hideLabel();
                    JOptionPane.showMessageDialog(null,"password or username incorrect");   
                   
                }
                
            }
            
//                
            }
           else{
               JOptionPane.showMessageDialog(null, "Database is Null");
           }
            
    
   }catch(   SQLException | ClassNotFoundException se){
            //Handle errors for JDBC
System.err.println("error");
       System.err.println(se);
   }
   
   

      }
      
      String admin_user,admin_pass;
      void validadminLogin(String username ,String password){
          
          Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/issueTrackingSystem","root","ac0de52dh");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      String sql;
      sql = "SELECT * FROM adminLogin";
      stmt =conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
          // int i=0;
           if(rs!=null){
            while(rs.next()){
              String  namedatabse=rs.getString(1);
              String  passdatabase=rs.getString(2);
                System.out.println("Inside While rs.next");
               // i++;
                
                if(username.equals(namedatabse) && password.equals(passdatabase))
                {
                System.out.print("in if loop");
                //loginForm.setVisible(false);
                //loginForm.dispose();
                dashBoardForm dashboard = new dashBoardForm();
                dashboard.setVisible(true);
                this.loginForm.dispose();  
                JOptionPane.showMessageDialog(null, "Successful login");
                }
               else 
                {
                    JOptionPane.showMessageDialog(null, "incorrect");
                    
                }
                
            }
            
//                
            }
           else{
               JOptionPane.showMessageDialog(null, "Database is Null");
           }
            
    
   }catch(   SQLException | ClassNotFoundException se){
            //Handle errors for JDBC
System.err.println("error");
       System.err.println(se);
   }
          
      }

    
      
    }
    
 
 

