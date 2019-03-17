/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import java.util.Date;
import java.text.SimpleDateFormat;


/**
 *
 * @author yashtalegaonkar
 */
public class generateId {
    
    
    
    
   public  String generateRandomId(){
         
        
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
        String datetime = ft.format(dNow);
        System.out.println(datetime);
        return datetime;

    }
    
    
}
