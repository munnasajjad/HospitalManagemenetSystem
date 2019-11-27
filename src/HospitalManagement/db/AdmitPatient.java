/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rasel
 */
public class AdmitPatient extends HospitalDB {

    private String searchid;
    private String patientid;
    private String patientname;
    private String referrence;
    private String address;
    private String contactno;
    private String description;
    private String wardno;
    private String bedno;
    private Date admitdate;

        public String getSearchid() {
        return searchid;
    }

    public void setSearchid(String searchid) {
        this.searchid = searchid;
    }
       
    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getReferrence() {
        return referrence;
    }

    public void setReferrence(String referrence) {
        this.referrence = referrence;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWardno() {
        return wardno;
    }

    public void setWardno(String wardno) {
        this.wardno = wardno;
    }

    public String getBedno() {
        return bedno;
    }

    public void setBedno(String bedno) {
        this.bedno = bedno;
    }

    public Date getAdmitdate() {
        return admitdate;
    }

    public void setAdmitdate(Date admitdate) {
        this.admitdate = admitdate;
    }

    public boolean newPatient() throws ClassNotFoundException, SQLException {

        boolean newPatient = super.NewPatient(this);
        return newPatient;
    }

    public boolean search() throws ClassNotFoundException, SQLException {

        List<AdmitPatient> search = super.UpdateSearch(this);
        if (search.isEmpty()) {
            return true;
        } else {
            return false;
        }
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
      
      public boolean releasePatient() throws ClassNotFoundException, SQLException{
    
        boolean release = super.ReleasePatient(this);
        return release;
    }
      
}
