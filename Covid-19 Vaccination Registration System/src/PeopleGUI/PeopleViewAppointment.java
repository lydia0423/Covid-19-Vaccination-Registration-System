/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PeopleGUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Eric
 */
public class PeopleViewAppointment extends javax.swing.JFrame {

    /**
     * Creates new form PatientViewAppointment
     */
    public PeopleViewAppointment() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtVaccinationCenterName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtVaccinationCenterName1 = new javax.swing.JTextField();
        txtVaccinationCenterName3 = new javax.swing.JTextField();
        txtVaccinationCenterName10 = new javax.swing.JTextField();
        txtVaccinationCenterName12 = new javax.swing.JTextField();
        txtVaccinationCenterName4 = new javax.swing.JTextField();
        btnAddNewSupply2 = new javax.swing.JButton();
        btnAddNewSupply3 = new javax.swing.JButton();
        btnback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setMinimumSize(new java.awt.Dimension(900, 530));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(186, 221, 212));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 530));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel6.setText("Appointment");

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel10.setText("Details");

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel13.setText("Vaccination");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel10)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel13)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("Full Name");
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 95, -1, -1));

        jLabel5.setText("Vaccination Centre");
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 178, -1, -1));

        jLabel7.setText("NRIC / Passport ");
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 95, -1, -1));

        txtVaccinationCenterName.setEditable(false);
        txtVaccinationCenterName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName.setBorder(null);
        jPanel1.add(txtVaccinationCenterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 122, 260, 34));

        jLabel1.setText("X");
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 0, -1, -1));

        jLabel14.setText("Vaccine Type");
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 261, -1, -1));

        jLabel9.setText("Time");
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 344, -1, -1));

        jLabel11.setText("Date");
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 344, -1, -1));

        txtVaccinationCenterName1.setEditable(false);
        txtVaccinationCenterName1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName1.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName1.setBorder(null);
        jPanel1.add(txtVaccinationCenterName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 205, 330, 34));

        txtVaccinationCenterName3.setEditable(false);
        txtVaccinationCenterName3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName3.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName3.setBorder(null);
        txtVaccinationCenterName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVaccinationCenterName3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtVaccinationCenterName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 371, 260, 34));

        txtVaccinationCenterName10.setEditable(false);
        txtVaccinationCenterName10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName10.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName10.setBorder(null);
        jPanel1.add(txtVaccinationCenterName10, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 371, 260, 34));

        txtVaccinationCenterName12.setEditable(false);
        txtVaccinationCenterName12.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName12.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName12.setBorder(null);
        jPanel1.add(txtVaccinationCenterName12, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 122, 260, 34));

        txtVaccinationCenterName4.setEditable(false);
        txtVaccinationCenterName4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName4.setBackground(new java.awt.Color(186, 221, 212));
        txtVaccinationCenterName4.setBorder(null);
        jPanel1.add(txtVaccinationCenterName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 288, 260, 34));

        btnAddNewSupply2.setBackground(new java.awt.Color(82, 137, 128));
        btnAddNewSupply2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddNewSupply2.setText("Cancel Appointment");
        btnAddNewSupply2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewSupply2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddNewSupply2, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 455, -1, 40));

        btnAddNewSupply3.setText("Confirm Appointment");
        btnAddNewSupply3.setBackground(new java.awt.Color(82, 137, 128));
        btnAddNewSupply3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddNewSupply3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewSupply3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddNewSupply3, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 455, -1, 40));

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 15, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    int dialog = JOptionPane.showConfirmDialog (null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
    if(dialog == JOptionPane.YES_OPTION){
        dispose();
    }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnAddNewSupply2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewSupply2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewSupply2ActionPerformed

    private void btnAddNewSupply3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewSupply3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewSupply3ActionPerformed

    private void txtVaccinationCenterName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVaccinationCenterName3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVaccinationCenterName3ActionPerformed

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        PeopleMainMenu peoplemenu = new PeopleMainMenu();
        peoplemenu.setVisible(true); 
        this.setVisible(false);       
    }//GEN-LAST:event_btnbackMouseClicked

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
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PeopleViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleViewAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewSupply2;
    private javax.swing.JButton btnAddNewSupply3;
    private javax.swing.JLabel btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtVaccinationCenterName;
    private javax.swing.JTextField txtVaccinationCenterName1;
    private javax.swing.JTextField txtVaccinationCenterName10;
    private javax.swing.JTextField txtVaccinationCenterName12;
    private javax.swing.JTextField txtVaccinationCenterName3;
    private javax.swing.JTextField txtVaccinationCenterName4;
    // End of variables declaration//GEN-END:variables
}
