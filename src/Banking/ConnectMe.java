/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Stark
 */
public class ConnectMe {

    String concls = "com.mysql.jdbc.Driver";
    String constr = "jdbc:mysql://localhost:3307/bankingdb";
    Connection con;
    ResultSet rs;
    Statement st;

    public Connection getConnection() {
        try {
            Class.forName(concls);
            con = DriverManager.getConnection(constr, "root", "root");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect with database. inside Connect ME",
                    "Database Connection Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Unable to load driver.",
                    "Database Connection Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1);
        }
        return con;
    }

    public ResultSet getConnection(String query) {
        try {
           
            Class.forName(concls);
            con = DriverManager.getConnection(constr, "root", "root");
            st = con.createStatement();
            rs = st.executeQuery(query);
           
         
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect with database. inside Connect ME",
                    "Database Connection Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Unable to load driver.",
                    "Database Connection Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1);
        }
        return rs;
    }
    public int UpdateInsertDeleteQuerry(String query) {
        int a=0;
        try {
           
            Class.forName(concls);
            con = DriverManager.getConnection(constr, "root", "root");
            st = con.createStatement();
            a = st.executeUpdate(query);
            
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect with database. inside Connect ME",
                    "Database Connection Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Unable to load driver.",
                    "Database Connection Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1);
        }
        return a;
    }
    
    
    

}
