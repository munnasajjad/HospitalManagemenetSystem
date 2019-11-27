/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.ui;

import HospitalManagement.db.AdmitPatient;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rasel
 */
public class PatientListform extends javax.swing.JPanel {

    public PatientListform() {
        initComponents();
        it();
    }

    public void findPatient() throws ClassNotFoundException, SQLException {

        AdmitPatient patient = new AdmitPatient();
        patient.setSearchid(this.txtsearchid.getText());
        ArrayList<AdmitPatient> rst = patient.tableSearch();
        String[][] str = new String[rst.size()][9];
        System.out.println(rst.size());
        int i = 0;
        for (AdmitPatient j : rst) {
            str[i][0] = j.getPatientid();
            str[i][1] = j.getPatientname();
            str[i][2] = j.getReferrence();
            str[i][3] = j.getAddress();
            str[i][4] = j.getContactno();
            str[i][5] = j.getDescription();
            str[i][6] = j.getWardno();
            str[i][7] = j.getBedno();
            str[i][8] = new SimpleDateFormat("dd:MM:yyyy").format(j.getAdmitdate());
            i++;
        }
        patientTable.setModel(new DefaultTableModel(
                str,
                new String[]{"Patient ID", "Patient name", "Referrence", "Address", "Contact no.", "Description", "Ward no.", "Bed no.", "Admit date"}));

    }

    public void it() {
        try {
            AdmitPatient patient = new AdmitPatient();
            List<AdmitPatient> rst = patient.PatientList();
            String[][] str = new String[rst.size()][9];
            int i = 0;
            for (AdmitPatient j : rst) {
                str[i][0] = j.getPatientid();
                str[i][1] = j.getPatientname();
                str[i][2] = j.getReferrence();
                str[i][3] = j.getAddress();
                str[i][4] = j.getContactno();
                str[i][5] = j.getDescription();
                str[i][6] = j.getWardno();
                str[i][7] = j.getBedno();
                str[i][8] = new SimpleDateFormat("dd:MM:yyyy").format(j.getAdmitdate());
                i++;
            }
            patientTable.setModel(new DefaultTableModel(
                    str,
                    new String[]{"Patient ID", "Patient name", "Referrence", "Address", "Contact no.", "Description", "Ward no.", "Bed no.", "Admit date"}));

        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtsearchid = new javax.swing.JTextField();

        patientTable.setAutoCreateRowSorter(true);
        patientTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient id", "Patient name", "Referrence", "Address", "Contact no.", "Description", "Ward no.", "Bed no.", "Admit date"
            }
        ));
        patientTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(patientTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Search by ID");

        txtsearchid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtsearchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtsearchid, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtsearchid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchidActionPerformed

        AdmitPatient search = new AdmitPatient();
        try {
            search.setPatientid(txtsearchid.getText());
            boolean chk = search.search();
            System.out.println(chk);
            if (chk) {
                JOptionPane.showMessageDialog(null, "Invalid patient id!");
            } else {
                findPatient();
            }
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_txtsearchidActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JTextField txtsearchid;
    // End of variables declaration//GEN-END:variables
}
