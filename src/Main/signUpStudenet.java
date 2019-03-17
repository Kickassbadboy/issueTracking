/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author yashtalegaonkar
 */
public class signUpStudenet {
    
    String name, phonenumber, refno;

    public signUpStudenet(String name, String phonenumber, String refno) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.refno = refno;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getRefno() {
        return refno;
    }
    
    
    
}
