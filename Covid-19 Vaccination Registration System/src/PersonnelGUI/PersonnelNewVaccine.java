package PersonnelGUI;

import Classes.Vaccine;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PersonnelNewVaccine extends javax.swing.JFrame {

    public PersonnelNewVaccine() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblVaccineBatchNumber = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAddNewVaccine = new javax.swing.JButton();
        spinQuantity = new javax.swing.JSpinner();
        cmbVaccineType = new javax.swing.JComboBox<>();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dpSupplyDate = new DatePicker(dateSettings); dateSettings.setDateRangeLimits(LocalDate.now(), LocalDate.now().plusMonths(12));
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setMaximumSize(new java.awt.Dimension(900, 530));
        setMinimumSize(new java.awt.Dimension(900, 530));
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(186, 221, 212));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setFocusable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        jLabel8.setText("New");
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        lblVaccineBatchNumber.setText("Batch Number");
        lblVaccineBatchNumber.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblVaccineBatchNumber.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Vaccine");
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(lblVaccineBatchNumber)
                        .addGap(34, 34, 34))))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(76, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(66, 66, 66)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addGap(67, 67, 67)
                .addComponent(lblVaccineBatchNumber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(328, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(175, 175, 175)))
        );

        jLabel9.setText("X");
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel14.setText("Vaccine Name");
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N

        jLabel15.setText("Quantity");
        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N

        btnBack.setText("Back");
        btnBack.setBackground(new java.awt.Color(82, 137, 128));
        btnBack.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddNewVaccine.setText("Add");
        btnAddNewVaccine.setBackground(new java.awt.Color(82, 137, 128));
        btnAddNewVaccine.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddNewVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewVaccineActionPerformed(evt);
            }
        });

        cmbVaccineType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Vaccine Type--", "AstraZeneca", "Pfizer-BioNTech", "Sinovac" }));
        cmbVaccineType.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel16.setText("Supply Date");
        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbVaccineType, javax.swing.GroupLayout.Alignment.LEADING, 0, 260, Short.MAX_VALUE)
                            .addComponent(spinQuantity)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddNewVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(201, 201, 201))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpSupplyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(38, 38, 38)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbVaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel15)
                .addGap(7, 7, 7)
                .addComponent(spinQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dpSupplyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNewVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        dpSupplyDate.setDateToToday();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

<<<<<<< HEAD
    private void txtvaccineidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvaccineidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvaccineidActionPerformed

    private void txtvaccinenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvaccinenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvaccinenameActionPerformed

    private void cmbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStateActionPerformed

    private void btncancelnewvaccineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelnewvaccineMouseClicked
        int dialog = JOptionPane.showConfirmDialog (null, "Changes have not been saved! Cancel?", "Cancel Changes", JOptionPane.YES_NO_OPTION);
        if(dialog == JOptionPane.YES_OPTION){
=======
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        PersonnelVaccineDetailsMenu vaccinemenu = new PersonnelVaccineDetailsMenu();
        vaccinemenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddNewVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewVaccineActionPerformed
        //Retrive data from form
        String vaccineName, supplyDateString, quantity;
        LocalDate supplyDate;
        
        vaccineName = cmbVaccineType.getSelectedItem().toString();
        supplyDate = dpSupplyDate.getDate();
        quantity = spinQuantity.getValue().toString();
        
        //Verify all inputs are filed
        if(vaccineName.isEmpty() || quantity.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please ensure that all fields have been filled in", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
        }
        
        //All verification checks passed
        supplyDateString = supplyDate.format(DateTimeFormatter.ISO_DATE);
        
        //Creates an instance Vaccine and saves it to the database
        Vaccine vaccine = new Vaccine(vaccineName, supplyDateString, quantity);
        Vaccine.saveVaccine(vaccine);
        
        int n = JOptionPane.showConfirmDialog(null, "Vaccine has been saved. Add another vaccine?", "Vaccine created", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(n == JOptionPane.YES_NO_OPTION){
            //If yes, reset the form
            cmbVaccineType.setSelectedIndex(-1);
            spinQuantity.setValue(0);
            dpSupplyDate.setDateToToday();
        }else{
>>>>>>> main
            PersonnelVaccineDetailsMenu vaccinemenu = new PersonnelVaccineDetailsMenu();
            vaccinemenu.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_btnAddNewVaccineActionPerformed

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
            java.util.logging.Logger.getLogger(PersonnelNewVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelNewVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelNewVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelNewVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelNewVaccine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JButton btnAddNewSupply1;
    private javax.swing.JButton btncancelnewvaccine;
    private javax.swing.JComboBox<String> cmbState;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
=======
    private javax.swing.JButton btnAddNewVaccine;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbVaccineType;
    private com.github.lgooddatepicker.components.DatePicker dpSupplyDate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
>>>>>>> main
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblVaccineBatchNumber;
    private javax.swing.JSpinner spinQuantity;
    // End of variables declaration//GEN-END:variables
}
