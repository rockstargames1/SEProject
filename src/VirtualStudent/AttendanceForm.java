/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualStudent;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author kishl_000
 */
public class AttendanceForm extends javax.swing.JFrame {

    /**
     * Creates new form AttendanceForm
     */
    public AttendanceForm() {
        initComponents();
        setSize(650,650);
        this.setTitle("Virtual Student");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setResizable(false);
        backbutton.setIcon(new ImageIcon("C:\\Users\\kishl_000\\OneDrive\\Documents\\Images\\back_button.png"));
        readFromDatabase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subject1 = new javax.swing.JLabel();
        subject2 = new javax.swing.JLabel();
        subject3 = new javax.swing.JLabel();
        subject4 = new javax.swing.JLabel();
        subject5 = new javax.swing.JLabel();
        subject6 = new javax.swing.JLabel();
        sub2attended = new javax.swing.JLabel();
        sub1attended = new javax.swing.JLabel();
        sub3attended = new javax.swing.JLabel();
        sub4attended = new javax.swing.JLabel();
        sub5attended = new javax.swing.JLabel();
        sub6attended = new javax.swing.JLabel();
        sub1total = new javax.swing.JLabel();
        sub2total = new javax.swing.JLabel();
        sub3total = new javax.swing.JLabel();
        sub4total = new javax.swing.JLabel();
        sub5total = new javax.swing.JLabel();
        sub6total = new javax.swing.JLabel();
        per1 = new javax.swing.JLabel();
        per2 = new javax.swing.JLabel();
        per3 = new javax.swing.JLabel();
        per4 = new javax.swing.JLabel();
        per5 = new javax.swing.JLabel();
        per6 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Subject");

        jLabel2.setText("Attended");

        jLabel3.setText("Total");

        jLabel4.setText("Percentage");

        subject1.setText("Subject1");

        subject2.setText("Subject2");

        subject3.setText("Subject3");

        subject4.setText("Subject4");

        subject5.setText("Subject5");

        subject6.setText("Subject6");

        sub2attended.setText("0");

        sub1attended.setText("0");

        sub3attended.setText("0");

        sub4attended.setText("0");

        sub5attended.setText("0");

        sub6attended.setText("0");

        sub1total.setText("0");

        sub2total.setText("0");

        sub3total.setText("0");

        sub4total.setText("0");

        sub5total.setText("0");

        sub6total.setText("0");

        per1.setText("0");

        per2.setText("0");

        per3.setText("0");

        per4.setText("0");

        per5.setText("0");

        per6.setText("0");

        backbutton.setMaximumSize(new java.awt.Dimension(50, 50));
        backbutton.setMinimumSize(new java.awt.Dimension(50, 50));
        backbutton.setPreferredSize(new java.awt.Dimension(50, 50));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subject5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(subject1)
                        .addComponent(subject3)
                        .addComponent(subject2)
                        .addComponent(subject4)
                        .addComponent(jLabel1))
                    .addComponent(subject6, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(sub1attended, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sub2attended, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(sub3attended)
                    .addComponent(sub4attended)
                    .addComponent(sub5attended)
                    .addComponent(sub6attended))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sub4total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(per4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sub3total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(per3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sub2total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(per2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sub1total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(per1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(sub5total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(per5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(sub6total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(per6)))
                        .addGap(24, 24, 24)))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject1)
                    .addComponent(sub1attended)
                    .addComponent(sub1total)
                    .addComponent(per1))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject2)
                    .addComponent(sub2attended)
                    .addComponent(sub2total)
                    .addComponent(per2))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject3)
                    .addComponent(sub3attended)
                    .addComponent(sub3total)
                    .addComponent(per3))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject4)
                    .addComponent(sub4attended)
                    .addComponent(sub4total)
                    .addComponent(per4))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject5)
                    .addComponent(sub5attended)
                    .addComponent(sub5total)
                    .addComponent(per5))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject6)
                    .addComponent(sub6attended)
                    .addComponent(sub6total)
                    .addComponent(per6))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            DatabaseStudent db = new DatabaseStudent();
            String sql = "select det_val from user_details where det_name='password'";
            System.out.println(sql);
            ResultSet rs = db.stmt.executeQuery(sql);
            rs.next();
            String x = rs.getString(1);
            db.closeConnections();
            HomePage form = new HomePage(x);
            this.setVisible(false);
            form.setVisible(true);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(AttendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel per1;
    private javax.swing.JLabel per2;
    private javax.swing.JLabel per3;
    private javax.swing.JLabel per4;
    private javax.swing.JLabel per5;
    private javax.swing.JLabel per6;
    private javax.swing.JLabel sub1attended;
    private javax.swing.JLabel sub1total;
    private javax.swing.JLabel sub2attended;
    private javax.swing.JLabel sub2total;
    private javax.swing.JLabel sub3attended;
    private javax.swing.JLabel sub3total;
    private javax.swing.JLabel sub4attended;
    private javax.swing.JLabel sub4total;
    private javax.swing.JLabel sub5attended;
    private javax.swing.JLabel sub5total;
    private javax.swing.JLabel sub6attended;
    private javax.swing.JLabel sub6total;
    private javax.swing.JLabel subject1;
    private javax.swing.JLabel subject2;
    private javax.swing.JLabel subject3;
    private javax.swing.JLabel subject4;
    private javax.swing.JLabel subject5;
    private javax.swing.JLabel subject6;
    // End of variables declaration//GEN-END:variables

    private void readFromDatabase() {
        int i=0;
        DatabaseStudent db = new DatabaseStudent();
        String sql = "select * from attendance;";
        try {
           ResultSet rs = db.stmt.executeQuery(sql);
            while(rs.next())
            {
                switch(i)
                {
                    case 0:
                        subject1.setText(rs.getString(1));
                        sub1attended.setText(rs.getInt(2)+"");
                        sub1total.setText(rs.getInt(3)+"");
                        per1.setText(((rs.getInt(2) * 100)/rs.getInt(3))+"");
                        break;
                    case 1:
                        subject2.setText(rs.getString(1));
                        sub2attended.setText(rs.getInt(2)+"");
                        sub2total.setText(rs.getInt(3)+"");
                        per2.setText(((rs.getInt(2) * 100)/rs.getInt(3))+"");
                        break;
                    case 2:
                        subject3.setText(rs.getString(1));
                        sub3attended.setText(rs.getInt(2)+"");
                        sub3total.setText(rs.getInt(3)+"");
                        per3.setText(((rs.getInt(2) * 100)/rs.getInt(3))+"");
                        break;
                    case 3:
                        subject4.setText(rs.getString(1));
                        sub4attended.setText(rs.getInt(2)+"");
                        sub4total.setText(rs.getInt(3)+"");
                        per4.setText(((rs.getInt(2) * 100)/rs.getInt(3))+"");
                        break;
                    case 4:
                        subject5.setText(rs.getString(1));
                        sub5attended.setText(rs.getInt(2)+"");
                        sub5total.setText(rs.getInt(3)+"");
                        per5.setText(((rs.getInt(2) * 100)/rs.getInt(3))+"");
                        break;
                    case 5:
                        subject6.setText(rs.getString(1));
                        sub6attended.setText(rs.getInt(2)+"");
                        sub6total.setText(rs.getInt(3)+"");
                        per6.setText(((rs.getInt(2) * 100)/rs.getInt(3))+"");
                        break;
                }
                i++;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
