/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pointofsales;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class loginpage extends javax.swing.JFrame {

    /**
     * Creates new form loginpage
     */
    
    /*public static final String ICON_PATH = "resources/com/mycompany/pointofsales/resources/ilus1.png";
    
    public static final String ICON_PATH2 = "D:/Netbeans/Point-Of-Sales/PointOfSales/src/main/java/com/mycompany/pointofsales/resources/ilus1.png";
*/

    
    public loginpage() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xF5F5DC"));
       
        /*ImageIcon icon = new ImageIcon(getClass().getResource(ICON_PATH));
        icon1.setIcon(icon); // Menetapkan ImageIcon ke JLabel*/
        
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/ilus1.png")));
        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/ilus2.png")));
        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/ilus3.png")));
        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/ilus4.png")));


        

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        inputPsw = new javax.swing.JTextField();
        inputUsn = new javax.swing.JTextField();
        icon3 = new javax.swing.JLabel();
        lupaPW = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        icon4 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 220));
        setMinimumSize(new java.awt.Dimension(900, 493));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 66, 37));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 65)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 220));
        jLabel1.setText("RELASI JAYA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 220));
        jLabel2.setText("Toko alat tulis pilihan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        icon1.setIcon(new javax.swing.ImageIcon("D:\\Netbeans\\Point-Of-Sales\\PointOfSales\\src\\main\\java\\resources\\ilus1.png")); // NOI18N
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 66, 37));
        jLabel5.setText("LOGIN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 240, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 240, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, 30));

        inputPsw.setBackground(new java.awt.Color(245, 245, 220));
        inputPsw.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputPsw.setToolTipText("");
        inputPsw.setBorder(null);
        inputPsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPswActionPerformed(evt);
            }
        });
        getContentPane().add(inputPsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 210, 30));

        inputUsn.setBackground(new java.awt.Color(245, 245, 220));
        inputUsn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputUsn.setToolTipText("");
        inputUsn.setBorder(null);
        inputUsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsnActionPerformed(evt);
            }
        });
        getContentPane().add(inputUsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 210, -1));

        icon3.setIcon(new javax.swing.ImageIcon("D:\\Netbeans\\Point-Of-Sales\\PointOfSales\\src\\main\\java\\resources\\ilus3.png")); // NOI18N
        getContentPane().add(icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 30, 30));

        lupaPW.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lupaPW.setText("*Khusus kasir");
        lupaPW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lupaPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 60, -1));

        login.setBackground(new java.awt.Color(0, 66, 37));
        login.setFont(new java.awt.Font("STHupo", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("login");
        login.setBorder(null);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 120, 40));

        icon4.setIcon(new javax.swing.ImageIcon("D:\\Netbeans\\Point-Of-Sales\\PointOfSales\\src\\main\\java\\resources\\ilus4.png")); // NOI18N
        getContentPane().add(icon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 30, 30));

        icon2.setIcon(new javax.swing.ImageIcon("D:\\Netbeans\\Point-Of-Sales\\PointOfSales\\src\\main\\java\\resources\\ilus2.png")); // NOI18N
        getContentPane().add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 120, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputPswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPswActionPerformed

    private void inputUsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsnActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        try {
            LoginClass tesLogin = new LoginClass();
            String username = String.valueOf(inputUsn.getText());
            String password = String.valueOf(inputPsw.getText());
            
            tesLogin.login(username, password);
            if (tesLogin.login(username, password)){
                dispose();
                new homepage().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Username atau Password salah!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void login(String args[]) {
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
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JTextField inputPsw;
    private javax.swing.JTextField inputUsn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton login;
    private javax.swing.JLabel lupaPW;
    // End of variables declaration//GEN-END:variables
}
