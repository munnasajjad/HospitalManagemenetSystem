/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.ui;

import HospitalManagement.db.AdmitPatient;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rasel
 */
public class Releaseform extends javax.swing.JPanel {

    public Releaseform() {
        initComponents();
    }

    private boolean cheakValidation() {
        if (!txtpatientname.getText().trim().isEmpty()) {
            if (!txtreferrence.getText().trim().isEmpty()) {
                if (!txtaddress.getText().trim().isEmpty()) {
                    if (!txtcontactno.getText().trim().isEmpty()) {
                        if (!txtdescription.getText().trim().isEmpty()) {
                            if (!txtwardno.getText().trim().isEmpty()) {
                                if (!txtbedno.getText().trim().isEmpty()) {
                                    if (!date.getDate().equals(0)) {
                                        {
                                            return true;
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Please enter date!");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please enter bed no.!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Please enter ward no.!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please enter description!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter contact no.!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter address!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter referrence!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter patient name!");
        }
        return false;
    }

    public void txtClear() {
        txtsearchid.setText("");
        txtpatientname.setText("");
        txtreferrence.setText("");
        txtaddress.setText("");
        txtcontactno.setText("");
        txtdescription.setText("");
        txtwardno.setText("");
        txtbedno.setText("");
        date.setDate(null);
    }

    public void PrescriptionClear() {
        cmbtabletname.setSelectedIndex(0);
        txtPreferrence.setText("");
        txtdose.setText("");
        txttablets.setText("");
        txtlot.setText("");
        txtissuedate.setText("");
        txtexpdate.setText("");
        txtdailyuse.setText("");
        txtsideeffect.setText("");
        txtfurtherinfo.setText("");
        txtshortage.setText("");
        txtuse.setText("");
        txtpatientid.setText("");
        txtnhs.setText("");
        txtPpatientname.setText("");
        Pdate.setDate(null);
        txtPaddress.setText("");
        txtPcontact.setText("");
        txtareapres.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpatientname = new javax.swing.JTextField();
        txtreferrence = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtwardno = new javax.swing.JTextField();
        txtbedno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdescription = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcontactno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtsearchid = new javax.swing.JTextField();
        btnrelease = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cmbtabletname = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txtPreferrence = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtdose = new javax.swing.JTextField();
        txttablets = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtlot = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtissuedate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtexpdate = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtdailyuse = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtsideeffect = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtfurtherinfo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtshortage = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtuse = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtpatientid = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtnhs = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPpatientname = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtPaddress = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtPcontact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareapres = new javax.swing.JTextArea();
        Pdate = new com.toedter.calendar.JDateChooser();
        btnrelease1 = new javax.swing.JButton();
        btnprescription = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnrelease2 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Patient info", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 20))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Patient name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Referrence");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Date of admit");

        txtpatientname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtreferrence.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtaddress.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        date.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Ward no.");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Bed no.");

        txtwardno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtbedno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Description");

        txtdescription.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Contact no");

        txtcontactno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpatientname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtreferrence, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontactno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtwardno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbedno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpatientname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtreferrence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtaddress))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtwardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbedno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Search patient");

        txtsearchid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtsearchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchidActionPerformed(evt);
            }
        });

        btnrelease.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnrelease.setText("Release patient");
        btnrelease.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnrelease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreleaseActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Patient prescription", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 20))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Name of tablets:");

        cmbtabletname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbtabletname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Make a selection", "Ibuprofen", "Co-codamol", "Paracetamol", "Amlodipine", " " }));
        cmbtabletname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmbtabletname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbtabletnameMouseClicked(evt);
            }
        });
        cmbtabletname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtabletnameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Tab. referrence:");

        txtPreferrence.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Dose (mg):");

        txtdose.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txttablets.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Number of tablets:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("LOT:");

        txtlot.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Issued date:");

        txtissuedate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Exp date:");

        txtexpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Daily use:");

        txtdailyuse.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Possible side effects:");

        txtsideeffect.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("Further info.:");

        txtfurtherinfo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Storage advice:");

        txtshortage.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("How to use:");

        txtuse.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setText("Patient id:");

        txtpatientid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setText("NHS no.:");

        txtnhs.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setText("Patient name:");

        txtPpatientname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("Date of admit:");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("Patient address:");

        txtPaddress.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel28.setText("Contact no.");

        txtPcontact.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtareapres.setColumns(20);
        txtareapres.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtareapres.setRows(5);
        jScrollPane1.setViewportView(txtareapres);

        Pdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnrelease1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnrelease1.setText("Print slip");
        btnrelease1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnrelease1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrelease1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPreferrence)
                    .addComponent(txtdose)
                    .addComponent(txttablets)
                    .addComponent(txtlot)
                    .addComponent(txtissuedate)
                    .addComponent(txtexpdate)
                    .addComponent(txtdailyuse)
                    .addComponent(txtsideeffect)
                    .addComponent(txtfurtherinfo)
                    .addComponent(txtshortage)
                    .addComponent(txtuse)
                    .addComponent(txtpatientid)
                    .addComponent(txtnhs)
                    .addComponent(txtPpatientname)
                    .addComponent(txtPaddress)
                    .addComponent(txtPcontact)
                    .addComponent(Pdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbtabletname, 0, 185, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnrelease1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbtabletname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreferrence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttablets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtissuedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtexpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdailyuse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsideeffect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfurtherinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtshortage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtuse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpatientid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPpatientname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnrelease1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btnprescription.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnprescription.setText("Make a prescription");
        btnprescription.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnprescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprescriptionActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnrelease2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnrelease2.setText("Reset");
        btnrelease2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnrelease2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrelease2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtsearchid, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnrelease, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnrelease2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnprescription, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearchid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnrelease, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(btnrelease2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnprescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchidActionPerformed

        AdmitPatient obj = new AdmitPatient();
        try {
            obj.setPatientid(txtsearchid.getText());
            boolean chk = obj.search();
            System.out.println(chk);
            if (chk) {
                JOptionPane.showMessageDialog(null, "Invalid patient id!");
            } else {
                txtpatientname.setText(obj.getPatientname());
                txtreferrence.setText(obj.getReferrence());
                txtaddress.setText(obj.getAddress());
                txtcontactno.setText(obj.getContactno());
                txtdescription.setText(obj.getDescription());
                txtwardno.setText(obj.getWardno());
                txtbedno.setText(obj.getBedno());
                date.setDate(obj.getAdmitdate());
            }
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }


    }//GEN-LAST:event_txtsearchidActionPerformed

    private void btnreleaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreleaseActionPerformed

        if (!txtareapres.getText().isEmpty()) {
            if (cheakValidation()) {
                try {

                    AdmitPatient ad = new AdmitPatient();
                    ad.setPatientid(this.txtsearchid.getText());
                    boolean chk = ad.releasePatient();
                    if (chk) {
                        JOptionPane.showMessageDialog(null, "Patient released!");
                        txtClear();
                    }
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Prepare a prescription first!");
        }

    }//GEN-LAST:event_btnreleaseActionPerformed

    private void cmbtabletnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtabletnameActionPerformed

        if (cmbtabletname.getSelectedIndex() == 1) {
            txtPreferrence.setText("Ibu8568959");
            txtdose.setText("2");
            txttablets.setText("32");
            txtlot.setText("561005875");
            txtissuedate.setText("06/05/2018");
            txtexpdate.setText("04/05/2019");
            txtdailyuse.setText("4 tablets");
            txtsideeffect.setText("Minor headeche");
            txtfurtherinfo.setText("Place dispensary");
            txtshortage.setText("Less than 20%");
            txtuse.setText("Use water, no alchohol");
            txtpatientid.setText(txtsearchid.getText());
            txtnhs.setText("646564");
            txtPpatientname.setText(txtpatientname.getText());
            Pdate.setDate(date.getDate());
            txtPaddress.setText(txtaddress.getText());
            txtPcontact.setText(txtcontactno.getText());
        } else if (cmbtabletname.getSelectedIndex() == 2) {
            txtPreferrence.setText("CoCo6758940");
            txtdose.setText("500");
            txttablets.setText("30");
            txtlot.setText("B770034");
            txtissuedate.setText("06/05/2018");
            txtexpdate.setText("04/12/2019");
            txtdailyuse.setText("2 tablets");
            txtsideeffect.setText("Minor dizziness");
            txtfurtherinfo.setText("Place dispensary");
            txtshortage.setText("Less than 20%");
            txtuse.setText("Use water, no alchohol");
            txtpatientid.setText(txtsearchid.getText());
            txtnhs.setText("P9589454");
            txtPpatientname.setText(txtpatientname.getText());
            Pdate.setDate(date.getDate());
            txtPaddress.setText(txtaddress.getText());
            txtPcontact.setText(txtcontactno.getText());
        } else if (cmbtabletname.getSelectedIndex() == 3) {
            txtPreferrence.setText("P0729214");
            txtdose.setText("500");
            txttablets.setText("16");
            txtlot.setText("0204324");
            txtissuedate.setText("07/05/2018");
            txtexpdate.setText("04/02/2023");
            txtdailyuse.setText("3 tablets");
            txtsideeffect.setText("Feeling sick");
            txtfurtherinfo.setText("Place dispensary");
            txtshortage.setText("Less than 20%");
            txtuse.setText("Use water, no alchohol");
            txtpatientid.setText(txtsearchid.getText());
            txtnhs.setText("875564");
            txtPpatientname.setText(txtpatientname.getText());
            Pdate.setDate(date.getDate());
            txtPaddress.setText(txtaddress.getText());
            txtPcontact.setText(txtcontactno.getText());
        }
        if (cmbtabletname.getSelectedIndex() == 4) {
            txtPreferrence.setText("Am05875");
            txtdose.setText("5");
            txttablets.setText("28");
            txtlot.setText("65456416");
            txtissuedate.setText("04/03/2018");
            txtexpdate.setText("04/07/2020");
            txtdailyuse.setText("1 tablet");
            txtsideeffect.setText("Liver disease");
            txtfurtherinfo.setText("Ability to drive may affected");
            txtshortage.setText("No special storage");
            txtuse.setText("Use water, no alchohol");
            txtpatientid.setText(txtsearchid.getText());
            txtnhs.setText("P9129454");
            txtPpatientname.setText(txtpatientname.getText());
            Pdate.setDate(date.getDate());
            txtPaddress.setText(txtaddress.getText());
            txtPcontact.setText(txtcontactno.getText());
        } else if (cmbtabletname.getSelectedIndex() == 0) {
            txtPreferrence.setText("");
            txtdose.setText("");
            txttablets.setText("");
            txtlot.setText("");
            txtissuedate.setText("");
            txtexpdate.setText("");
            txtdailyuse.setText("");
            txtsideeffect.setText("");
            txtfurtherinfo.setText("");
            txtshortage.setText("");
            txtuse.setText("");
            txtpatientid.setText("");
            txtnhs.setText("");
            txtPpatientname.setText("");
            Pdate.setDate(null);
            txtPaddress.setText("");
            txtPcontact.setText("");
            txtareapres.setText("");
        }
    }//GEN-LAST:event_cmbtabletnameActionPerformed

    private void cmbtabletnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbtabletnameMouseClicked
    }//GEN-LAST:event_cmbtabletnameMouseClicked

    private void btnprescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprescriptionActionPerformed

        if (!txtsearchid.getText().isEmpty()) {
            if (cmbtabletname.getSelectedIndex() != 0) {
                txtareapres.setText("");
                txtareapres.append("\t\n\tHospital Management System\n\n"
                        + "Patient name:\t\t" + txtPpatientname.getText() + "\nPatient ID:\t\t" + txtpatientid.getText() + "\nAdmit date:\t\t" + Pdate.getDate()
                        + "\nPatient address:\t" + txtaddress.getText() + "\nContact no.:\t\t" + txtPcontact.getText() + "\nPrescription:\t\t" + cmbtabletname.getSelectedItem()
                        + "\nReferrence:\t\t" + txtPreferrence.getText() + "\nDose:\t\t" + txtdose.getText() + "\nNumber of tablets:\t" + txttablets.getText()
                        + "\nLOT:\t\t" + txtlot.getText() + "\nDaily use:\t\t" + txtdailyuse.getText() + "\nPossible side effects:\t" + txtsideeffect.getText()
                        + "\nFurther information:\t" + txtfurtherinfo.getText() + "\nHow to use:\t\t" + txtuse.getText() + "\n\nPlease bring this slip whenever you come back.");
            } else {
                JOptionPane.showMessageDialog(null, "Make a selection in tablet name!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Search for a patient.");
        }
    }//GEN-LAST:event_btnprescriptionActionPerformed

    private void btnrelease1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrelease1ActionPerformed
        if (!txtareapres.getText().isEmpty()) {
            try {
                txtareapres.print();
            } catch (PrinterException e) {
                Logger.getLogger(Releaseform.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Prepare a prescription first.");
        }
    }//GEN-LAST:event_btnrelease1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        PrescriptionClear();
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnrelease2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrelease2ActionPerformed

        txtClear();
        PrescriptionClear();
    }//GEN-LAST:event_btnrelease2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Pdate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnprescription;
    private javax.swing.JButton btnrelease;
    private javax.swing.JButton btnrelease1;
    private javax.swing.JButton btnrelease2;
    private javax.swing.JComboBox cmbtabletname;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPaddress;
    private javax.swing.JTextField txtPcontact;
    private javax.swing.JTextField txtPpatientname;
    private javax.swing.JTextField txtPreferrence;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextArea txtareapres;
    private javax.swing.JTextField txtbedno;
    private javax.swing.JTextField txtcontactno;
    private javax.swing.JTextField txtdailyuse;
    private javax.swing.JTextField txtdescription;
    private javax.swing.JTextField txtdose;
    private javax.swing.JTextField txtexpdate;
    private javax.swing.JTextField txtfurtherinfo;
    private javax.swing.JTextField txtissuedate;
    private javax.swing.JTextField txtlot;
    private javax.swing.JTextField txtnhs;
    private javax.swing.JTextField txtpatientid;
    private javax.swing.JTextField txtpatientname;
    private javax.swing.JTextField txtreferrence;
    private javax.swing.JTextField txtsearchid;
    private javax.swing.JTextField txtshortage;
    private javax.swing.JTextField txtsideeffect;
    private javax.swing.JTextField txttablets;
    private javax.swing.JTextField txtuse;
    private javax.swing.JTextField txtwardno;
    // End of variables declaration//GEN-END:variables
}
