/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camping.org;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author harish
 */
public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterFrame
     */
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/MyProject";
    static final String USER = "root";
   static final String PASS = "mysql";
    public RegisterFrame() {
        initComponents();
        
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(java.awt.Color.gray);
        jLabel1.setFont(new java.awt.Font("URW Gothic L", 1, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Registration Form");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 10, 400, 60);

        jLabel2.setBackground(java.awt.Color.gray);
        jLabel2.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("First Name");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 132, 110, 38);

        jLabel3.setBackground(java.awt.Color.gray);
        jLabel3.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Last Name");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 228, 110, 38);

        jLabel4.setBackground(java.awt.Color.gray);
        jLabel4.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("username");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 325, 110, 38);

        jLabel5.setBackground(java.awt.Color.gray);
        jLabel5.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("email");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 415, 110, 38);

        jLabel6.setBackground(java.awt.Color.gray);
        jLabel6.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("contact ");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 502, 110, 38);

        jLabel7.setBackground(java.awt.Color.gray);
        jLabel7.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("password");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 593, 110, 40);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(589, 593, 249, 40);

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        getContentPane().add(firstname);
        firstname.setBounds(589, 132, 250, 38);

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        getContentPane().add(lastname);
        lastname.setBounds(589, 228, 249, 38);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(589, 325, 249, 38);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(589, 415, 249, 38);

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        getContentPane().add(contact);
        contact.setBounds(589, 502, 249, 38);

        jButton1.setBackground(java.awt.Color.gray);
        jButton1.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        jButton1.setForeground(java.awt.Color.black);
        jButton1.setText("create account");
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(489, 663, 211, 31);

        jLabel8.setIcon(new javax.swing.ImageIcon("/home/harish/project/registration.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1220, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
        
       
      
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
        
       
      
    }//GEN-LAST:event_usernameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
        
       
      
    }//GEN-LAST:event_emailActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Connection conn = null;
        PreparedStatement pstmt = null;
       
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Connected database successfully...");
        
            pstmt = conn.prepareStatement("INSERT INTO `userData`(firstName,lastName,username,email,contact,password) VALUES (?,?,?,?,?,?)");
            System.out.println("Inserting records into the table...");
            pstmt.setString(1,firstname.getText());
            pstmt.setString(2,lastname.getText());
            pstmt.setString(3,username.getText());
            pstmt.setString(4,email.getText());
            pstmt.setInt(5,Integer.parseInt(contact.getText()));
            pstmt.setString(6,password.getText());
            
            pstmt.executeUpdate();
            System.out.println("Inserted records into the table...");
           
        } 
        catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }
        
        dispose();
        new MyProjectFrame().setVisible(true);
        JOptionPane.showMessageDialog(null, 
                              "Account Created successfully", 
                              "Success!", 
                              JOptionPane.INFORMATION_MESSAGE);
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        
      
      
       
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
        
      
      
    }//GEN-LAST:event_lastnameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
         
        //</editor-fold>

       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastname;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
