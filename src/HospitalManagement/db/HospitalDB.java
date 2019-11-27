/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.db;

import HospitalManagement.ui.Releaseform;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasel
 */
public class HospitalDB extends ConnectionUtill {

    public HospitalDB() {
    }

    protected boolean newAccAdmin(AdminAcc admin) throws SQLException, ClassNotFoundException {

        boolean newAccAdmin = false;

        Connection con = super.doConnection();
        String sql = "insert into newaccount(firstname, lastname, password, cpassword)values(?,?,?,?)";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, admin.getFirstname());
        pstmt.setString(2, admin.getLastname());
        pstmt.setString(3, admin.getPassword());
        pstmt.setString(4, admin.getCpassword());

        pstmt.executeUpdate();
        return newAccAdmin = true;
    }
   
    protected List<AdminAcc> authenticateAdmin(String firstname, String lastname, String password) throws ClassNotFoundException, SQLException {

        List<AdminAcc> adminList = new ArrayList();
        Connection con = super.doConnection();
        String sql = "Select cpassword from newaccount where firstname=? and password=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, firstname);
        pstmt.setString(2, password);

        AdminAcc admin = new AdminAcc();
        ResultSet rst = pstmt.executeQuery();

        while (rst.next()) {
            admin.setCpassword(rst.getString("cpassword"));
            adminList.add(admin);
        }
        return adminList;
    }

    protected boolean NewPatient(AdmitPatient patient) throws ClassNotFoundException, SQLException {
        boolean newpatient = false;

        Connection con = super.doConnection();
        String sql = "insert into patient(patientid,patientname,referrence,address,contactno,description,wardno,bedno,admitdate)values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, patient.getPatientid());
        pstmt.setString(2, patient.getPatientname());
        pstmt.setString(3, patient.getReferrence());
        pstmt.setString(4, patient.getAddress());
        pstmt.setString(5, patient.getContactno());
        pstmt.setString(6, patient.getDescription());
        pstmt.setString(7, patient.getWardno());
        pstmt.setString(8, patient.getBedno());
        pstmt.setDate(9, new java.sql.Date(patient.getAdmitdate().getTime()));

        pstmt.executeUpdate();
        return newpatient = true;
    }
    
     protected boolean UpdatePatientinfo(UpdateClass up)throws ClassNotFoundException, SQLException{
        boolean update=false;
        Connection con=super.doConnection();
        String sql="UPDATE `patient` SET `patientname` ='"+up.getNewpatientname()+"', `referrence`='"+up.getNewreferrence()+"', `address`='"+up.getNewaddress()+"', `contactno`='"+up.getNewcontactno()+"', `description`='"+up.getNewdescription()+"', `wardno`='"+up.getNewwardno()+"', `bedno`='"+up.getNewbedno()+"'where patientid= '"+up.getSearchid()+"'";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.executeUpdate();
         return update=true;   
     }
     
     protected List<AdmitPatient> UpdateSearch(AdmitPatient srch) throws SQLException, ClassNotFoundException{
        
         List<AdmitPatient> src=new ArrayList();
        
        Connection con=super.doConnection();
        String sql="select * from patient where patientid = ?";
        PreparedStatement  pstmt= con.prepareStatement(sql);
        pstmt.setString(1, srch.getPatientid());
        ResultSet rst = pstmt.executeQuery();
        if(rst.next()){
            srch.setPatientname(rst.getString("patientname"));
            srch.setReferrence(rst.getString("referrence"));
            srch.setAddress(rst.getString("address"));
            srch.setContactno(rst.getString("contactno"));
            srch.setDescription(rst.getString("description"));
            srch.setWardno(rst.getString("wardno"));
            srch.setBedno(rst.getString("bedno"));
            srch.setAdmitdate(rst.getDate("admitdate"));
            
                   src.add(srch);
        }
        return src;
    }
     
     protected boolean ReleasePatient(AdmitPatient r) throws SQLException, ClassNotFoundException{
        boolean release = false;
        
        Connection con=super.doConnection();
        String sql="delete from patient where patientid = ?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, r.getPatientid());
        
          pstmt.executeUpdate();
        return release = true;
      }
    
       protected List<AdmitPatient> PatientList(AdmitPatient patient) throws ClassNotFoundException, SQLException {

        List<AdmitPatient> patientTable = new ArrayList();
        Connection con = super.doConnection();
        String sql = "select * from patient order by patientid";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {
            AdmitPatient result = new AdmitPatient();
            result.setPatientid(rst.getString("patientid"));
            result.setPatientname(rst.getString("patientname"));
            result.setReferrence(rst.getString("referrence"));
            result.setAddress(rst.getString("address"));
            result.setContactno(rst.getString("contactno"));
            result.setDescription(rst.getString("description"));
            result.setWardno(rst.getString("wardno"));
            result.setBedno(rst.getString("bedno"));
            result.setAdmitdate(rst.getDate("admitdate"));
            
            patientTable.add(result);
        }
        return patientTable;
    }

    protected ArrayList<AdmitPatient> tableSearch(String searchID) throws ClassNotFoundException, SQLException {
        ArrayList<AdmitPatient> result = new ArrayList();
        Connection con = super.doConnection();
        String sql = "SELECT * from `patient` WHERE patientid = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, searchID);
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {
            AdmitPatient pt = new AdmitPatient();
            pt.setPatientid(rst.getString("patientid"));
            pt.setPatientname(rst.getString("patientname"));
            pt.setReferrence(rst.getString("referrence"));
            pt.setAddress(rst.getString("address"));
            pt.setContactno(rst.getString("contactno"));
            pt.setDescription(rst.getString("description"));
            pt.setWardno(rst.getString("wardno"));
            pt.setBedno(rst.getString("bedno"));
            pt.setAdmitdate(rst.getDate("admitdate"));
            
            result.add(pt);
        }
        return result;
    }
    
    protected boolean NewDoctor(AdmitPatient patient) throws ClassNotFoundException, SQLException {
        boolean newpatient = false;

        Connection con = super.doConnection();
        String sql = "insert into doctor(doctorid,doctorname,contactno,email,bloodgp,joindate)values(?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, patient.getPatientid());
        pstmt.setString(2, patient.getPatientname());
        pstmt.setString(3, patient.getReferrence());
        pstmt.setString(4, patient.getAddress());
        pstmt.setString(5, patient.getContactno());
        pstmt.setString(6, patient.getDescription());
        pstmt.setString(7, patient.getWardno());
        pstmt.setString(8, patient.getBedno());
        pstmt.setDate(9, new java.sql.Date(patient.getAdmitdate().getTime()));

        pstmt.executeUpdate();
        return newpatient = true;
    }
    
  /*  protected ArrayList<AdmitPatient> tableSearch(String searchID) throws ClassNotFoundException, SQLException {
        ArrayList<AdmitPatient> result = new ArrayList();
        Connection con = super.doConnection();
        String sql = "SELECT * from `patient` WHERE patientid = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, searchID);
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {
            AdmitPatient pt = new AdmitPatient();
            pt.setPatientid(rst.getString("patientid"));
            pt.setPatientname(rst.getString("patientname"));
            pt.setReferrence(rst.getString("referrence"));
            pt.setAddress(rst.getString("address"));
            pt.setContactno(rst.getString("contactno"));
            pt.setDescription(rst.getString("description"));
            pt.setWardno(rst.getString("wardno"));
            pt.setBedno(rst.getString("bedno"));
            pt.setAdmitdate(rst.getDate("admitdate"));
            
            result.add(pt);
        }
        return result;
    }*/
    
}
