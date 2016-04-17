/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualStudent;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author kishl_000
 */
public class SubjectCutOffForm extends javax.swing.JFrame {

    String sql = "select mean_internals,cutoff from marks where subject=";
    DatabaseStudent db;
    /**
     * Creates new form SubjectCutOffForm
     */
    public SubjectCutOffForm() {
        initComponents();
        setSize(620,500);
        this.setTitle("CutOff Predictor");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setResizable(false);
        backbutton.setIcon(new ImageIcon("C:\\Users\\kishl_000\\OneDrive\\Documents\\Images\\back_button.png"));
        db = new DatabaseStudent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dbs = new javax.swing.JButton();
        maths = new javax.swing.JButton();
        se = new javax.swing.JButton();
        comp = new javax.swing.JButton();
        cnw = new javax.swing.JButton();
        gbr = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Mean Of Internals:");

        dbs.setText("DBS");
        dbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbsActionPerformed(evt);
            }
        });

        maths.setText("MATHS");
        maths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathsActionPerformed(evt);
            }
        });

        se.setText("SE");
        se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seActionPerformed(evt);
            }
        });

        comp.setText("COMP");
        comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compActionPerformed(evt);
            }
        });

        cnw.setText("CNW");
        cnw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnwActionPerformed(evt);
            }
        });

        gbr.setText("GBR");
        gbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbrActionPerformed(evt);
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
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dbs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(se, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cnw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maths, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gbr, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbs)
                    .addComponent(maths))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(se)
                    .addComponent(comp))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gbr)
                    .addComponent(cnw))
                .addGap(115, 115, 115))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbsActionPerformed
        // TODO add your handling code here:
        SimpleRegression("'dbs'");
    }//GEN-LAST:event_dbsActionPerformed

    private void mathsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathsActionPerformed
        // TODO add your handling code here:
        SimpleRegression("'maths'");
    }//GEN-LAST:event_mathsActionPerformed

    private void seActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seActionPerformed
        // TODO add your handling code here:
        SimpleRegression("'se'");
    }//GEN-LAST:event_seActionPerformed

    private void compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compActionPerformed
        // TODO add your handling code here:
        SimpleRegression("'comp'");
    }//GEN-LAST:event_compActionPerformed

    private void cnwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnwActionPerformed
        // TODO add your handling code here:
        SimpleRegression("'cnw'");
    }//GEN-LAST:event_cnwActionPerformed

    private void gbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbrActionPerformed
        // TODO add your handling code here:
        SimpleRegression("'gbr'");
    }//GEN-LAST:event_gbrActionPerformed

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
            java.util.logging.Logger.getLogger(SubjectCutOffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectCutOffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectCutOffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectCutOffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectCutOffForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JButton cnw;
    private javax.swing.JButton comp;
    private javax.swing.JButton dbs;
    private javax.swing.JButton gbr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton maths;
    private javax.swing.JButton se;
    // End of variables declaration//GEN-END:variables

    private void SimpleRegression(String subject) {
        if(jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Enter mean for this semester");
        }
        else
        {
            try {
                String sql;
                sql = this.sql+subject;
                System.out.println(sql);
                ResultSet rs=db.stmt.executeQuery(sql);
                
                int MAXN = 10;
                int n = 0;
                double[] x = new double[MAXN];
                double[] y = new double[MAXN];
                double sumx = 0.0, sumy = 0.0, sumx2 = 0.0;
                rs.next();
                while(n < 10) {
                    x[n] = rs.getDouble(1);
                    y[n] = rs.getDouble(2);
                    sumx  += x[n];
                    sumx2 += x[n] * x[n];
                    sumy  += y[n];
                    n++;
                    rs.next();
                }       double xbar = sumx / n;
                double ybar = sumy / n;
                double xxbar = 0.0, yybar = 0.0, xybar = 0.0;
                for (int i = 0; i < n; i++) {
                    xxbar += (x[i] - xbar) * (x[i] - xbar);
                    yybar += (y[i] - ybar) * (y[i] - ybar);
                    xybar += (x[i] - xbar) * (y[i] - ybar);
                }       double beta1 = xybar / xxbar;
                double beta0 = ybar - beta1 * xbar;
                // print results
                System.out.println("y   = " + beta1 + " * x + " + beta0);
                // analyze results
                int df = n - 2;
                double rss = 0.0;      // residual sum of squares
                double ssr = 0.0;      // regression sum of squares
                for (int i = 0; i < n; i++) {
                    double fit = beta1*x[i] + beta0;
                    rss += (fit - y[i]) * (fit - y[i]);
                    ssr += (fit - ybar) * (fit - ybar);
                }       double R2    = ssr / yybar;
                double svar  = rss / df;
                double svar1 = svar / xxbar;
                double svar0 = svar/n + xbar*xbar*svar1;
                System.out.println("R^2                 = " + R2);
                System.out.println("std error of beta_1 = " + Math.sqrt(svar1));
                System.out.println("std error of beta_0 = " + Math.sqrt(svar0));
                svar0 = svar * sumx2 / (n * xxbar);
                System.out.println("std error of beta_0 = " + Math.sqrt(svar0));
                System.out.println("SSTO = " + yybar);
                System.out.println("SSE  = " + rss);
                System.out.println("SSR  = " + ssr);
                double mean = Double.parseDouble(jTextField1.getText());
                JComponent inputs[] = new JComponent[2];
                //Double to store predicted value
                double prediction = ((mean*beta1)+beta0);
                //Show accurate to 2 decimal places
                inputs[0] = new JLabel("Predicted A+ CutOff:    "+String.valueOf(prediction).substring(0,5));
                inputs[1] = new JLabel("Prediction Accuracy:    "+(""+((ssr * 100)/yybar)).substring(0,5));
                JOptionPane.showMessageDialog(rootPane, inputs, "Predicted CutOff", JOptionPane.PLAIN_MESSAGE);
            } catch (SQLException ex) {
                System.err.println(ex);
            }
            catch(NumberFormatException ex1) {
                System.err.println(ex1);
                JOptionPane.showMessageDialog(rootPane, "Invalid Number Entered");
            }
            
        }
    }
}
