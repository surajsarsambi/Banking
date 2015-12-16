/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Stark
 */
public class CreateUser extends javax.swing.JFrame {

ConnectMe conMe=new ConnectMe();
ResultSet rs;
    String Uname,Pass,RePass,Access;
    
    public CreateUser() {
        initComponents();
    }

    private void getAllText()
    {
    Uname=txt_Uname.getText();
    Uname=Uname.trim();
    char[] c=txt_Pass.getPassword();
    Pass=new String(c);
    char[] c2=txt_RePass.getPassword();
    RePass=new String(c2);    
    Access="S";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Uname = new javax.swing.JTextField();
        txt_Pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txt_RePass = new javax.swing.JPasswordField();
        btn_Submit = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create User");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Enter Username");

        jLabel2.setFont(jLabel1.getFont());
        jLabel2.setText("Enter Password");

        txt_Uname.setFont(jLabel1.getFont());

        txt_Pass.setFont(jLabel1.getFont());

        jLabel3.setFont(jLabel1.getFont());
        jLabel3.setText("ReEnter Password");

        txt_RePass.setFont(jLabel1.getFont());
        txt_RePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RePassActionPerformed(evt);
            }
        });

        btn_Submit.setFont(jLabel1.getFont());
        btn_Submit.setText("Submit");
        btn_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubmitActionPerformed(evt);
            }
        });

        btn_Back.setFont(jLabel1.getFont());
        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-icon.png"))); // NOI18N
        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Narkisim", 0, 30)); // NOI18N
        jLabel4.setText("Create New User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Uname)
                            .addComponent(txt_Pass)
                            .addComponent(txt_RePass, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_RePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_RePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RePassActionPerformed
        
    }//GEN-LAST:event_txt_RePassActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
     dispose();
    }//GEN-LAST:event_btn_BackActionPerformed

    private void btn_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubmitActionPerformed
        getAllText();
       String sel="SELECT * FROM Login WHERE Username='"+Uname+"'";
       String insert="insert into Login values('"+Uname+"','"+Pass+"','"+Access+"')";
       
        
       
        if (Uname.equals("")|Pass.equals("")|RePass.equals("")) 
        {
        JOptionPane.showMessageDialog(null,"Please Enter All fields", "Error",
					JOptionPane.ERROR_MESSAGE);    
        } 
        else if(!(Pass.equals(RePass)))
        {
        JOptionPane.showMessageDialog(null,"Passwords Do not match.", "Error",
					JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try 
            {
                rs=conMe.getConnection(sel);
                boolean b=rs.next();
                if (b) 
                {
                    JOptionPane.showMessageDialog(null,"Sorry Username Already Taken", "User Name Must Be Unique",
					JOptionPane.ERROR_MESSAGE);
                    txt_Uname.setText("");
                    txt_Uname.requestFocus();
                    
                } 
                else 
                {
                   int i=conMe.UpdateInsertDeleteQuerry(insert);
                    if (i==1) 
                    {
                        JOptionPane.showMessageDialog(null,"User Added Sucessfully", "Congrtulations!!",
					JOptionPane.ERROR_MESSAGE);
                    } 
                    else 
                    {
                    JOptionPane.showMessageDialog(null,"Sorry User Was not added", "Failure",
					JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
            } 
            catch (SQLException ex) 
            {
            JOptionPane.showMessageDialog(null,"Sorry Something Weard Happened", "User Name Must Be Unique",
					JOptionPane.ERROR_MESSAGE);    
            }
        }
   
        
    }//GEN-LAST:event_btn_SubmitActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_Pass;
    private javax.swing.JPasswordField txt_RePass;
    private javax.swing.JTextField txt_Uname;
    // End of variables declaration//GEN-END:variables
}
