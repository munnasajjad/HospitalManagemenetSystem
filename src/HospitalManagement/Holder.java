package HospitalManagement;

import HospitalManagement.ui.SignUpAsAdmin;
import HospitalManagement.ui.WelcomePanel;
import HospitalManagement.db.AdminAcc;
import HospitalManagement.ui.*;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Holder extends javax.swing.JFrame {

    public Holder() {
        initComponents();
        PatientMenu.setVisible(false);
        menuItemLogin.setVisible(true);
        menuLogout.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        menuItemAdminSign = new javax.swing.JMenuItem();
        menuItemLogin = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenuItem();
        PatientMenu = new javax.swing.JMenu();
        menuItemPatientList = new javax.swing.JMenuItem();
        menuItemAdmitPatient = new javax.swing.JMenuItem();
        menuItemUpdateInfo = new javax.swing.JMenuItem();
        menuItemRelease = new javax.swing.JMenuItem();
        PatientMenu1 = new javax.swing.JMenu();
        menuItemPatientList1 = new javax.swing.JMenuItem();
        menuItemAdmitPatient1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFocusable(false);
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setText("First name:");

        txtfirstname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtfirstname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setText("Last name:");

        txtlastname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtlastname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setText("Password:");

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        loginButton.setText("Login");
        loginButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtfirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addComponent(txtlastname)
                        .addComponent(password)))
                .addGap(77, 77, 77))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(486, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(4, 4, 4, 4));

        jMenu4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jMenu4.setText("User");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        menuItemAdminSign.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        menuItemAdminSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalManagement/icon/sign up.png"))); // NOI18N
        menuItemAdminSign.setText("Sign up");
        menuItemAdminSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAdminSignActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemAdminSign);

        menuItemLogin.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        menuItemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalManagement/icon/login.jpeg"))); // NOI18N
        menuItemLogin.setText("Login");
        menuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLoginActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemLogin);

        menuLogout.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        menuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalManagement/icon/logout.jpeg"))); // NOI18N
        menuLogout.setText("Log out");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        jMenu4.add(menuLogout);

        jMenuBar1.add(jMenu4);

        PatientMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        PatientMenu.setText("User menu");
        PatientMenu.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        menuItemPatientList.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        menuItemPatientList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalManagement/icon/patient list.png"))); // NOI18N
        menuItemPatientList.setText("Patient list");
        menuItemPatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPatientListActionPerformed(evt);
            }
        });
        PatientMenu.add(menuItemPatientList);

        menuItemAdmitPatient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        menuItemAdmitPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalManagement/icon/admit patient.png"))); // NOI18N
        menuItemAdmitPatient.setText("Admit new patient");
        menuItemAdmitPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAdmitPatientActionPerformed(evt);
            }
        });
        PatientMenu.add(menuItemAdmitPatient);

        menuItemUpdateInfo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        menuItemUpdateInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalManagement/icon/update.jpeg"))); // NOI18N
        menuItemUpdateInfo.setText("Change patient info");
        menuItemUpdateInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUpdateInfoActionPerformed(evt);
            }
        });
        PatientMenu.add(menuItemUpdateInfo);

        menuItemRelease.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        menuItemRelease.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalManagement/icon/release patient.png"))); // NOI18N
        menuItemRelease.setText("Release patient");
        menuItemRelease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReleaseActionPerformed(evt);
            }
        });
        PatientMenu.add(menuItemRelease);

        jMenuBar1.add(PatientMenu);

        PatientMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        PatientMenu1.setText("Doctors panel");
        PatientMenu1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        menuItemPatientList1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        menuItemPatientList1.setText("Doctors list");
        menuItemPatientList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPatientList1ActionPerformed(evt);
            }
        });
        PatientMenu1.add(menuItemPatientList1);

        menuItemAdmitPatient1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        menuItemAdmitPatient1.setText("New appoinment");
        menuItemAdmitPatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAdmitPatient1ActionPerformed(evt);
            }
        });
        PatientMenu1.add(menuItemAdmitPatient1);

        jMenuBar1.add(PatientMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkValidation() {
        if (!txtfirstname.getText().trim().isEmpty()) {
            if (!txtlastname.getText().trim().isEmpty()) {
                if (!password.getText().trim().isEmpty()) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter the password.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter last name.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter first name.");
        }
        return false;
    }

    public void txtClear() {
        txtfirstname.setText("");
        txtlastname.setText("");
        password.setText("");
    }

    private void menuItemAdminSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAdminSignActionPerformed

        if (txtfirstname.getText().isEmpty()) {
            SignUpAsAdmin admin = new SignUpAsAdmin();
            jScrollPane1.getViewport().add(admin);
            menuItemLogin.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Log out first!");
        }
    }//GEN-LAST:event_menuItemAdminSignActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            if (checkValidation()) {
                AdminAcc admin = new AdminAcc();
                admin.setFirstname(this.txtfirstname.getText());
                admin.setLastname(this.txtlastname.getText());
                admin.setPassword(this.password.getText());
                boolean auth = admin.findAdmin();
                if (auth) {
                    JOptionPane.showMessageDialog(null, "Logged in successfully.");
                    PatientMenu.setVisible(true);
                    menuItemLogin.setVisible(false);
                    menuLogout.setVisible(true);
                    WelcomePanel welcome = new WelcomePanel();
                    jScrollPane1.getViewport().add(welcome);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid user name or password!");
                    txtClear();
                }
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void menuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLoginActionPerformed

        if (txtfirstname.getText().isEmpty()) {
            jScrollPane1.getViewport().add(jPanel1);
        } else {
            JOptionPane.showMessageDialog(null, "Log out first!");
        }
    }//GEN-LAST:event_menuItemLoginActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed

        if (txtfirstname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Doesn't logged in yet!");
        } else {
            if (JOptionPane.showConfirmDialog(jPanel1, "Are you sure to log out?", "Hospital Management System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                // System.exit(0);
                jScrollPane1.getViewport().add(jPanel1);
                txtClear();
                PatientMenu.setVisible(false);
                menuLogout.setVisible(false);
            }
        }
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void menuItemPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPatientListActionPerformed

        PatientListform obj = new PatientListform();
        jScrollPane1.getViewport().add(obj);
    }//GEN-LAST:event_menuItemPatientListActionPerformed

    private void menuItemUpdateInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUpdateInfoActionPerformed

        Updateform obj = new Updateform();
        jScrollPane1.getViewport().add(obj);
    }//GEN-LAST:event_menuItemUpdateInfoActionPerformed

    private void menuItemAdmitPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAdmitPatientActionPerformed

        AddPatient obj = new AddPatient();
        jScrollPane1.getViewport().add(obj);
    }//GEN-LAST:event_menuItemAdmitPatientActionPerformed

    private void menuItemReleaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReleaseActionPerformed

        Releaseform obj = new Releaseform();
        jScrollPane1.getViewport().add(obj);
    }//GEN-LAST:event_menuItemReleaseActionPerformed

    private void menuItemPatientList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPatientList1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemPatientList1ActionPerformed

    private void menuItemAdmitPatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAdmitPatient1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemAdmitPatient1ActionPerformed

    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Holder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Holder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Holder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Holder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Holder().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu PatientMenu;
    private javax.swing.JMenu PatientMenu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JMenuItem menuItemAdminSign;
    private javax.swing.JMenuItem menuItemAdmitPatient;
    private javax.swing.JMenuItem menuItemAdmitPatient1;
    private javax.swing.JMenuItem menuItemLogin;
    private javax.swing.JMenuItem menuItemPatientList;
    private javax.swing.JMenuItem menuItemPatientList1;
    private javax.swing.JMenuItem menuItemRelease;
    private javax.swing.JMenuItem menuItemUpdateInfo;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    // End of variables declaration//GEN-END:variables
}
