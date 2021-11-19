package PersonnelGUI;

import HelperClasses.FileHandler;
import Classes.VaccinationAppointment;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class PersonnelVaccinationAppointment extends javax.swing.JFrame {

    public PersonnelVaccinationAppointment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccinationAppointment = new JTable(new AppointmentTableModel()){

            //Implement table cell tool tips.
            public String getToolTipText(java.awt.event.MouseEvent e) {
                String tip = null;
                java.awt.Point p = e.getPoint();
                int rowIndex = rowAtPoint(p);
                int colIndex = columnAtPoint(p);

                try {
                    if(rowIndex >= 0){
                        tip = getValueAt(rowIndex, colIndex).toString();
                    }
                } catch (RuntimeException e1) {
                    //catch null pointer exception if mouse is over an empty line
                    System.out.println("Mouse is over an empty line!");
                }

                return tip;
            }
            //Implement table header tool tips.
            protected JTableHeader createDefaultTableHeader() {
                return new JTableHeader(columnModel) {
                    @Override
                    public String getToolTipText(MouseEvent e) {
                        String tip = null;
                        java.awt.Point p = e.getPoint();
                        int index = columnModel.getColumnIndexAtX(p.x);
                        int realIndex
                        = columnModel.getColumn(index).getModelIndex();
                        tip = getColumnName(realIndex);
                        return tip;
                    }
                };
            }
        };
        ((DefaultTableCellRenderer) tblVaccinationAppointment.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tblVaccinationAppointment.getTableHeader().setFont(new Font("Berlin Sans FB", Font.PLAIN,14));
        tblVaccinationAppointment.getTableHeader().setReorderingAllowed(false);
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setMinimumSize(new java.awt.Dimension(900, 530));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 53));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 530));

        jPanel2.setBackground(new java.awt.Color(186, 221, 212));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 525));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/172546_search_icon.png"))); // NOI18N

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtSearch.setBackground(new java.awt.Color(186, 221, 218));
        txtSearch.setBorder(null);
        txtSearch.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jScrollPane1.setViewportView(tblVaccinationAppointment);

        jLabel3.setText("X");
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("View Registrants");
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/134224_add_plus_new_icon.png"))); // NOI18N
        btnAdd.setBackground(new java.awt.Color(82, 137, 128));
        btnAdd.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/352547_edit_mode_icon.png"))); // NOI18N
        btnEdit.setBackground(new java.awt.Color(82, 137, 128));
        btnEdit.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3669361_delete_ic_icon.png"))); // NOI18N
        btnDelete.setBackground(new java.awt.Color(82, 137, 128));
        btnDelete.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3669284_ic_print_icon.png"))); // NOI18N
        btnPrint.setBackground(new java.awt.Color(82, 137, 128));
        btnPrint.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrint))
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel10)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrint)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // Seach Booking Table
        RowSorter rowSorter = new RowSorter();
        rowSorter.searchTable();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        PersonnelAddVaccinationAppointment addNewAppointment = new PersonnelAddVaccinationAppointment();
        addNewAppointment.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //Delete the selected record
        int rowIndex = tblVaccinationAppointment.getSelectedRow();
        //Checks if a row has been selected
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete", "Delete Appointment", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        var selectedRow = tblVaccinationAppointment.getValueAt(rowIndex, 0);
        String fileName = selectedRow + ".txt";
        File toDelete = FileHandler.retrievePath("Appointment", fileName);

        int n = JOptionPane.showConfirmDialog(null, "Do you really want to delete appointment " + selectedRow + "?", "Delete Appointment", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            try {
                toDelete.delete();
                tblVaccinationAppointment.setModel(new AppointmentTableModel());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed to delete appointment", "Delete Appointment", JOptionPane.INFORMATION_MESSAGE);
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(PersonnelVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PersonnelVaccinationAppointment().setVisible(true);
        });
    }
    
    //Model for populating the Appointment Table display
class AppointmentTableModel extends AbstractTableModel{
    final private String[] columnNames = {"Appointment ID", "Name", "Identification", "State", "Vaccination Center", "Vaccine Type", "Registered Date", "Appointment Date", "Appointment Time", "Health Condition", "Close Contact", "Appointment Status"};
        final private ArrayList<VaccinationAppointment> appointmentList = VaccinationAppointment.getAllVaccinationAppointments();

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public int getRowCount() {
            return appointmentList.size();
        }

        @Override
        public String getColumnName(int col) {
            return columnNames[col];
        }

        @Override
        public Object getValueAt(int row, int col) {
            Object temp = null;
            switch (col) {
                case 0 ->
                    temp = appointmentList.get(row).getAppointmentId();
                case 1 ->
                    temp = appointmentList.get(row).getPatientName();
                case 2 ->
                    temp = appointmentList.get(row).getPatientIdentification();
                case 3 ->
                    temp = appointmentList.get(row).getState();
                case 4 ->
                    temp = appointmentList.get(row).getVaccinationCenter();
                case 5 ->
                    temp = appointmentList.get(row).getVaccineType();
                case 6 ->
                    temp = appointmentList.get(row).getRegisteredDate();
                case 7 ->
                    temp = appointmentList.get(row).getAppointmentDate();
                case 8 ->
                    temp = appointmentList.get(row).getAppointmentTime();
                case 9 ->
                    temp = appointmentList.get(row).getHealthCondition();
                case 10 ->
                    temp = appointmentList.get(row).getCloseContact();
                case 11 ->
                    temp = appointmentList.get(row).getAppointmentStatus();
            }
            return temp;
        }

        @Override
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        public void removeRow(int row) {
            appointmentList.remove(row);
        }
}

//RowSorter for searching the table
    class RowSorter extends TableRowSorter<TableModel> {

        final private TableRowSorter<TableModel> rowSorter;

        RowSorter() {
            rowSorter = new TableRowSorter<>(tblVaccinationAppointment.getModel());
            tblVaccinationAppointment.setRowSorter(rowSorter);
        }

        public void searchTable() {
            txtSearch.getDocument().addDocumentListener(new DocumentListener() {

                @Override
                public void insertUpdate(DocumentEvent e) {
                    String searchText = txtSearch.getText();
                    if (searchText.trim().length() == 0) {
                        rowSorter.setRowFilter(null);
                    } else {
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
                    }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    String searchText = txtSearch.getText();
                    if (searchText.trim().length() == 0) {
                        rowSorter.setRowFilter(null);
                    } else {
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
                    }
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    throw new UnsupportedOperationException("Not supported yet.");
                }
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblVaccinationAppointment;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

