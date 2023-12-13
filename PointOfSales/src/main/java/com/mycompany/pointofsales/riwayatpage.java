/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pointofsales;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class riwayatpage extends javax.swing.JFrame {

    /**
     * Creates new form riwayatpage
     */
    public riwayatpage() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xFFFFFF"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRiwayat = new javax.swing.JTable();
        relasijy = new javax.swing.JLabel();
        transaksi = new javax.swing.JButton();
        riwayat = new javax.swing.JButton();
        inventori = new javax.swing.JButton();
        member = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        beranda = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1274, 698));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelRiwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Riwayat", "ID Barang", "ID Transaksi", "Nama Barang", "Jumlah", "Harga Satuan", "Diskon", "Total Harga", "Detail Belanjaan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelRiwayat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1240, 260));
        getContentPane().add(relasijy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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
        getContentPane().add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 8, -1, 40));

        riwayat.setBackground(new java.awt.Color(228, 228, 223));
        riwayat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        riwayat.setForeground(new java.awt.Color(255, 255, 255));
        riwayat.setText("Riwayat");
        riwayat.setBorder(null);
        riwayat.setBorderPainted(false);
        riwayat.setContentAreaFilled(false);
        riwayat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayatActionPerformed(evt);
            }
        });
        getContentPane().add(riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1054, 8, 90, 40));

        inventori.setBackground(new java.awt.Color(228, 228, 223));
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
        getContentPane().add(inventori, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 8, 90, 40));

        member.setBackground(new java.awt.Color(228, 228, 223));
        member.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        member.setForeground(new java.awt.Color(0, 66, 37));
        member.setText("Member");
        member.setBorder(null);
        member.setBorderPainted(false);
        member.setContentAreaFilled(false);
        member.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberActionPerformed(evt);
            }
        });
        getContentPane().add(member, new org.netbeans.lib.awtextra.AbsoluteConstraints(954, 8, 90, 40));

        jPanel1.setBackground(new java.awt.Color(255, 176, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 100, 40));

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
        getContentPane().add(beranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 8, 90, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "Barang", "Jumlah", "Harga Satuan", "Diskon", "Harga", "ID Detail"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 1240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
        GeneratorId generate = new GeneratorId();
        String kolom = "id_transaksi";
        String query = "SELECT id_transaksi FROM transaksi ORDER BY id_transaksi DESC LIMIT 1";
        String idTrans = generate.idGenerator(kolom, query);
        Transaksi catat = new Transaksi();
        catat.catatId(idTrans);
        
        dispose();
        try {
            new transaksipage().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(riwayatpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_transaksiActionPerformed

    private void riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_riwayatActionPerformed

    private void inventoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoriActionPerformed
        // TODO add your handling code here:
        dispose();
        new inventoripage().setVisible(true);
    }//GEN-LAST:event_inventoriActionPerformed

    private void memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberActionPerformed
        // TODO add your handling code here:
        dispose();
        new memberpage().setVisible(true);
    }//GEN-LAST:event_memberActionPerformed

    private void berandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berandaActionPerformed
        // TODO add your handling code here:
        dispose();
        new homepage().setVisible(true);
    }//GEN-LAST:event_berandaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void riwayat(String args[]) {
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
            java.util.logging.Logger.getLogger(riwayatpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(riwayatpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(riwayatpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(riwayatpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new riwayatpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beranda;
    private javax.swing.JButton inventori;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton member;
    private javax.swing.JLabel relasijy;
    private javax.swing.JButton riwayat;
    private javax.swing.JTable tabelRiwayat;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
