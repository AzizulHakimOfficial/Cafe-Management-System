/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe_management_system;

import java.io.File;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Azizul Hakim'PC
 */
public class View_Bill_Order_Details extends javax.swing.JFrame {
String email;
    
    public View_Bill_Order_Details(String username) {
        email=username;
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        combo.setSelectedIndex(0);
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        String todate=sdf.format(date);
        txtdate.setText(todate);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        jLabel1.setText("View Bills & Order Placed Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1319, 11, 31, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filter By Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        txtdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdateKeyReleased(evt);
            }
        });
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 196, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Change Order By ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 130, 20));

        combo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aesc", "Desc" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 193, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Email", "Date", "Total", "Create By"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, 1340, 530));

        jLabel5.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("*Click on Row to Open Bill");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 710, 260, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Dashboard(email).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        /*conn c=new conn();
        String str="select * from bill";
        DefaultTableModel tdf= (DefaultTableModel) jTable1.getModel();
        try{
            ResultSet rs=c.s.executeQuery(str);
            while(rs.next()){
                String id=rs.getString("id");
                String name=rs.getString("name");
                String mobile=rs.getString("mobileNumber");
                String email1=rs.getString("email");
                String date=rs.getString("date");
                String total=rs.getString("total");
                String createBy=rs.getString("createBy");
                String tb[]={id,name,mobile,email1,date,total,createBy};
                tdf.addRow(tb);
            }
        }catch(Exception e){}*/
    }//GEN-LAST:event_formComponentShown

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
      DefaultTableModel tdf= (DefaultTableModel) jTable1.getModel();
      tdf.setRowCount(0);
        if(combo.getSelectedItem()=="Aesc"){
           conn c=new conn();
        String str="select * from bill";
        
        try{
            ResultSet rs=c.s.executeQuery(str);
            while(rs.next()){
                String id=rs.getString("id");
                String name=rs.getString("name");
                String mobile=rs.getString("mobileNumber");
                String email1=rs.getString("email");
                String date=rs.getString("date");
                String total=rs.getString("total");
                String createBy=rs.getString("createBy");
                String tb[]={id,name,mobile,email1,date,total,createBy};
                tdf.addRow(tb);
            }
        }catch(Exception e){}
       }else if(combo.getSelectedItem()=="Desc"){
           conn c=new conn();
        String str="select * from bill order By id DESC";
        DefaultTableModel tdf2= (DefaultTableModel) jTable1.getModel();
        try{
            ResultSet rs=c.s.executeQuery(str);
            while(rs.next()){
                String id=rs.getString("id");
                String name=rs.getString("name");
                String mobile=rs.getString("mobileNumber");
                String email1=rs.getString("email");
                String date=rs.getString("date");
                String total=rs.getString("total");
                String createBy=rs.getString("createBy");
                String tb[]={id,name,mobile,email1,date,total,createBy};
                tdf2.addRow(tb);
            }
        }catch(Exception e){}
       }
    }//GEN-LAST:event_comboActionPerformed

    private void txtdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdateKeyReleased
        DefaultTableModel tdf= (DefaultTableModel) jTable1.getModel();
      tdf.setRowCount(0);
      String dat=txtdate.getText();
        if(combo.getSelectedItem()=="Aesc"){
           conn c=new conn();
        String str="select * from bill where date like '%"+dat+"%'";
        
        try{
            ResultSet rs=c.s.executeQuery(str);
            while(rs.next()){
                String id=rs.getString("id");
                String name=rs.getString("name");
                String mobile=rs.getString("mobileNumber");
                String email1=rs.getString("email");
                String date=rs.getString("date");
                String total=rs.getString("total");
                String createBy=rs.getString("createBy");
                String tb[]={id,name,mobile,email1,date,total,createBy};
                tdf.addRow(tb);
            }
        }catch(Exception e){}
       }else if(combo.getSelectedItem()=="Desc"){
           conn c=new conn();
        String str="select * from bill where date like '%"+dat+"%' order By id DESC";
        DefaultTableModel tdf2= (DefaultTableModel) jTable1.getModel();
        try{
            ResultSet rs=c.s.executeQuery(str);
            while(rs.next()){
                String id=rs.getString("id");
                String name=rs.getString("name");
                String mobile=rs.getString("mobileNumber");
                String email1=rs.getString("email");
                String date=rs.getString("date");
                String total=rs.getString("total");
                String createBy=rs.getString("createBy");
                String tb[]={id,name,mobile,email1,date,total,createBy};
                tdf2.addRow(tb);
            }
        }catch(Exception e){}
       }
    }//GEN-LAST:event_txtdateKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        TableModel td=jTable1.getModel();
        String id=td.getValueAt(jTable1.getSelectedRow(), 0).toString();
         int a = JOptionPane.showConfirmDialog(null, "Do you want to Show the Bill?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
        try{
            if((new File("E:\\"+id+".pdf")).exists()){
                Process p=Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler E:\\"+id+".pdf");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "File is not Exists!");
        }
       }
        this.setVisible(false);
        new Dashboard(email).setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(View_Bill_Order_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Bill_Order_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Bill_Order_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Bill_Order_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Bill_Order_Details("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtdate;
    // End of variables declaration//GEN-END:variables
}
