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



public class addAdmin {
 
    
    
    
    String name , phonenumber, address;

    public addAdmin(String name, String phonenumber, String address) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getAddress() {
        return address;
    }
    
    
}
