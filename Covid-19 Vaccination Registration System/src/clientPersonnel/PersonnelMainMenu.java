/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clientPersonnel;

import javax.swing.JOptionPane;
import shared.VaccinationStatus;

/**
 *
 * @author Lydia
 */
public class PersonnelMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form PersonnelMainMenu
     */
    public PersonnelMainMenu() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnVaccinationStatus = new javax.swing.JLabel();
        btnMyAccount1 = new javax.swing.JLabel();
        btnVaccineSupply = new javax.swing.JLabel();
        btnManageVaccinationAppointment2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("PersonnelMainMenu"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(65, 198, 158));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1564506_close_exit_logout_power_icon.png"))); // NOI18N
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(465, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/211652_close_icon (1).png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        btnVaccinationStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4230540_analysis_graph_report_icon.png"))); // NOI18N
        btnVaccinationStatus.setText("    Vaccination Status");
        btnVaccinationStatus.setBackground(new java.awt.Color(82, 137, 128));
        btnVaccinationStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnVaccinationStatus.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnVaccinationStatus.setOpaque(true);
        btnVaccinationStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVaccinationStatusMouseClicked(evt);
            }
        });

        btnMyAccount1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3643757_computer_desktop_monitor_pc_personal_icon.png"))); // NOI18N
        btnMyAccount1.setText("    My Account");
        btnMyAccount1.setBackground(new java.awt.Color(82, 137, 128));
        btnMyAccount1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMyAccount1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnMyAccount1.setOpaque(true);

        btnVaccineSupply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4172394_goods_merchandise_stock_supply_vendibles_icon.png"))); // NOI18N
        btnVaccineSupply.setText("    Vaccine Supply");
        btnVaccineSupply.setBackground(new java.awt.Color(82, 137, 128));
        btnVaccineSupply.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnVaccineSupply.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnVaccineSupply.setOpaque(true);
        btnVaccineSupply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVaccineSupplyMouseClicked(evt);
            }
        });

        btnManageVaccinationAppointment2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4335985_availability_calendar_custom_programme_schedule_icon.png"))); // NOI18N
        btnManageVaccinationAppointment2.setText("    Vaccination Appointment");
        btnManageVaccinationAppointment2.setBackground(new java.awt.Color(82, 137, 128));
        btnManageVaccinationAppointment2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnManageVaccinationAppointment2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnManageVaccinationAppointment2.setOpaque(true);
        btnManageVaccinationAppointment2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageVaccinationAppointment2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 624, Short.MAX_VALUE)
                        .addComponent(btnClose)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnManageVaccinationAppointment2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMyAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVaccinationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVaccineSupply, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnMyAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageVaccinationAppointment2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVaccinationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVaccineSupply, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        int n = JOptionPane.showConfirmDialog(null,"Would you like to logout?","Terminate System",JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x, y);
    }//GEN-LAST:event_formMouseDragged
    
    private void btnManageVaccinationAppointment2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageVaccinationAppointment2MouseClicked
        PersonnelVaccinationAppointment a = new PersonnelVaccinationAppointment();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageVaccinationAppointment2MouseClicked

    private void btnVaccinationStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaccinationStatusMouseClicked
        VaccinationStatus a = new VaccinationStatus();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVaccinationStatusMouseClicked

    private void btnVaccineSupplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaccineSupplyMouseClicked
        PersonnelVaccineSupply a = new PersonnelVaccineSupply();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVaccineSupplyMouseClicked

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
            java.util.logging.Logger.getLogger(PersonnelMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnManageVaccinationAppointment2;
    private javax.swing.JLabel btnMyAccount1;
    private javax.swing.JLabel btnVaccinationStatus;
    private javax.swing.JLabel btnVaccineSupply;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
