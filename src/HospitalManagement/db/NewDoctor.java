/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasel
 */
public class NewDoctor extends HospitalDB{
    
    private String doctorid;
    private String doctorname;
    private String contactno;
    private String email;
    private String bloodgroup;
    private String joindate;

    /**
     * @return the doctorid
     */
    public String getDoctorid() {
        return doctorid;
    }

    /**
     * @param doctorid the doctorid to set
     */
    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    /**
     * @return the doctorname
     */
    public String getDoctorname() {
        return doctorname;
    }

    /**
     * @param doctorname the doctorname to set
     */
    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    /**
     * @return the contactno
     */
    public String getContactno() {
        return contactno;
    }

    /**
     * @param contactno the contactno to set
     */
    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the bloodgroup
     */
    public String getBloodgroup() {
        return bloodgroup;
    }

    /**
     * @param bloodgroup the bloodgroup to set
     */
    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    /**
     * @return the joindate
     */
    public String getJoindate() {
        return joindate;
    }

    /**
     * @param joindate the joindate to set
     */
    public void setJoindate(String joindate) {
        this.joindate = joindate;
    }
    
    public boolean newDoctor() throws ClassNotFoundException, SQLException {

        boolean newDoctor = super.NewDoctoR
        return newDoctor;
    }
    
    public List<AdmitPatient> PatientList() throws ClassNotFoundException, SQLException {

        List<AdmitPatient> patientTable = super.PatientList(this);
        if (patientTable.isEmpty()) {
            return patientTable;
        } else {
            return patientTable;
        }
    }
    
      public ArrayList<AdmitPatient> tableSearch() throws ClassNotFoundException, SQLException {
        ArrayList<AdmitPatient> search = super.tableSearch(searchid);
        if (search.isEmpty()) {
            return search;
        } else {
            return search;
        }
    }
    
}
