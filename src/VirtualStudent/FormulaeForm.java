/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualStudent;

/**
 *
 * @author kishl_000
 */
public class FormulaeForm extends javax.swing.JFrame {

    /**
     * Creates new form FormulaeForm
     */
    public FormulaeForm() {
        initComponents();
        setSize(360,360);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trigo = new javax.swing.JButton();
        integral = new javax.swing.JButton();
        algebra = new javax.swing.JButton();
        physics = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 2));

        trigo.setText("Trigonometry");
        trigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trigoActionPerformed(evt);
            }
        });
        getContentPane().add(trigo);

        integral.setText("Integral");
        integral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integralActionPerformed(evt);
            }
        });
        getContentPane().add(integral);

        algebra.setText("Algebra");
        algebra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                algebraActionPerformed(evt);
            }
        });
        getContentPane().add(algebra);

        physics.setText("Physics");
        physics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physicsActionPerformed(evt);
            }
        });
        getContentPane().add(physics);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trigoActionPerformed
        // TODO add your handling code here:
        String url = "http://videomathteacher.com/wp-content/uploads/2013/07/trig-ref2.jpg";
        FormulaPageForm f1 = new FormulaPageForm(0, 0, 1770, 1280, url);
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_trigoActionPerformed

    private void integralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integralActionPerformed
        // TODO add your handling code here:
        String url = "https://s-media-cache-ak0.pinimg.com/736x/68/08/fe/6808feb13a70e0d27756a82c092f1d73.jpg";
        FormulaPageForm f1 = new FormulaPageForm(0, 25, 550, 800, url);
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_integralActionPerformed

    private void algebraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_algebraActionPerformed
        // TODO add your handling code here:
        String url = "https://lh6.ggpht.com/fndVuk88fpmqAGYWwk0oqZPgNvwCFswMt6jjQbv78b6GumaPxf-gUYWqomJCE55cNxI=h900";
        FormulaPageForm f1 = new FormulaPageForm(0, 40, 720, 940, url);
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_algebraActionPerformed

    private void physicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physicsActionPerformed
        // TODO add your handling code here:
        String url = "http://image.slidesharecdn.com/formulalist3-150315024415-conversion-gate01/95/physics-formula-list-3-2-638.jpg?cb=1426387470";
        FormulaPageForm f1 = new FormulaPageForm(0, 0, 650, 840, url);
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_physicsActionPerformed

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
            java.util.logging.Logger.getLogger(FormulaeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormulaeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormulaeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormulaeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormulaeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton algebra;
    private javax.swing.JButton integral;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton physics;
    private javax.swing.JButton trigo;
    // End of variables declaration//GEN-END:variables
}