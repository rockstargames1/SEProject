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
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
public class LoginForm extends javax.swing.JFrame {

    DatabaseStudent db;
    private String passwd;
    private String emailid;
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        setSize(600,600);
        this.setTitle("Login");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setResizable(false);
        setLayout(new BorderLayout());
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\kishl_000\\OneDrive\\Documents\\Images\\background1.jpe"));
	add(background);
         db = new DatabaseStudent();
        loadUser();
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
        usernm = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        usernm.setText("YourName");

        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        jButton1.setText("Forgot Password?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernm)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(loginbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)))
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernm))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(loginbutton)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(174, 174, 174))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        // TODO add your handling code here:
        if(passwd.equals(jPasswordField1.getText()))
        {
            db.closeConnections();
            this.setVisible(false);
            HomePage form = new HomePage(passwd);
            form.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Wrong Password");
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GMailMessageSend();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JLabel usernm;
    // End of variables declaration//GEN-END:variables

    private void loadUser() {
        try {
            String sql = "select det_val from user_details";
            System.out.println(sql);
            ResultSet rs = db.stmt.executeQuery(sql);
            rs.next();
            usernm.setText(rs.getString(1));
            rs.next();
            passwd = rs.getString(1);
            rs.next();
            emailid = rs.getString(1);
        } catch (SQLException ex) {
            System.err.println(ex);
            JComponent inputs[] = new JComponent[6];
            inputs[0] = new JLabel("Full Name:");
            inputs[1] = new JTextField();
            inputs[2] = new JLabel("Password:");
            inputs[3] = new JPasswordField();
            inputs[4] = new JLabel("Email ID:");
            inputs[5] = new JTextField();
            
            int result = JOptionPane.showConfirmDialog(rootPane, inputs, "Enter Details", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if(result == JOptionPane.OK_OPTION)
            {
                try {
                    
                    //create details table
                    
                    String sql = "create table user_details(det_name varchar(15),det_val varchar(25))";
                    System.out.println(sql);
                    System.out.println("User Details Table Created");
                    db.stmt.execute(sql);
                    
                    //insert username
                    
                    sql = "insert into user_details values('username','" +((JTextField)inputs[1]).getText()+ "')";
                    System.out.println(sql);
                    db.stmt.execute(sql);
                    
                    //insert password
                    
                    sql = "insert into user_details values('password','" +((JPasswordField)inputs[3]).getText()+ "')";
                    System.out.println(sql);
                    db.stmt.execute(sql);
                    
                    //insert emailid 
                    
                    sql = "insert into user_details values('emailid','" +((JTextField)inputs[5]).getText()+ "')";
                    System.out.println(sql);
                    db.stmt.execute(sql);
                    
                    loadUser();
                } catch (SQLException ex1) {
                    System.err.println(ex1);
                }
                
            }
            else
            {
                System.exit(1);
            }
        }
    }
    
    public void GMailMessageSend()
    {
              // Recipient's email ID needs to be mentioned.
      String to = emailid;//change accordingly

      // Sender's email ID needs to be mentioned
      String from = "kishlay.kumar89@gmail.com";//change accordingly
      final String username = "kishlay.kumar89";//change accordingly
      final String password = "asdfghjkl";//change accordingly

      
      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");

      // Get the Session object.
      Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
         }
      });

      try {
         // Create a default MimeMessage object.
         Message message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse(to));

         // Set Subject: header field
         message.setSubject("Your Password");

         // Now set the actual message
         String someHtmlMessage = "Your password is "+passwd;
         System.out.println(someHtmlMessage);
         message.setText(someHtmlMessage);
         

         // Send message
         Transport.send(message);

         JOptionPane.showMessageDialog(null ,"Password sent to registered E-Mail Address");

      } catch (MessagingException e) {
            throw new RuntimeException(e);
      }
    }
}
