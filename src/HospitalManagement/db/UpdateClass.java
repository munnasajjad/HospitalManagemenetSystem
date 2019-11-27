/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.db;

import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author rasel
 */
public class UpdateClass extends HospitalDB{
    
    private String searchid;
    private String newpatientid;
    private String newpatientname;
    private String newreferrence;
    private String newaddress;
    private String newcontactno;
    private String newdescription;
    private String newwardno;
    private String newbedno;
    private Date newadmitdate;

    public String getSearchid() {
        return searchid;
    }

    public void setSearchid(String searchid) {
        this.searchid = searchid;
    }

    public String getNewpatientid() {
        return newpatientid;
    }

    public void setNewpatientid(String newpatientid) {
        this.newpatientid = newpatientid;
    }

    public String getNewpatientname() {
        return newpatientname;
    }

    public void setNewpatientname(String newpatientname) {
        this.newpatientname = newpatientname;
    }

    public String getNewreferrence() {
        return newreferrence;
    }

    public void setNewreferrence(String newreferrence) {
        this.newreferrence = newreferrence;
    }

    public String getNewaddress() {
        return newaddress;
    }

    public void setNewaddress(String newaddress) {
        this.newaddress = newaddress;
    }

    public String getNewcontactno() {
        return newcontactno;
    }

    public void setNewcontactno(String newcontactno) {
        this.newcontactno = newcontactno;
    }

    public String getNewdescription() {
        return newdescription;
    }

    public void setNewdescription(String newdescription) {
        this.newdescription = newdescription;
    }

    public String getNewwardno() {
        return newwardno;
    }

    public void setNewwardno(String newwardno) {
        this.newwardno = newwardno;
    }

    public String getNewbedno() {
        return newbedno;
    }

    public void setNewbedno(String newbedno) {
        this.newbedno = newbedno;
    }

    public Date getNewadmitdate() {
        return newadmitdate;
    }

    public void setNewadmitdate(Date newadmitdate) {
        this.newadmitdate = newadmitdate;
    }
    
    public boolean updatepatient() throws ClassNotFoundException, SQLException{
       boolean newemployee = super.UpdatePatientinfo(this);
        return newemployee;
    }
}
