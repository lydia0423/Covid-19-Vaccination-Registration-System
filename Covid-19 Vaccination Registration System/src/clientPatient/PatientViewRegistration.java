/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clientPatient;

import javax.swing.JOptionPane;

/**
 *
 * @author Eric
 */
public class PatientViewRegistration extends javax.swing.JFrame {

    /**
     * Creates new form PatientModifyAppointment
     */
    public PatientViewRegistration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtVaccinationCenterName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtVaccinationCenterName1 = new javax.swing.JTextField();
        txtVaccinationCenterName2 = new javax.swing.JTextField();
        txtVaccinationCenterName3 = new javax.swing.JTextField();
        txtVaccinationCenterName10 = new javax.swing.JTextField();
        txtVaccinationCenterName11 = new javax.swing.JTextField();
        txtVaccinationCenterName12 = new javax.swing.JTextField();
        txtVaccinationCenterName4 = new javax.swing.JTextField();
        btnAddNewSupply2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 530));
        setMinimumSize(new java.awt.Dimension(900, 530));
        setPreferredSize(new java.awt.Dimension(900, 530));

        jPanel1.setBackground(new java.awt.Color(186, 221, 212));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 530));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/middlelogo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 32)); // NOI18N
        jLabel6.setText("Registration");

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 32)); // NOI18N
        jLabel12.setText("View");

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1564506_close_exit_logout_power_icon.png"))); // NOI18N
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 32)); // NOI18N
        jLabel10.setText("Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnLogout)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout))
        );

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel2.setText("Full Name as per IC / Passport");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel3.setText("Email");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel5.setText("Contact Number");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel7.setText("NRIC (Citizen) / Passport (Non-citizen)");

        txtVaccinationCenterName.setEditable(false);
        txtVaccinationCenterName.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel14.setText("Close contact within 14 days?");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel8.setText("Preferred Vaccination Centre");

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setText("State");

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel11.setText("Health conditions");

        txtVaccinationCenterName1.setEditable(false);
        txtVaccinationCenterName1.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName1.setBorder(null);

        txtVaccinationCenterName2.setEditable(false);
        txtVaccinationCenterName2.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName2.setBorder(null);

        txtVaccinationCenterName3.setEditable(false);
        txtVaccinationCenterName3.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName3.setBorder(null);

        txtVaccinationCenterName10.setEditable(false);
        txtVaccinationCenterName10.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName10.setBorder(null);

        txtVaccinationCenterName11.setEditable(false);
        txtVaccinationCenterName11.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName11.setBorder(null);

        txtVaccinationCenterName12.setEditable(false);
        txtVaccinationCenterName12.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName12.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName12.setBorder(null);

        txtVaccinationCenterName4.setEditable(false);
        txtVaccinationCenterName4.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName4.setBorder(null);

        btnAddNewSupply2.setBackground(new java.awt.Color(82, 137, 128));
        btnAddNewSupply2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddNewSupply2.setText("Modify");
        btnAddNewSupply2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewSupply2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtVaccinationCenterName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(txtVaccinationCenterName12, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel11))))
                                .addGap(0, 229, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(txtVaccinationCenterName3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(txtVaccinationCenterName4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56)
                                        .addComponent(txtVaccinationCenterName10, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtVaccinationCenterName1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(txtVaccinationCenterName2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtVaccinationCenterName11))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnAddNewSupply2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVaccinationCenterName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVaccinationCenterName12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVaccinationCenterName1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVaccinationCenterName2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVaccinationCenterName10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVaccinationCenterName4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVaccinationCenterName3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVaccinationCenterName11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnAddNewSupply2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        int n = JOptionPane.showConfirmDialog(null,"Would you like to logout?","Terminate System",JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnAddNewSupply2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewSupply2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewSupply2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientViewRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientViewRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientViewRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientViewRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientViewRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewSupply2;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtVaccinationCenterName;
    private javax.swing.JTextField txtVaccinationCenterName1;
    private javax.swing.JTextField txtVaccinationCenterName10;
    private javax.swing.JTextField txtVaccinationCenterName11;
    private javax.swing.JTextField txtVaccinationCenterName12;
    private javax.swing.JTextField txtVaccinationCenterName2;
    private javax.swing.JTextField txtVaccinationCenterName3;
    private javax.swing.JTextField txtVaccinationCenterName4;
    // End of variables declaration//GEN-END:variables
}
