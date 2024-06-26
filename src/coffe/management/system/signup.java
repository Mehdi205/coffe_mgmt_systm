/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coffe.management.system;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;;
import model.user;
import dao.ConnectionProvider;
import dao.DbOperation;
import dao.UserDao;
import java.awt.Cursor;
import java.sql.Connection;

/**
 *
 * @author Mehdi KHATTABI
 */
public class signup extends javax.swing.JFrame {
    
public String emailPattern="^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
public String mobileNumberPattern="^[0-9]*$";

/**
     * Creates new form signup
     */
    public signup() {
        initComponents();
        btnSave.setEnabled(false);
        
    }  
     public void clear(){
         txtname.setText("");
         txtemail.setText("");
         txtnum.setText("");
         txtpwd.setText("");
         cmbStatus.setSelectedIndex(-1);
         btnSave.setEnabled(false);
     }

     public void validateFields(){
         String name = txtname.getText();
         String email = txtemail.getText();
         String num = txtnum.getText();
         String pwd = txtpwd.getText();
         String status = (String)cmbStatus.getSelectedItem();
         if(!name.equals("")&& email.matches(emailPattern) && num.matches(mobileNumberPattern) && num.length() == 10 && !pwd.equals("") && status != null)                        
            btnSave.setEnabled(true);
         else
            btnSave.setEnabled(false); 
     }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtpwd = new javax.swing.JPasswordField();
        txtemail = new javax.swing.JTextField();
        txtnum = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mgt.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));
        setMaximumSize(new java.awt.Dimension(1051, 636));
        setMinimumSize(new java.awt.Dimension(1051, 636));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1158, 689));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setText("E-mail :");
        jLabel1.setAlignmentX(350.0F);
        jLabel1.setAlignmentY(134.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 70)); // NOI18N
        jLabel2.setText("Add User");
        jLabel2.setAlignmentX(350.0F);
        jLabel2.setAlignmentY(134.0F);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 350, 90));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel3.setText("Phone Number :");
        jLabel3.setAlignmentX(350.0F);
        jLabel3.setAlignmentY(134.0F);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel4.setText("Password :");
        jLabel4.setAlignmentX(350.0F);
        jLabel4.setAlignmentY(134.0F);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 140, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel6.setText("Name :");
        jLabel6.setAlignmentX(350.0F);
        jLabel6.setAlignmentY(134.0F);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, 50));

        txtname.setAlignmentX(350.0F);
        txtname.setAlignmentY(134.0F);
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 220, 30));

        txtpwd.setAlignmentX(350.0F);
        txtpwd.setAlignmentY(134.0F);
        txtpwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpwdKeyReleased(evt);
            }
        });
        getContentPane().add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 220, 30));

        txtemail.setAlignmentX(350.0F);
        txtemail.setAlignmentY(134.0F);
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 220, 30));

        txtnum.setAlignmentX(350.0F);
        txtnum.setAlignmentY(134.0F);
        txtnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnumKeyReleased(evt);
            }
        });
        getContentPane().add(txtnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 220, 30));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setAlignmentX(350.0F);
        btnSave.setAlignmentY(134.0F);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 150, 40));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setAlignmentX(350.0F);
        btnClear.setAlignmentY(134.0F);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 160, 40));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel5.setText("Status :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, -1, -1));

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "waiter" }));
        cmbStatus.setSelectedIndex(-1);
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });
        cmbStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbStatusKeyReleased(evt);
            }
        });
        getContentPane().add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 220, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/psd.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
            user user = new user();
           /* Connection conn = ConnectionProvider.getCon();           
            user.setName(txtname.getText());
            user.setName(txtemail.getText());
            user.setName(txtnum.getText());
            user.setName(txtpwd.getText());
            user.setName(txtconfpwd.getText());*/
           Connection conn = ConnectionProvider.getCon();           
            user.setName(txtname.getText());
            user.setEmail(txtemail.getText());
            user.setMobilenumber(txtnum.getText());
            user.setPassword(txtpwd.getText());
            user.setStatus((String)cmbStatus.getSelectedItem());
            UserDao.save(user, conn);
            JOptionPane.showConfirmDialog(null,"user added Successfully ","Select",JOptionPane.YES_OPTION);
            clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtnumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtnumKeyReleased

    private void txtpwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpwdKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtpwdKeyReleased

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jLabel7KeyPressed

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved
        // TODO add your handling code here:
        jLabel7.setCursor( Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
    }//GEN-LAST:event_jLabel7MouseMoved

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
          setVisible(false);
    }//GEN-LAST:event_jLabel7MousePressed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void cmbStatusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbStatusKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_cmbStatusKeyReleased

    
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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnum;
    private javax.swing.JPasswordField txtpwd;
    // End of variables declaration//GEN-END:variables
}


