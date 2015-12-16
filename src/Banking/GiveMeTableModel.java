/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Stark
 */
public class GiveMeTableModel 
{
    DefaultTableModel model;
    ResultSetMetaData rsmd;
    Vector<String> columnNames=new Vector<>();
    Vector rows;
    Vector data=new Vector();
    int columnCount;
    
    public DefaultTableModel GetModel(ResultSet rs) 
    {
        try {
            rsmd=rs.getMetaData();           
            columnCount=rsmd.getColumnCount();
            for (int index = 1; index <= columnCount; index++) 
            {
                String s=rsmd.getColumnName(index);
                columnNames.add(s);
            }
        
            while (rs.next()) 
            {                
                rows=new Vector();
                
                for (int index = 1; index <= columnCount; index++) 
                {
                    String s=rs.getString(index);
                    rows.add(s);
                }
                data.add(rows);
            }
          
        } catch (SQLException ex) {
            System.out.println("Error..");
            Logger.getLogger(GiveMeTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
         return model=new DefaultTableModel(data, columnNames)
         {
                @Override
                public boolean isCellEditable(int row, int column) {
                   return false;
                }
        };
    }  
}
