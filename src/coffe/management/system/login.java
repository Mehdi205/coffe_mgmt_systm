/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coffe.management.system;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.*;
import model.user;
import dao.UserDao;
import java.awt.Cursor;

/**
 *
 * @author Mehdi KHATTABI
 */
public class login extends javax.swing.JFrame {
    public String emailPattern="^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        btnlogin.setEnabled(false);
    }
    public void clear(){
        txtemail.setEnabled(false);
        txtpwd.setText("");
        btnlogin.setEnabled(false);
        
    }
    public void validateFields(){
        
         String email = txtemail.getText();        
         String pwd = txtpwd.getText();
         if(email.matches(emailPattern) && !pwd.equals(""))                        
            btnlogin.setEnabled(true);
         else
            btnlogin.setEnabled(false); 
        
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        txtpwd = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(650, 170));
        setMaximumSize(new java.awt.Dimension(577, 720));
        setMinimumSize(new java.awt.Dimension(577, 720));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(577, 720));
        setSize(new java.awt.Dimension(577, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("Log In");
        jLabel2.setAlignmentY(0.0F);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 230, 100));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("Password :");
        jLabel4.setAlignmentY(0.0F);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 100, -1));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setText("E-mail :");
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 190, -1));

        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 110, 40));

        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 110, 40));

        txtpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpwdActionPerformed(evt);
            }
        });
        txtpwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpwdKeyReleased(evt);
            }
        });
        getContentPane().add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 190, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jLabel6.setText("Exit");
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, 70, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bcgmgt.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(577, 720));
        jLabel3.setMinimumSize(new java.awt.Dimension(577, 720));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        String email=txtemail.getText();
        String password = txtpwd.getText();
        //user user = null;
        user user = UserDao.login(email, password);
        if(user == null)
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Incorrect  or Password</b></html>","Message",JOptionPane.INFORMATION_MESSAGE);
        else{
           //if (user.getStatus()==("admin")){
              // JOptionPane.showMessageDialog(null, "<html><b>wait for admin approval</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
              //JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">wait for admin approval </b></html>","Message",JOptionPane.ERROR_MESSAGE);
              
               
           // }else{
            if(user.getIsExist()){
                clear();
                setVisible(false);
                new Home(user.getStatus(),user.getName()).setVisible(true); 
            }else{
                JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Incorrect username or Password</b></html>","Message",JOptionPane.INFORMATION_MESSAGE);
            }
           
          
        }    
    }//GEN-LAST:event_btnloginActionPerformed
    
    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        // TODO add your handling code here:
        validateFields();
        
    }//GEN-LAST:event_txtemailKeyReleased

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtemail.setText("");
        txtpwd.setText("");
        
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpwdActionPerformed

    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
        // TODO add your handling code here:
        jLabel6.setCursor( Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));       
    }//GEN-LAST:event_jLabel6MouseMoved

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to exit ?","Select",JOptionPane.YES_NO_OPTION);
        if (a==0){
        System.exit(0);}
    }//GEN-LAST:event_jLabel6MousePressed

    private void txtpwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpwdKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtpwdKeyReleased

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpwd;
    // End of variables declaration//GEN-END:variables
}