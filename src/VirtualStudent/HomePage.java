/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualStudent;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author kishl_000
 */
public class HomePage extends javax.swing.JFrame {

    DatabaseStudent db;
    private String passwd;
    /**
     * Creates new form NewJFrame
     */
    public HomePage(String passwd) {
        initComponents();
        setSize(600,600);
        this.setTitle("Virtual Student");
        this.passwd = passwd;
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        jButton1.setText("Check Attendance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);

        jButton2.setText("Update Attendance");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);

        jButton3.setText("Budget Planner");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);

        jButton4.setText("Holiday Manager");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);

        jButton5.setText("E-Mail");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);

        jButton6.setText("General Formaulae");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);

        jButton7.setText("IT CutOffs");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);

        jButton8.setText("Update Details");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);

        jButton9.setText("Exit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AttendanceForm f1 = new AttendanceForm();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            db = new DatabaseStudent();
            
            //Check if attendance table exists and open view accordingly
            
            
            String sql = "select * from attendance;";
            db.stmt.executeQuery(sql);
            db.closeConnections();
            
            
            //
            
            
            UpdateAttendanceForm u1 = new UpdateAttendanceForm();
            this.setVisible(false);
            u1.setVisible(true);
            
            
        } catch (SQLException ex) {
            db.closeConnections();
            System.err.println(ex);
            AddSubjects f1 = new AddSubjects();
            this.setVisible(false);
            f1.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        FormulaeForm f1 = new FormulaeForm();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
        
        db = new DatabaseStudent();
        try {
            String sql = "select * from budget;";
            System.out.println(sql);
            ResultSet rs = db.stmt.executeQuery(sql);
            db.closeConnections();
            BudgetPlannerForm f1 = new BudgetPlannerForm();
            this.setVisible(false);
            f1.setVisible(true);
        } catch (SQLException ex) {
            System.err.println(ex);
            
            try {

                //Accept the Budget and Account Balance
                
                JTextField bal = new JTextField();
                JTextField bud = new JTextField();
                
               final JComponent cinputs[] = new JComponent[] {
                    new JLabel("Account Balance"),
                    bal,
                    new JLabel("Weekly Budget"),
                    bud
                };
               
               int result = JOptionPane.showConfirmDialog(rootPane, cinputs, "Update Details", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
               
               //insert balance and budget to budget table
               
               if(result == JOptionPane.OK_OPTION)
               {
                   //create Table
                   
                   String sql = "CREATE TABLE BUDGET (USE VARCHAR(15) PRIMARY KEY,AMOUNT INT);";
                   System.out.println(sql);
                   db.stmt.execute(sql);
                   System.out.println("Budget Table Created");
                   
                   
                   //create balance entry
                   
                   sql = "insert into budget values('acc_bal'," +bal.getText() +")";
                   System.out.println(sql);
                   db.stmt.execute(sql);
                   
                   
                   //create budget entry
                   
                   sql = "insert into budget values('weeklybudget'," +bud.getText() +")";
                   System.out.println(sql);
                   db.stmt.execute(sql);
                   
                   
                   //create remaining amount entry
                   
                   sql = "insert into budget values('rem_amt'," +bud.getText() +")";
                   System.out.println(sql);
                   db.stmt.execute(sql);
                   
                   
                   //Open Budget Page
                   
                   db.closeConnections();
                   BudgetPlannerForm f1 = new BudgetPlannerForm();
                   this.setVisible(false);
                   f1.setVisible(true);
                   
                   
                   //create table for weekly update
                   
                   sql = "CREATE TABLE IF NOT EXISTS UPDATETIME (UPDTTIME NUMBER)";
                   System.out.println(sql);
                   db.stmt.execute(sql);
                   System.out.println("Weekly Update Table Created");
                   
                   
                   //insert first time entry
                   sql = "insert into updttime values("+System.currentTimeMillis()+")";
                   System.out.println(sql);
                   db.stmt.execute(sql);
                   System.out.println("Updated current time");
               }
               
               
            } catch (SQLException ex1) {
                System.err.println(ex1);
            }
            
        }
        
         
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        SubjectCutOffForm form = new SubjectCutOffForm();
        this.setVisible(false);
        form.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        EMailForm form = new EMailForm();
        form.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        JPasswordField f = new JPasswordField();
        JComponent inputs[] = new JComponent[] {
        new JLabel("Enter Password"),
        f
    };
        
        int result = JOptionPane.showConfirmDialog(rootPane, inputs, "Confirm Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null);
        if((result == JOptionPane.OK_OPTION))
        {
            if(f.getText().equals(passwd))
            {
                this.setVisible(false);
                UpdateDetailsForm form = new UpdateDetailsForm();
                form.setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Wrong Password");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        HolidayPlannerForm form = new HolidayPlannerForm();
        this.setVisible(false);
        form.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage("pass").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables

}
