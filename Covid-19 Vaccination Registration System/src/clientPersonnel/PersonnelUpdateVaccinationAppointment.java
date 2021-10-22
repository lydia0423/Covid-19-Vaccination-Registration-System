package clientPersonnel;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonnelUpdateVaccinationAppointment extends javax.swing.JFrame {

    public PersonnelUpdateVaccinationAppointment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        CloseContactGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        txtAppointmentId = new javax.swing.JLabel();
        txtUserId = new javax.swing.JLabel();
        txtRegisteredDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        dpAppointmentDate = new com.github.lgooddatepicker.components.DatePicker();
        tpAppointmentTime = new com.github.lgooddatepicker.components.TimePicker();
        btnUpdateAppointment = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtIC = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtHealthCondition = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        cmbVaccinationCenter = new javax.swing.JComboBox<>();
        cmbVaccineType = new javax.swing.JComboBox<>();
        cmbAppointmentStatus = new javax.swing.JComboBox<>();
        rbtnYes = new javax.swing.JRadioButton();
        rbtnNo = new javax.swing.JRadioButton();

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel13.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 530));
        setMinimumSize(new java.awt.Dimension(1000, 530));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 530));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(64, 198, 158));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointment");
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New");
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        btnBack.setText("Back");
        btnBack.setBackground(new java.awt.Color(82, 137, 128));
        btnBack.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDashboard.setText("Dashboard");
        btnDashboard.setBackground(new java.awt.Color(82, 137, 128));
        btnDashboard.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        txtAppointmentId.setBackground(new java.awt.Color(255, 255, 255));
        txtAppointmentId.setForeground(new java.awt.Color(0, 0, 0));

        txtUserId.setBackground(new java.awt.Color(255, 255, 255));
        txtUserId.setForeground(new java.awt.Color(0, 0, 0));

        txtRegisteredDate.setBackground(new java.awt.Color(255, 255, 255));
        txtRegisteredDate.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegisteredDate)
                    .addComponent(txtUserId)
                    .addComponent(txtAppointmentId)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(txtAppointmentId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUserId)
                .addGap(18, 18, 18)
                .addComponent(txtRegisteredDate)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jLabel3.setText("Close Contact");
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel4.setText("Vaccination Centre");
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel5.setText("Date");
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel6.setText("NRIC / Passport");
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel7.setText("Heath Condition");
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel8.setText("Name");
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel9.setText("Time");
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/211652_close_icon (1).png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        dpAppointmentDate.setForeground(new java.awt.Color(0, 0, 0));

        btnUpdateAppointment.setText("Update");
        btnUpdateAppointment.setBackground(new java.awt.Color(82, 137, 128));
        btnUpdateAppointment.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnUpdateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAppointmentActionPerformed(evt);
            }
        });

        jLabel10.setText("Vaccine Type");
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel11.setText("Appointment Status");
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        txtName.setBackground(new java.awt.Color(65, 198, 158));
        txtName.setBorder(null);
        txtName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtName.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtName.setOpaque(true);

        txtIC.setBackground(new java.awt.Color(65, 198, 158));
        txtIC.setBorder(null);
        txtIC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIC.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtIC.setOpaque(true);

        txtHealthCondition.setBackground(new java.awt.Color(65, 198, 158));
        txtHealthCondition.setBorder(null);
        txtHealthCondition.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHealthCondition.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtHealthCondition.setOpaque(true);

        cmbVaccinationCenter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbVaccinationCenter.setBackground(new java.awt.Color(65, 198, 158));
        cmbVaccinationCenter.setForeground(new java.awt.Color(0, 0, 0));

        cmbVaccineType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbVaccineType.setBackground(new java.awt.Color(65, 198, 158));
        cmbVaccineType.setForeground(new java.awt.Color(0, 0, 0));

        cmbAppointmentStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Pending", "Completed", "Cancelled" }));
        cmbAppointmentStatus.setBackground(new java.awt.Color(65, 198, 158));
        cmbAppointmentStatus.setForeground(new java.awt.Color(0, 0, 0));
        cmbAppointmentStatus.setToolTipText("");

        CloseContactGroup.add(rbtnYes);
        rbtnYes.setText("Yes");
        rbtnYes.setBackground(new java.awt.Color(65, 198, 158));
        rbtnYes.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rbtnYes.setForeground(new java.awt.Color(0, 0, 0));
        rbtnYes.setOpaque(true);

        CloseContactGroup.add(rbtnNo);
        rbtnNo.setText("No");
        rbtnNo.setBackground(new java.awt.Color(65, 198, 158));
        rbtnNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rbtnNo.setForeground(new java.awt.Color(0, 0, 0));
        rbtnNo.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdateAppointment)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel8))
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbtnNo)
                                        .addGap(53, 53, 53)
                                        .addComponent(rbtnYes))
                                    .addComponent(jLabel4)
                                    .addComponent(cmbVaccinationCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(dpAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtHealthCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(cmbVaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(tpAppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(cmbAppointmentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnNo)
                                    .addComponent(rbtnYes))
                                .addGap(52, 52, 52)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cmbVaccinationCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(dpAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)
                                .addComponent(txtHealthCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(cmbVaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(tpAppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(cmbAppointmentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x, y);
    }//GEN-LAST:event_formMouseDragged

    private void btnUpdateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAppointmentActionPerformed

    }//GEN-LAST:event_btnUpdateAppointmentActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        PersonnelMainMenu a = new PersonnelMainMenu();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        PersonnelVaccinationAppointment a = new PersonnelVaccinationAppointment();
        a.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(PersonnelUpdateVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelUpdateVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelUpdateVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelUpdateVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelUpdateVaccinationAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup CloseContactGroup;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnUpdateAppointment;
    private javax.swing.JComboBox<String> cmbAppointmentStatus;
    private javax.swing.JComboBox<String> cmbVaccinationCenter;
    private javax.swing.JComboBox<String> cmbVaccineType;
    public com.github.lgooddatepicker.components.DatePicker dpAppointmentDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton rbtnNo;
    private javax.swing.JRadioButton rbtnYes;
    public com.github.lgooddatepicker.components.TimePicker tpAppointmentTime;
    public javax.swing.JLabel txtAppointmentId;
    private javax.swing.JTextField txtHealthCondition;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtName;
    public javax.swing.JLabel txtRegisteredDate;
    public javax.swing.JLabel txtUserId;
    // End of variables declaration//GEN-END:variables
}
