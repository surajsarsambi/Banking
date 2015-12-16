/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Stark
 */
public class BalanceSheet extends javax.swing.JFrame {

   ConnectMe conMe=new ConnectMe();
   GiveMeTableModel m=new GiveMeTableModel();
   ResultSet rs;
    DefaultComboBoxModel<String> model=new DefaultComboBoxModel<>();
    DefaultTableModel Tmodel;
    Date d=new Date();
    DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
    
    int Accno;
    String TranType;
    String Date;
    
    public BalanceSheet() {
        initComponents();
        fillData();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcmb_Accno = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jdp_Date = new org.jdesktop.swingx.JXDatePicker();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabl_Show = new javax.swing.JTable();
        btn_ShowAll = new javax.swing.JButton();
        btn_Show1 = new javax.swing.JButton();
        btn_Show = new javax.swing.JButton();
        jcmb_TranType = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Narkisim", 0, 30)); // NOI18N
        jLabel1.setText("Account Details");

        jcmb_Accno.setEditable(true);
        jcmb_Accno.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jcmb_Accno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmb_Accno.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcmb_AccnoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Search by Date :");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Search by Account Number :");

        jdp_Date.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jtabl_Show.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jtabl_Show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account Number", "Date", "Mode", "Deposit", "Debit", "Balance"
            }
        ));
        jScrollPane1.setViewportView(jtabl_Show);

        btn_ShowAll.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_ShowAll.setText("Show All");
        btn_ShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowAllActionPerformed(evt);
            }
        });

        btn_Show1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/printer-icon.png"))); // NOI18N
        btn_Show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Show1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(444, Short.MAX_VALUE)
                .add(btn_ShowAll, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(154, 154, 154)
                .add(btn_Show1)
                .add(146, 146, 146))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(52, 52, 52)
                        .add(btn_ShowAll))
                    .add(btn_Show1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 42, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 389, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        btn_Show.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Show.setText("Show");
        btn_Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowActionPerformed(evt);
            }
        });

        jcmb_TranType.setEditable(true);
        jcmb_TranType.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jcmb_TranType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Widthdraw", "Deposit" }));
        jcmb_TranType.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcmb_TranTypePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Select Transaction Type :");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(21, 21, 21)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(49, 49, 49)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jcmb_TranType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 233, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jcmb_Accno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 233, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(28, 28, 28)
                        .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(30, 30, 30)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jdp_Date, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 218, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(btn_Show, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jLabel1)
                .add(430, 430, 430))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(34, 34, 34)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jcmb_Accno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(34, 34, 34)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(jdp_Date, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btn_Show))))
                .add(3, 3, 3)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jcmb_TranType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowActionPerformed
       reset();
       d=jdp_Date.getDate();
        if (d!=null) 
        {
          Date=df.format(d);  
       String sele="select AccountNumber,Date,Mode,Deposit,Debit,Balance from balancesheet where Date='"+Date+"'";
       rs=conMe.getConnection(sele);
        try {
            if (rs.next()) 
            {
                rs.previous();
              Tmodel=m.GetModel(rs);
            }
            else
            {    
            JOptionPane.showMessageDialog(null, "No Transations were Found on this date.", "Error", JOptionPane.ERROR_MESSAGE);    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (Tmodel!=null) 
        {
            jtabl_Show.setModel(Tmodel);  
        }
        }
        else 
        {
         JOptionPane.showMessageDialog(null, "Please Select Date..", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_ShowActionPerformed

    private void jcmb_AccnoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcmb_AccnoPopupMenuWillBecomeInvisible
     try{  reset();
        try{ Accno=Integer.parseInt((String)jcmb_Accno.getSelectedItem());}catch(NumberFormatException ex){JOptionPane.showMessageDialog(null, "Please enter a valid Number.", "Error", JOptionPane.ERROR_MESSAGE); }
       String sele="select AccountNumber,Date,Mode,Deposit,Debit,Balance from balancesheet where AccountNumber='"+Accno+"'";
       rs=conMe.getConnection(sele);
        try {
            if (rs.next()) 
            {
                rs.previous();
              Tmodel=m.GetModel(rs);
            }
            else
            {    
            JOptionPane.showMessageDialog(null, "No Transations were Found for this account.", "Error", JOptionPane.ERROR_MESSAGE);    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (Tmodel!=null) 
        {
            jtabl_Show.setModel(Tmodel);  
        }
        }catch(IllegalArgumentException ex){}
    }//GEN-LAST:event_jcmb_AccnoPopupMenuWillBecomeInvisible

    private void btn_ShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowAllActionPerformed
         reset();
       Date=df.format(d);  
       String sele="select AccountNumber,Date,Mode,Deposit,Debit,Balance from balancesheet";
       rs=conMe.getConnection(sele);
        try {
            if (rs.next()) 
            {
                rs.previous();
              Tmodel=m.GetModel(rs);
            }
            else
            {    
            JOptionPane.showMessageDialog(null, "No Transations were Found.", "Error", JOptionPane.ERROR_MESSAGE);    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (Tmodel!=null) 
        {
            jtabl_Show.setModel(Tmodel);  
        }
    }//GEN-LAST:event_btn_ShowAllActionPerformed

    private void btn_Show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Show1ActionPerformed
     
        if (Tmodel!=null) 
        {
            if(Tmodel.getRowCount()!=0)
            {
      PrintingPreview pw=new PrintingPreview(Tmodel);
          pw.setVisible(true);
            }
        }
         else {
            JOptionPane.showMessageDialog(null, "Please Select Account Number or Date.", "Error", JOptionPane.ERROR_MESSAGE); 
        }
       
    }//GEN-LAST:event_btn_Show1ActionPerformed

    private void jcmb_TranTypePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcmb_TranTypePopupMenuWillBecomeInvisible
         try{  reset();
        try{ Accno=Integer.parseInt((String)jcmb_Accno.getSelectedItem());}catch(NumberFormatException ex){JOptionPane.showMessageDialog(null, "Please enter a valid Number.", "Error", JOptionPane.ERROR_MESSAGE); }
         TranType=jcmb_TranType.getSelectedItem().toString();
         String sele="";
         switch(TranType)
         {
             case "All":
          sele="select AccountNumber,Date,Mode,Deposit,Debit,Balance from balancesheet where AccountNumber='"+Accno+"'";       
                 break;
             case "Widthdraw":
          sele="select AccountNumber,Date,Mode,Debit,Balance from balancesheet where AccountNumber='"+Accno+"'";      
               
          break;
             case "Deposit":
         sele="select AccountNumber,Date,Mode,Deposit,Balance from balancesheet where AccountNumber='"+Accno+"'";        
                 break;
         
         }
       rs=conMe.getConnection(sele);
        try {
            if (rs.next()) 
            {
                rs.previous();
              Tmodel=m.GetModel(rs);
            }
            else
            {    
            JOptionPane.showMessageDialog(null, "No Transations were Found for this account.", "Error", JOptionPane.ERROR_MESSAGE);    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (Tmodel!=null) 
        {
            jtabl_Show.setModel(Tmodel);  
        }
        }catch(IllegalArgumentException ex){}
  
    }//GEN-LAST:event_jcmb_TranTypePopupMenuWillBecomeInvisible

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BalanceSheet().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Show;
    private javax.swing.JButton btn_Show1;
    private javax.swing.JButton btn_ShowAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox jcmb_Accno;
    private javax.swing.JComboBox jcmb_TranType;
    private org.jdesktop.swingx.JXDatePicker jdp_Date;
    private javax.swing.JTable jtabl_Show;
    // End of variables declaration//GEN-END:variables

    private void fillData() 
    {
        String sele="select AccountNumber from customerinfo";
        rs=conMe.getConnection(sele);
        try {
            while(rs.next())
            {
            String s=""+rs.getInt("AccountNumber");
            model.addElement(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        jcmb_Accno.setModel(model);
        AutoCompleteDecorator.decorate(jcmb_Accno);
    }

    private void reset() 
    {
        if (Tmodel!=null) {
         Tmodel.setRowCount(0);
         Tmodel.setColumnCount(0);
        }
    }
    
    

    
}
