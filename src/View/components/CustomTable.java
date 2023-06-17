package View.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomTable extends JTable {

    public CustomTable() {
        getTableHeader().setDefaultRenderer(new CustomTableHeader());
        getTableHeader().setPreferredSize(new Dimension(0, 35));
        setDefaultRenderer(Object.class, new CustomTableCell());
        setRowHeight(30);
        setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }
    
    private class CustomTableHeader extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            var object = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            object.setBackground(Color.decode("#3B4252"));
            object.setForeground(Color.decode("#ECEFF4"));
            object.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
            return object;
        }
        
    }
    
    private class CustomTableCell extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            var object = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            return object;
        }
        
    }
    
}
