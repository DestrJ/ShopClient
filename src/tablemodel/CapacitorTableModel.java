/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import service.Capacitor;

/**
 *
 * @author Destr
 */
public class CapacitorTableModel extends AbstractTableModel{
    private List<Capacitor> capacitors;

    public CapacitorTableModel(List<Capacitor> capacitors) {
        super();
        this.capacitors = capacitors;
    }
    
    @Override
    public int getRowCount() {
        return capacitors.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return capacitors.get(rowIndex).getId();
            case 1:
                return capacitors.get(rowIndex).getName();
            case 2:
                return capacitors.get(rowIndex).getCapacity();
            case 3:
                return capacitors.get(rowIndex).getPrice();
            case 4:
                return capacitors.get(rowIndex).getCount();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Name";
            case 2:
                return "Capacity mkF";
            case 3:
                return "Price";
            case 4:
                return "Count";
            default:
                return "";
        }
    }
}
