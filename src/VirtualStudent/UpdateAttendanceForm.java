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
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author kishl_000
 */
public class UpdateAttendanceForm extends javax.swing.JFrame {

    DatabaseStudent db;
    int count;
    String subs[] = new String[4];
    ResultSet rs;
    /**
     * Creates new form UpdateAttendanceForm
     */
    public UpdateAttendanceForm() {
        initComponents();
        setSize(620,500);
        this.setTitle("Update Attendance");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setResizable(false);
        backbutton.setIcon(new ImageIcon("C:\\Users\\kishl_000\\OneDrive\\Documents\\Images\\back_button.png"));
        count=-1;
        createFormFromData();   // create a form according to today's day
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
        subject = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        day = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();

        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subject.setText("subject");

        jRadioButton1.setText("Attended");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Bunked");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Cancelled");

        day.setText("Day");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(subject)
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(day)))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(day)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(subject))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       try
       {
           if(jRadioButton1.isSelected())
        {
                String sql = "update attendance set attended=attended+1 where subject='" + subject.getText() + "';";
                System.out.println(sql);
                db.stmt.executeUpdate(sql);
                sql = "update attendance set total=total+1 where subject='" + subject.getText() + "';";
                System.out.println(sql);
                db.stmt.executeUpdate(sql);
                System.out.println(subject.getText()+" attendance updated");
        }
         else  if(jRadioButton2.isSelected())
        {
                String sql = "update attendance set total=total+1 where subject='" + subject.getText() + "';";
                System.out.println(sql);
                db.stmt.executeUpdate(sql);
                System.out.println(subject.getText()+" attendance is updated");
        }
           
           if(count > 0)
           {
               subject.setText(subs[--count]);
           }
           else
           {
               subject.setVisible(false);
               jRadioButton1.setVisible(false);
               jRadioButton2.setVisible(false);
               jRadioButton3.setVisible(false);
               jButton1.setVisible(false);
               day.setText("Updated");
           }
       }
       catch(SQLException ex)
       {
           System.err.println(ex);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            db = new DatabaseStudent();
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
            java.util.logging.Logger.getLogger(UpdateAttendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAttendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAttendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAttendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAttendanceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel day;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel subject;
    // End of variables declaration//GEN-END:variables

    private void createFormFromData() {
        try {
            Calendar c = Calendar.getInstance();
            db = new DatabaseStudent();
            String sql = "Holiday";
            
            //Find Which day of the week it is
            
            switch(c.get(Calendar.DAY_OF_WEEK))
            {
                case Calendar.MONDAY:    
                sql = "select * from attendance where subject in (select subject from timetable where day like 'Monday');";
                day.setText("Monday");
                break;
                case Calendar.TUESDAY:    
                sql = "select * from attendance where subject in (select subject from timetable where day like 'Tuesday');";
                day.setText("Tuesday");
                break;
                case Calendar.WEDNESDAY:    
                sql = "select * from attendance where subject in (select subject from timetable where day like 'Wednesday');";
                day.setText("Wednesday");
                break;    
                case Calendar.THURSDAY:    
                sql = "select * from attendance where subject in (select subject from timetable where day like 'Thursday');";
                day.setText("Thursday");
                break;
                case Calendar.FRIDAY:    
                sql = "select * from attendance where subject in (select subject from timetable where day like 'Friday');";
                day.setText("Friday");
                break;
                case Calendar.SATURDAY:    
                sql = "select * from attendance where subject in (select subject from timetable where day like 'Saturday');";
                day.setText("Saturday");
                break;
                case Calendar.SUNDAY:    
                    subject.setVisible(false);
               jRadioButton1.setVisible(false);
               jRadioButton2.setVisible(false);
               jRadioButton3.setVisible(false);
               jButton1.setVisible(false);
               day.setText("It's Sunday!!");
                break;
            }
                    
            //Load the Subjects
                    
             rs = db.stmt.executeQuery(sql);
             rs.next();
             
             //Store in Array
             
            do
            {
               subs[++count] = rs.getString(1);
            }
            while(rs.next());
            subject.setText(subs[count]);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        
    }
}
