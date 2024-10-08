/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Task_3_HotelReservationSystem;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dell
 */
public class HotelLogin extends javax.swing.JFrame {

    /**
     * Creates new form HotelLogin
     */
    public HotelLogin() {
        initComponents();
        
        // add placeHolderStyle
        addPlaceHolderStyle(txtPswrd);
    }
    
    // methods to add and remove place holder style
    public void addPlaceHolderStyle(JTextField textField) {
      Font font = textField.getFont();
      font = font.deriveFont(Font.ITALIC);
      textField.setFont(font);
      textField.setForeground(Color.gray);
    }
    
    public void removePlaceHolderStyle(JTextField textField) {
      Font font = textField.getFont();
      font = font.deriveFont(Font.PLAIN|Font.BOLD);
      textField.setFont(font);
      textField.setForeground(Color.black);
    }

    // method for validation of login in page
    public Boolean validateLogin() {
        String email = txtEmail.getText();
        String pwd = txtPswrd.getText();
        
        if(email.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter email");
            return false;
        }
         if(pwd.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter password");
            return false;
        }
         return true;
    }
    
    // method to check login information is correct
    public void login() {
        String email = txtEmail.getText();
        String pwd = txtPswrd.getText();
        
        try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Reservation_System", "root", "programmer._.2004");
             PreparedStatement pst = con.prepareStatement("select * from users where email = ? and password = ?");
             
             pst.setString(1, email);
             pst.setString(2, pwd);
             
             ResultSet rs = pst.executeQuery();
             if(rs.next()) {
                 JOptionPane.showMessageDialog(this, "Login complete. Glad to see you again!");
                 HotelHomePage home = new HotelHomePage();
                 home.setVisible(true); // show home page frame
                 this.dispose(); // to close the current frame
             } else {
                 JOptionPane.showMessageDialog(this, "Authentication error. Please verify your login details and try again.");
             }
        } catch (Exception e) {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new app.bolivia.swing.JCTextField();
        jButton1 = new javax.swing.JButton();
        txtPswrd = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        chkShowPassword = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 51, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Welcome to EliteReservations ");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Algerian", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText(" - The Ultimate Hotel Reservation Experience ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, 50));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(242, 242, 242));
        jLabel19.setText("X");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 20, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 90));

        jPanel3.setBackground(new java.awt.Color(102, 51, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contact Us: support@elitereservations.com | +92-300-1234567");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Follow Us:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Facebook: facebook.com/EliteReservations");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Instagram: instagram.com/EliteReservations");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Twitter: twitter.com/EliteReservations");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setText("© 2024 EliteReservations. All rights reserved.");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1270, 90));

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        txtEmail.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        txtEmail.setPlaceholder("Enter email example@gmail.com...");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 320, 40));

        jButton1.setBackground(new java.awt.Color(128, 0, 128));
        jButton1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, -1, -1));

        txtPswrd.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        txtPswrd.setText("Enter password...");
        txtPswrd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        txtPswrd.setEchoChar('\u0000');
        txtPswrd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPswrdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPswrdFocusLost(evt);
            }
        });
        txtPswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPswrdActionPerformed(evt);
            }
        });
        jPanel1.add(txtPswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 320, 40));

        jLabel17.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Welcome to EliteReservations ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText(" - The Ultimate Hotel Reservation Experience ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, 50));

        jPanel4.setBackground(new java.awt.Color(152, 103, 164));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel13.setText("Where Luxury Meets Convenience");

        jLabel14.setFont(new java.awt.Font("Serif", 1, 27)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Create Your Account at EliteReservations: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 660, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Task_3_HotelReservationSystem/hotel (1).jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 660, 350));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText(" Don’t have an account? Sign up here.");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 260, 20));

        chkShowPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkShowPassword.setText("Show Password");
        chkShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(chkShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, -1, -1));

        jLabel12.setBackground(new java.awt.Color(34, 34, 34));
        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Task_3_HotelReservationSystem/icons8_Secure_50px.png"))); // NOI18N
        jLabel12.setText("PASSWORD :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, -1, -1));

        jLabel8.setBackground(new java.awt.Color(34, 34, 34));
        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Task_3_HotelReservationSystem/icons8_Secured_Letter_50px.png"))); // NOI18N
        jLabel8.setText("EMAIL :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1271, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1271, 654));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPswrdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPswrdFocusGained
        // TODO add your handling code here:
        if(txtPswrd.getText().equals("Enter password...")) {
            txtPswrd.setText(null);
            txtPswrd.requestFocus();
            // set password character
            txtPswrd.setEchoChar('*');
            // remove placeHolderStyle
            removePlaceHolderStyle(txtPswrd);
        }
    }//GEN-LAST:event_txtPswrdFocusGained

    private void txtPswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPswrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPswrdActionPerformed

    private void txtPswrdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPswrdFocusLost
        // TODO add your handling code here:
        if(txtPswrd.getText().length()==0) {
            addPlaceHolderStyle(txtPswrd);
            txtPswrd.setText("Enter password...");
            txtPswrd.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtPswrdFocusLost

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(validateLogin()) {
            login();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
          HotelSignUp pg = new HotelSignUp();
        pg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void chkShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPasswordActionPerformed
        // TODO add your handling code here:
        if (chkShowPassword.isSelected()) {
            // Show the password
            txtPswrd.setEchoChar((char) 0); // Sets the password field to display plain text
        } else {
            // Hide the password
            txtPswrd.setEchoChar('*'); // Resets the masking character (typically a dot or asterisk)
        }
    }//GEN-LAST:event_chkShowPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(HotelLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkShowPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private app.bolivia.swing.JCTextField txtEmail;
    private javax.swing.JPasswordField txtPswrd;
    // End of variables declaration//GEN-END:variables
}
