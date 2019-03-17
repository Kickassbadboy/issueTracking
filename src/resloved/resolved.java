/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resloved;

/**
 *
 * @author yashtalegaonkar
 */


public class resolved {
    String resolvedrandomId,issuename,issuetype,issueauth,priority,description,refno,name,randomID;

    public resolved(String randomId, String issuename, String issuetype, String issueauth, String priority, String description, String refno, String name, String randomID) {
        this.resolvedrandomId = randomId;
        this.issuename = issuename;
        this.issuetype = issuetype;
        this.issueauth = issueauth;
        this.priority = priority;
        this.description = description;
        this.refno = refno;
        this.name = name;
        this.randomID = randomID;
    }

    public String getResolvedrandomId() {
        return resolvedrandomId;
    }

   
    public String getIssuename() {
        return issuename;
    }

    public String getIssuetype() {
        return issuetype;
    }

    public String getIssueauth() {
        return issueauth;
    }

    public String getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public String getRefno() {
        return refno;
    }

    public String getName() {
        return name;
    }

    public String getRandomID() {
        return randomID;
    }

    
    
    
}
