/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import service.Orders;

/**
 *
 * @author Destr
 */
public class OrderTableModel extends AbstractTableModel{
    private List<Orders> orders;

    public OrderTableModel(List<Orders> orders) {
        super();
        this.orders = orders;
    }
    
    
    
    @Override
    public int getRowCount() {
        return orders.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return orders.get(rowIndex).getId();
            case 1:
                return orders.get(rowIndex).getUserId();
            case 2:
                return orders.get(rowIndex).getUserName();
            case 3:
                return orders.get(rowIndex).getProductId();
            case 4:
                return orders.get(rowIndex).getProductName();
            case 5:
                return orders.get(rowIndex).getPrice();
            case 6:
                return orders.get(rowIndex).getCount();
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
                return "UserId";
            case 2:
                return "UserName";
            case 3:
                return "ProductId";
            case 4:
                return "ProductName";
            case 5:
                return "Price";
            case 6:
                return "Count";
            default:
                return "";
        }
    }
    
}
