/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Hospital.Princeton;



import static com.Hospital.Princeton.DoctorLogin.s;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author mittr
 */
public class MyP extends javax.swing.JFrame {

    String fn, ln, em, ph, ad, wt, ht, gen, bg, bd, nd, ill;
    /**
     * Creates new form MyP
     */
    public MyP() {
        super("My Patients");
              initComponents();
        try {
      
            Connect c = new Connect();
            PreparedStatement ps = c.con.prepareStatement("SELECT * FROM patients WHERE doc = '"+ s +"';");
            ResultSet rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyP.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        height = new javax.swing.JTextField();
        bdate = new javax.swing.JTextField();
        ndate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        mradio = new javax.swing.JRadioButton();
        fradio = new javax.swing.JRadioButton();
        blood = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1420, 870));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Next Visit", "Title 12"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 1345, 260));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Hospital/Princeton/back1.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Update Details"));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, -1, -1));

        jLabel3.setText("Second Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 68, -1, -1));

        jLabel4.setText("Email ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 103, -1, 20));

        jLabel5.setText("Phone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 144, -1, 20));

        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 186, -1, -1));

        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 264, 67, 20));

        jLabel8.setText("Height (cm)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 30, -1, -1));

        jLabel9.setText("Blood Group");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 68, -1, -1));

        jLabel10.setText("Birth Date");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 106, -1, -1));

        jLabel11.setText("Next Appointment Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 145, -1, -1));

        jLabel12.setText("Illness Details");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 186, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Update Details");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 120, 180, 38));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 27, 222, -1));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 65, 222, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 103, 222, -1));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 142, 222, -1));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 183, 222, -1));
        jPanel1.add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 220, -1));
        jPanel1.add(height, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 27, 222, -1));
        jPanel1.add(bdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 103, 222, -1));
        jPanel1.add(ndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 142, 222, -1));

        des.setColumns(20);
        des.setRows(5);
        jScrollPane2.setViewportView(des);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 177, 333, -1));

        jLabel13.setText("Weight (lbs)");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 231, 67, -1));

        buttonGroup1.add(mradio);
        mradio.setText("Male");
        mradio.setOpaque(false);
        jPanel1.add(mradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 263, -1, 20));

        buttonGroup1.add(fradio);
        fradio.setText("Female");
        fradio.setOpaque(false);
        jPanel1.add(fradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 263, -1, 20));

        blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        blood.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 60, 50, 20));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Remove Patient");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 200, 180, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Add New Patient");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, 180, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1340, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Hospital/Princeton/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -750, 1420, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        this.dispose();
        Doctor ob = new Doctor();
        ob.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        NewPatient obj = new NewPatient();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Connect c = new Connect();
            int row = jTable1.getSelectedRow();
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Please select a patient first");
            }
            else{
            int id = (int) jTable1.getModel().getValueAt(row, 0);
           //JOptionPane.showMessageDialog(rootPane, id);
            PreparedStatement ps  = c.con.prepareStatement("DELETE FROM patients WHERE id = " +id+";");
            ps.executeUpdate();
            
            PreparedStatement ps2 = c.con.prepareStatement("SELECT * FROM patients;");
            ResultSet rs = ps2.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
      
          
    }//GEN-LAST:event_jTable1PropertyChange

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          int row = jTable1.getSelectedRow();
          if(row == -1){
              
          }
          else{
            int id = (int) jTable1.getModel().getValueAt(row, 0);
            //JOptionPane.showMessageDialog(rootPane, id);
              try {
            Connect c = new Connect();
            PreparedStatement ps = c.con.prepareStatement("SELECT * FROM patients WHERE id = "+id+";");
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
            fname.setText(rs.getString(2));
            lname.setText(rs.getString(3));
            email.setText(rs.getString(4));
            phone.setText(rs.getString(5));
            address.setText(rs.getString(6));
            
            if(rs.getString(7).equals("Male")){
                mradio.setSelected(true);
            }
            else{
                
             fradio.setSelected(true);}
            
            switch (rs.getString(8)) {
                    case "A+":
                        blood.setSelectedIndex(0);
                        break;
                    case "A-":
                        blood.setSelectedIndex(1);
                        break;
                    case "B+":
                        blood.setSelectedIndex(2);
                        break;
                    case "B-":
                        blood.setSelectedIndex(3);
                        break;
                    case "O+":
                        blood.setSelectedIndex(4);
                        break;
                    case "O-":
                        blood.setSelectedIndex(5);
                        break;
                    case "AB+":
                        blood.setSelectedIndex(6);
                        break;
                    case "AB-":
                        blood.setSelectedIndex(7);
                        break;
                    default:
                        break;
                }
            
           
            weight.setText(rs.getString(9));
            height.setText(rs.getString(10));
            bdate.setText(rs.getString(11));
            ndate.setText(rs.getString(12));
            des.setText(rs.getString(13));
            
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MyP.class.getName()).log(Level.SEVERE, null, ex);
        }}
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        
        int row = jTable1.getSelectedRow();
        int id = (int) jTable1.getModel().getValueAt(row, 0);
        if(row == -1){
            JOptionPane.showMessageDialog(rootPane, "Please select a patient first");
        }
        else{
        try {
            Connect c = new Connect();
            
            fn = fname.getText();
            ln = lname.getText();
            ad = address.getText();
            em = email.getText();
            ph = phone.getText();
             if(fradio.isSelected())
                    gen = "Female";
                else if(mradio.isSelected())
                    gen = "Male";
             
            bg = (String) blood.getSelectedItem();
            ht = height.getText();
            wt = weight.getText();
            bd = bdate.getText();
            nd = ndate.getText();
            ill = des.getText();
            
            PreparedStatement ps = c.con.prepareStatement("UPDATE patients SET fname = '"+fn+"', lname = '"+ln+"', email = '"+em+"', phone = '"+ph+"', address = '"+ad+"', fname = '"+fn+"', gender = '"+gen+"', blood = '"+bg+"', weight = '"+wt+"', height = '"+ht+"', next_Visit = '"+nd+"', bdate = '"+fn+"', problem = '"+ill+"' WHERE id = "+id+";");
            int flag = 1;
            if((fn.length()==0) || (ln.length()==0) || (ad.length()==0) || (em.length()==0) || (ph.length()==0) ||  (gen==null) || (bg.length()==0) || (ht.length()==0)|| (wt.length()==0) || (bd.length()==0)|| (nd.length()==0)){
                            JOptionPane.showMessageDialog(rootPane, "Please provide all your details. No field should be empty.");
                            flag = 0;
                        }
                    if(flag==1){
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(rootPane, "Patient Details successfully updated");
                        PreparedStatement ps2 = c.con.prepareStatement("SELECT * FROM patients;");
            ResultSet rs = ps2.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       NewPatient p = new NewPatient();
       p.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

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
            java.util.logging.Logger.getLogger(MyP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField bdate;
    private javax.swing.JComboBox<String> blood;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea des;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JRadioButton fradio;
    private javax.swing.JTextField height;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton mradio;
    private javax.swing.JTextField ndate;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}