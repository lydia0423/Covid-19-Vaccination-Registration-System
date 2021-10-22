package solutionShared;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Search {
    
    public void searchRegistrant(JTable table, JTextField txtField) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String search = txtField.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
    }
}
