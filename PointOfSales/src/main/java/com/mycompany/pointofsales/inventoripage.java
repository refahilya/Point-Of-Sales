/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pointofsales;

import java.awt.Color;

/**
 *
 * @author ASUS
 */
public class inventoripage extends javax.swing.JFrame {

    /**
     * Creates new form inventoripage
     */
    public inventoripage() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xE4E4DF"));
        relasijy.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/relasijy2.png")));
        relasijy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/relasijy2.png")));
        relasijy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/relasijy2.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inventori = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        beranda = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        relasijy = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        relasijy1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        relasijy2 = new javax.swing.JLabel();
        transaksi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1274, 698));
        setMinimumSize(new java.awt.Dimension(1274, 698));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 66, 37));
        jLabel5.setText("Member");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 590, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 66, 37));
        jLabel6.setText("Riwayat");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 590, -1, 30));

        inventori.setBackground(new java.awt.Color(245, 245, 220));
        inventori.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inventori.setForeground(new java.awt.Color(0, 66, 37));
        inventori.setText("Inventori");
        inventori.setBorder(null);
        inventori.setBorderPainted(false);
        inventori.setContentAreaFilled(false);
        inventori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoriActionPerformed(evt);
            }
        });
        getContentPane().add(inventori, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, -1, 30));

        jPanel1.setBackground(new java.awt.Color(245, 245, 220));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 110, 30));

        jPanel3.setBackground(new java.awt.Color(0, 66, 37));

        logout.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("LOGOUT");
        logout.setBorder(null);
        logout.setBorderPainted(false);
        logout.setContentAreaFilled(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 100, 30));

        beranda.setBackground(new java.awt.Color(228, 228, 223));
        beranda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        beranda.setForeground(new java.awt.Color(0, 66, 37));
        beranda.setText("Beranda");
        beranda.setBorder(null);
        beranda.setBorderPainted(false);
        beranda.setContentAreaFilled(false);
        beranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        beranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berandaActionPerformed(evt);
            }
        });
        getContentPane().add(beranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 176, 0));
        jLabel8.setText("REFA");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 66, 37));
        jLabel9.setText("Welcome, ");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 66, 37));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        relasijy.setIcon(new javax.swing.ImageIcon("D:\\Netbeans\\Point-Of-Sales\\PointOfSales\\src\\main\\java\\resources\\relasijy2.png")); // NOI18N
        jPanel2.add(relasijy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jTabbedPane1.addTab("Tambah Data", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        relasijy1.setIcon(new javax.swing.ImageIcon("D:\\Netbeans\\Point-Of-Sales\\PointOfSales\\src\\main\\java\\resources\\relasijy2.png")); // NOI18N
        jPanel4.add(relasijy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jTabbedPane1.addTab("Update Data", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        relasijy2.setIcon(new javax.swing.ImageIcon("D:\\Netbeans\\Point-Of-Sales\\PointOfSales\\src\\main\\java\\resources\\relasijy2.png")); // NOI18N
        jPanel5.add(relasijy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jTabbedPane1.addTab("Hapus Data", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1200, 520));

        transaksi.setBackground(new java.awt.Color(228, 228, 223));
        transaksi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        transaksi.setForeground(new java.awt.Color(0, 66, 37));
        transaksi.setText("Transaksi");
        transaksi.setBorder(null);
        transaksi.setBorderPainted(false);
        transaksi.setContentAreaFilled(false);
        transaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 590, -1, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        new loginpage().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void inventoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoriActionPerformed
        // TODO add your handling code here:
        dispose();
        new inventoripage().setVisible(true);
    }//GEN-LAST:event_inventoriActionPerformed

    private void berandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berandaActionPerformed
        // TODO add your handling code here:
        dispose();
        new homepage().setVisible(true);
    }//GEN-LAST:event_berandaActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
        dispose();
        new transaksipage().setVisible(true);
    }//GEN-LAST:event_transaksiActionPerformed

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
            java.util.logging.Logger.getLogger(inventoripage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventoripage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventoripage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventoripage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventoripage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beranda;
    private javax.swing.JButton inventori;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel relasijy;
    private javax.swing.JLabel relasijy1;
    private javax.swing.JLabel relasijy2;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
