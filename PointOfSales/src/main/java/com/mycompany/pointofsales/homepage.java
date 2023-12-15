/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pointofsales;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class homepage extends javax.swing.JFrame {

    /**
     * Creates new form homepage
     */
    public homepage() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xFFFFFF"));
        relasijy.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/relasijy3.png")));
        ilus5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/ilus5.png")));
        iconBeranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/beranda.png")));
        iconInventori.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/inventori.png")));
        iconMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/member.png")));
        iconRiwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/riwayat.png")));
        iconTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/transaksi.png")));
        iconKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/kasir.png")));
        
        /*Graphics2D g2d = (Graphics2D) qm.getGraphics();
        g2d.rotate(Math.toRadians(90), qm.getWidth() / 2, qm.getHeight() / 2);
        qm.paint(g2d);*/
        
        tampilTanggal();
        
        loginpage kasir = new loginpage();
        System.out.println(kasir.username);
        namaKasir.setText("RUTH");
        
        quickMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"ID Barang", "Nama Barang", "Harga", "Stok", "Created at", "Updated at"}
        ));
        CRUDBarang CrudB = new CRUDBarang();
        DefaultTableModel model = CrudB.read();
        quickMenu.setModel(model);
        setDefaultCloseOperation(homepage.DISPOSE_ON_CLOSE);
    }

    public void tampilTanggal() {
        LocalDate today = LocalDate.now();
        DateFormatSymbols dfs = new DateFormatSymbols();
        String namaBulan = dfs.getMonths()[today.getMonthValue() - 1];
        String formattedDate = String.format("%02d %s %04d", today.getDayOfMonth(), namaBulan, today.getYear());
        tanggal.setText(formattedDate);
        
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String namaHari = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
        hari.setText(namaHari);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        relasijy = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        riwayat = new javax.swing.JButton();
        inventori = new javax.swing.JButton();
        member = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        hari = new javax.swing.JLabel();
        ilus5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        namaKasir = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        quickMenu = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        iconBeranda = new javax.swing.JLabel();
        iconInventori = new javax.swing.JLabel();
        iconMember = new javax.swing.JLabel();
        iconRiwayat = new javax.swing.JLabel();
        iconTransaksi = new javax.swing.JLabel();
        iconKasir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1274, 698));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(relasijy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 66, 37));
        jLabel7.setText("Beranda");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

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
                .addGap(72, 72, 72)
                .addComponent(logout)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 210, 30));

        transaksi.setBackground(new java.awt.Color(228, 228, 223));
        transaksi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
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
        getContentPane().add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        riwayat.setBackground(new java.awt.Color(228, 228, 223));
        riwayat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        riwayat.setForeground(new java.awt.Color(0, 66, 37));
        riwayat.setText("Riwayat");
        riwayat.setBorder(null);
        riwayat.setBorderPainted(false);
        riwayat.setContentAreaFilled(false);
        riwayat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayatActionPerformed(evt);
            }
        });
        getContentPane().add(riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        inventori.setBackground(new java.awt.Color(228, 228, 223));
        inventori.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
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
        getContentPane().add(inventori, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        member.setBackground(new java.awt.Color(228, 228, 223));
        member.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
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
        getContentPane().add(member, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 66, 37));
        jLabel11.setText("Kasir ");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, -1, -1));

        hari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hari.setForeground(new java.awt.Color(0, 66, 37));
        hari.setText("Kamis");
        hari.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(hari, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));
        getContentPane().add(ilus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 410, 340));

        jPanel1.setBackground(new java.awt.Color(245, 245, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 66, 37));
        jLabel9.setText("Selamat dan terimakasih telah datang kembali!");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        namaKasir.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        namaKasir.setForeground(new java.awt.Color(255, 176, 0));
        namaKasir.setText("REFA");
        namaKasir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(namaKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 70));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 66, 37));
        jLabel10.setText("Welcome ");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 960, 240));

        tanggal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tanggal.setForeground(new java.awt.Color(0, 66, 37));
        tanggal.setText("7 Desember 2023");
        tanggal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        quickMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Harga", "Stok", "Created at", "Updated at"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        quickMenu.setGridColor(new java.awt.Color(0, 66, 37));
        quickMenu.setSelectionBackground(new java.awt.Color(0, 66, 37));
        quickMenu.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(quickMenu);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 960, 250));

        jPanel2.setBackground(new java.awt.Color(255, 176, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUICK MENU OF INVENTORY DATA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 960, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 66, 37));
        jLabel15.setText("Beranda");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));
        getContentPane().add(iconBeranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        getContentPane().add(iconInventori, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        getContentPane().add(iconMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        getContentPane().add(iconRiwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        getContentPane().add(iconTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));
        getContentPane().add(iconKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 50, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatActionPerformed
        // TODO add your handling code here:
        dispose();
        new riwayatpage().setVisible(true);
    }//GEN-LAST:event_riwayatActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        new loginpage().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

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
            Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_transaksiActionPerformed

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

    /**
     * @param args the command line arguments
     */
    public static void home(String args[]) {
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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hari;
    private javax.swing.JLabel iconBeranda;
    private javax.swing.JLabel iconInventori;
    private javax.swing.JLabel iconKasir;
    private javax.swing.JLabel iconMember;
    private javax.swing.JLabel iconRiwayat;
    private javax.swing.JLabel iconTransaksi;
    private javax.swing.JLabel ilus5;
    private javax.swing.JButton inventori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton member;
    private javax.swing.JLabel namaKasir;
    private javax.swing.JTable quickMenu;
    private javax.swing.JLabel relasijy;
    private javax.swing.JButton riwayat;
    private javax.swing.JLabel tanggal;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
