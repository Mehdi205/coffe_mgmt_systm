/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coffe.management.system;

import common.OpenPdf;
import dao.BillDao;
import dao.ProductDao;
import dao.UserDao;
import java.awt.Cursor;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Bill;
import model.Product;
import model.user;

/**
 *
 * @author Mehdi KHATTABI
 */
public class Details extends javax.swing.JFrame {
    public String waiterName;
    public String stat;
    /**
     * Creates new form Details
     */
    public Details() {
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        Date date = new Date();
        String todayDate = sdf.format(date);
        jTextField1.setText("");
        
        
    }
     public Details(String name,String status) {
        initComponents();
        waiterName = name;
        stat = status;
        lblUser.setText(name);
        
     }
     public void getAllRecordsByWaiter(String name) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Bill> list = BillDao.getAllRecordsByWaiter(name);
        Iterator<Bill> itr = list.iterator();
        while (itr.hasNext()) {
            Bill billObj = itr.next();
            dtm.addRow(new Object[]{billObj.getId(),billObj.getName(),billObj.getDate(),billObj.getQuantity(),billObj.getTotal(),billObj.getWaiter()});
        }
    }

    public void tableDetails(String userName,String status) {
        waiterName = userName;
        stat = status;
        String user = lblUser.getText();
        String date = jTextField1.getText();
        String waiter = txtWaiter.getText();
        String incDec=(String)jComboBox1.getSelectedItem();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        if(incDec.equals("Newest")){
            ArrayList<Bill> list = BillDao.getAllRecordsByAll(date,waiter);
            Iterator<Bill> itr = list.iterator();
            while(itr.hasNext()){
                Bill billObj= itr.next();
                dtm.addRow(new Object[]{billObj.getId(),billObj.getDate(),billObj.getQuantity(),billObj.getTotal(),billObj.getWaiter()});
            }
        }else if(incDec.equals("Oldest")){
            ArrayList<Bill> list = BillDao.getAllRecordsByDesc(date,waiter);
            Iterator<Bill> itr = list.iterator();
            while(itr.hasNext()){
                Bill billObj= itr.next();
                dtm.addRow(new Object[]{billObj.getId(),billObj.getDate(),billObj.getQuantity(),billObj.getTotal(),billObj.getWaiter()});
        }
        }
                
                
                } 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtWaiter = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));
        setMaximumSize(new java.awt.Dimension(1159, 684));
        setMinimumSize(new java.awt.Dimension(1159, 684));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1159, 684));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill ID", "Date", "Quantity", "Total", "Waiter"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 1010, 380));

        jTextField1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 240, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Newest", "Oldest" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 110, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jLabel1.setText("Filter By Date :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jLabel2.setText("Order By :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 96, 30));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        jLabel4.setText("  Bills Details");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 20, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jLabel6.setText("Order By waiter :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 140, 70));

        txtWaiter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWaiterKeyReleased(evt);
            }
        });
        getContentPane().add(txtWaiter, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 210, 180, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("User :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUser.setText("ana");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 110, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/psd.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 690));

        jFormattedTextField1.setText("jFormattedTextField1");
        getContentPane().add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        // TODO add your handling code here:
        jLabel5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel5MouseMoved

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        tableDetails(waiterName,stat);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        tableDetails(waiterName,stat);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String id = model.getValueAt(index,0).toString();
        OpenPdf.openById(id);
    }//GEN-LAST:event_jTable1MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        tableDetails(waiterName,stat);
    }//GEN-LAST:event_formComponentShown

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtWaiterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWaiterKeyReleased
        // TODO add your handling code here:
                String name = txtWaiter.getText();
                getAllRecordsByWaiter( name);
                tableDetails(waiterName,stat);

    }//GEN-LAST:event_txtWaiterKeyReleased

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
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtWaiter;
    // End of variables declaration//GEN-END:variables
}
