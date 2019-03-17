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
public class issues {
    
    
    String name,issuename,authority,type,priority,discription,randomID,refno ;
    
    String ticket="";
    String inprogress="";
    
    public issues( String randomID,String issuename,String type,String authority,String priority,String discription,String refno,String name)
    {
        this.randomID=randomID;
        this.issuename = issuename;
        this.authority=authority;
        this.type=type;
        this.priority = priority;
        this.discription = discription;
        this.refno =refno;
        this.name= name;
    }

    public String getName() {
        
        return name;
    }

    public String getTicket() {
        return ticket;
    }

    public String getInprogress() {
        return inprogress;
    }

    public String getRefno() {
        return refno;
    }

    public String getRandomID() {
        return randomID;
    }

    public String getIssuename() {
        return issuename;
    }

    public String getAuthority() {
        return authority;
    }

    public String getType() {
        return type;
    }

    public String getPriority() {
        return priority;
    }

    public String getDiscription() {
        return discription;
    }
    
    
}
