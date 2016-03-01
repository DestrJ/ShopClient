/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import service.User;

/**
 *
 * @author Destr
 */
public class UserTableModel extends AbstractTableModel{
    private List<User> users = null;

    public UserTableModel(List<User> users) {
        super();
        this.users = users;
    }  
    
    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return users.get(rowIndex).getId();
            case 1:
                return users.get(rowIndex).getName();
            case 2:
                return users.get(rowIndex).isPrivilege();
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
                return "Previlege";
            default:
                return "Other Column";
        }
    }    
    
}
