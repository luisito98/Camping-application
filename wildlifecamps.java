/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camping.org;

import static camping.org.RegisterFrame.URL;
import static camping.org.RegisterFrame.USER;
import static camping.org.RegisterFrame.PASS;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author harish
 */
public class wildlifecamps extends javax.swing.JFrame {

    /**
     * Creates new form wildlifecamps
     */
    static String currentuser = null;
    public wildlifecamps(String s) {
        
        currentuser = s;
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

        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        WCB1 = new javax.swing.JButton();
        WCB2 = new javax.swing.JButton();
        WCB3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        WC2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        WC3 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        wc1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();

        jScrollPane4.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(java.awt.Color.orange);
        jLabel1.setFont(new java.awt.Font("URW Chancery L", 1, 58)); // NOI18N
        jLabel1.setText("WILDLIFE CAMPS");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 0, 512, 70);

        WCB1.setBackground(java.awt.Color.orange);
        WCB1.setFont(new java.awt.Font("URW Gothic L", 1, 15)); // NOI18N
        WCB1.setForeground(java.awt.Color.black);
        WCB1.setText("BOOK");
        WCB1.setOpaque(true);
        WCB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WCB1MouseClicked(evt);
            }
        });
        WCB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WCB1ActionPerformed(evt);
            }
        });
        getContentPane().add(WCB1);
        WCB1.setBounds(105, 270, 70, 28);

        WCB2.setBackground(java.awt.Color.orange);
        WCB2.setFont(new java.awt.Font("URW Gothic L", 1, 15)); // NOI18N
        WCB2.setForeground(java.awt.Color.black);
        WCB2.setText("BOOK");
        WCB2.setOpaque(true);
        WCB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WCB2MouseClicked(evt);
            }
        });
        WCB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WCB2ActionPerformed(evt);
            }
        });
        getContentPane().add(WCB2);
        WCB2.setBounds(260, 600, 80, 28);

        WCB3.setBackground(java.awt.Color.orange);
        WCB3.setFont(new java.awt.Font("URW Gothic L", 1, 15)); // NOI18N
        WCB3.setForeground(java.awt.Color.black);
        WCB3.setText("BOOK");
        WCB3.setOpaque(true);
        WCB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WCB3MouseClicked(evt);
            }
        });
        WCB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WCB3ActionPerformed(evt);
            }
        });
        getContentPane().add(WCB3);
        WCB3.setBounds(910, 960, 80, 28);

        WC2.setEditable(false);
        WC2.setBackground(java.awt.Color.orange);
        WC2.setColumns(20);
        WC2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        WC2.setRows(5);
        WC2.setText("\t\tLittle Rann of Kutch\nLRK, because of its proximity to the Gulf of Kutch and geographical location, \nlies on the migration route of many bird species. Every winter this desert \nmudflat ecosystem is flocked with more than 50000 winged migrants, visiting\n LRK  from different parts of the world, viz. - Egypt, Iraq, Tibet, Siberia and \nEurope.LRK is undoubtedly one of the best places to observe and study \nmigratory birds.Due toits unique flat land, visibility is not a problem.\nAMOUNT - Rs. 40,100/-");
        jScrollPane2.setViewportView(WC2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(120, 480, 320, 120);

        WC3.setEditable(false);
        WC3.setBackground(java.awt.Color.orange);
        WC3.setColumns(20);
        WC3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        WC3.setRows(5);
        WC3.setText("\t\tKaziranga - Gibbon Sanctuary \nKaziranga National Park: The famed one-horned rhinoceros, one of India’s best\n-known tourism mascots, calls the expansive grasslands of the Kaziranga \nNational Park its home. Situated in the floodplains of the Brahmaputra river, \nKaziranga is an idyllic location for anyone who reveres Mother Nature.\nAMOUNT - Rs.45,500/-");
        jScrollPane3.setViewportView(WC3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(760, 850, 360, 110);

        wc1.setEditable(false);
        wc1.setBackground(java.awt.Color.orange);
        wc1.setColumns(20);
        wc1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        wc1.setRows(5);
        wc1.setText("Panna National Park  \nThe Panna National Park is located in Panna andChhatarpur districts of Madhya\n Pradesh in India, covering an area of 1645 sq.km. The Ken river, which flows \n through the park from south to north, is home to the Gharial and Mugger, and \nother aquatic fauna.\nAmount - Rs.35,500/-");
        jScrollPane1.setViewportView(wc1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 290, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/harish/project/panna.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 0, 650, 380);

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/harish/project/lrk.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 370, 600, 410);

        jLabel4.setIcon(new javax.swing.ImageIcon("/home/harish/project/kaziranga.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 690, 760, 410);

        jMenuBar1.setBackground(new java.awt.Color(249, 240, 247));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setForeground(new java.awt.Color(12, 9, 2));
        jMenuBar1.setFont(new java.awt.Font("URW Gothic L", 1, 15)); // NOI18N

        home.setBackground(new java.awt.Color(242, 241, 237));
        home.setForeground(new java.awt.Color(20, 17, 7));
        home.setText(" HOME");
        home.setFont(new java.awt.Font("URW Gothic L", 1, 15)); // NOI18N
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home.setMaximumSize(new java.awt.Dimension(90, 32767));
        home.setPreferredSize(new java.awt.Dimension(60, 19));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        home.add(jSeparator1);

        jMenuBar1.add(home);

        jMenu1.setBackground(new java.awt.Color(250, 249, 244));
        jMenu1.setForeground(new java.awt.Color(12, 10, 4));
        jMenu1.setText("GALLERY");
        jMenu1.setFont(new java.awt.Font("URW Gothic L", 1, 15)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setMaximumSize(new java.awt.Dimension(100, 32767));
        jMenu1.setPreferredSize(new java.awt.Dimension(60, 19));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.add(jSeparator2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(228, 226, 214));
        jMenu2.setForeground(new java.awt.Color(9, 7, 2));
        jMenu2.setText("BOOKING");
        jMenu2.setFont(new java.awt.Font("URW Gothic L", 1, 15)); // NOI18N
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setMaximumSize(new java.awt.Dimension(100, 32767));
        jMenu2.setPreferredSize(new java.awt.Dimension(60, 19));

        jMenuItem1.setFont(new java.awt.Font("URW Gothic L", 1, 15)); // NOI18N
        jMenuItem1.setText("WILDLIFE CAMPS");
        jMenuItem1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("URW Gothic L", 1, 15)); // NOI18N
        jMenuItem2.setText("TREKS");
        jMenuItem2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("URW Gothic L", 1, 15)); // NOI18N
        jMenuItem3.setText("INTERNATIONAL CAMPS");
        jMenuItem3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator3);

        jMenuBar1.add(jMenu2);

        jMenu4.setForeground(new java.awt.Color(33, 29, 22));
        jMenu4.setText("YOUR BOOKINGS AND CANCELLATION");
        jMenu4.setFont(new java.awt.Font("URW Gothic L", 1, 15)); // NOI18N
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jMenu4.setMaximumSize(new java.awt.Dimension(315, 32767));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.add(jSeparator4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WCB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WCB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WCB2ActionPerformed

    private void WCB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WCB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WCB3ActionPerformed

    private void WCB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WCB1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_WCB1ActionPerformed

    private void WCB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WCB1MouseClicked
        // TODO add your handling code here:
            Connection conn = null;
            PreparedStatement pstmt = null;
            Statement stmt = null;
            String book_id = "wc1";
            try
            {
                System.out.println("current user is:"+currentuser);
                
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                pstmt = conn.prepareStatement("update `userData` set booking_id=? where username = '" +currentuser+"';");
                pstmt.setString(1,book_id);
                pstmt.executeUpdate();
             
               stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select booking_id from userData where username = '"+currentuser+"';");
                rs.next();
                String bid = rs.getString(1);
                
                String query = "insert into bookings values (?,?);";
                pstmt =  conn.prepareStatement(query);
                pstmt.setString(1,currentuser);
                pstmt.setString(2,bid);
                pstmt.executeUpdate();
                
                System.out.println("booking confirmed and booking id updated");
                JOptionPane.showMessageDialog(null, 
                        "booking confirmed",
                        "Welcome!", 
                        JOptionPane.INFORMATION_MESSAGE);
            }
            catch(SQLException se)
            {
                se.printStackTrace();
            }
            catch(Exception e){
      //Handle errors for Class.forName
            e.printStackTrace();
            }
            
    }//GEN-LAST:event_WCB1MouseClicked

     private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        dispose();
        new yourbooking(currentuser).setVisible(true);
    }    
    private void WCB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WCB2MouseClicked
        // TODO add your handling code here:
        Connection conn = null;
            PreparedStatement pstmt = null;
            Statement stmt = null;
            String book_id = "wc2";
            try
            {
                System.out.println("current user is:"+currentuser);
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                pstmt = conn.prepareStatement("update `userData` set booking_id=? where username = '" +currentuser+"';");
                pstmt.setString(1,book_id);
                pstmt.executeUpdate();
                 
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select booking_id from userData where username = '"+currentuser+"';");
                rs.next();
                String bid = rs.getString(1);
                
                String query = "insert into bookings values (?,?);";
                pstmt =  conn.prepareStatement(query);
                pstmt.setString(1,currentuser);
                pstmt.setString(2,bid);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, 
                        "booking confirmed",
                        "Welcome!", 
                        JOptionPane.INFORMATION_MESSAGE);
                System.out.println("booking confirmed and booking id updated");
                
            }
            catch(SQLException se)
            {
                se.printStackTrace();
            }
            catch(Exception e){
      //Handle errors for Class.forName
            e.printStackTrace();
            }
    }//GEN-LAST:event_WCB2MouseClicked

    private void WCB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WCB3MouseClicked
        // TODO add your handling code here:
        Connection conn = null;
            PreparedStatement pstmt = null;
            Statement stmt = null;
            String book_id = "wc3";
            try
            {
                System.out.println("current user is:"+currentuser);
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                pstmt = conn.prepareStatement("update `userData` set booking_id=? where username = '" +currentuser+"';");
                pstmt.setString(1,book_id);
                pstmt.executeUpdate();
                 stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select booking_id from userData where username = '"+currentuser+"';");
                rs.next();
                String bid = rs.getString(1);
                
                String query = "insert into bookings values (?,?);";
                pstmt =  conn.prepareStatement(query);
                pstmt.setString(1,currentuser);
                pstmt.setString(2,bid);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, 
                        "booking confirmed",
                        "Welcome!", 
                        JOptionPane.INFORMATION_MESSAGE);
                System.out.println("booking confirmed and booking id updated");
                
            }
            catch(SQLException se)
            {
                se.printStackTrace();
            }
            catch(Exception e){
      //Handle errors for Class.forName
            e.printStackTrace();
            }
    }//GEN-LAST:event_WCB3MouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        dispose();
        new MyProjectFrame().setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        dispose();
        new gallery(currentuser).setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dispose();
        new treks(currentuser).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        dispose();
        new intrcamps(currentuser).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
         dispose();
        new yourbooking(currentuser).setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

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
            java.util.logging.Logger.getLogger(wildlifecamps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wildlifecamps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wildlifecamps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wildlifecamps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wildlifecamps(currentuser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea WC2;
    private javax.swing.JTextArea WC3;
    private javax.swing.JButton WCB1;
    private javax.swing.JButton WCB2;
    private javax.swing.JButton WCB3;
    private javax.swing.JMenu home;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTextArea wc1;
    // End of variables declaration//GEN-END:variables
}
