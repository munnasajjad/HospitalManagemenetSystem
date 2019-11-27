/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.db;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author rasel
 */
public class AdminAcc extends HospitalDB {

    private String firstname;
    private String lastname;
    private String password;
    private String cpassword;

   
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public boolean newAdmin() throws ClassNotFoundException, SQLException {

        boolean newAdmin = super.newAccAdmin(this);
        return newAdmin;
    }

    public boolean findAdmin() throws ClassNotFoundException, SQLException {

        List<AdminAcc> adminList = super.authenticateAdmin(firstname, lastname, password);

        if (!adminList.isEmpty()) {
            return true;
                    
        } else {
            return false;
        }
    }

}
