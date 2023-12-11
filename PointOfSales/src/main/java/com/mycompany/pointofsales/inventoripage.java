/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pointofsales;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
        
        inputNB.setHorizontalAlignment(JTextField.CENTER);
        inputHarga.setHorizontalAlignment(JTextField.CENTER);
        inputStok.setHorizontalAlignment(JTextField.CENTER);
        inputIDB.setHorizontalAlignment(JTextField.CENTER);
        
        tabelInventori.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"ID Barang", "Nama Barang", "Harga", "Stok", "Created at", "Updated at"}
        ));
        CRUDBarang CrudB = new CRUDBarang();
        DefaultTableModel model = CrudB.read();
        tabelInventori.setModel(model);
        setDefaultCloseOperation(homepage.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inventori = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        transaksi = new javax.swing.JButton();
        riwayat = new javax.swing.JButton();
        beranda = new javax.swing.JButton();
        member = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        relasijy = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        inputStok = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputIDB = new javax.swing.JTextField();
        inputNB = new javax.swing.JTextField();
        inputHarga = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelInventori = new javax.swing.JTable();
        bgSearch = new javax.swing.JPanel();
        search = new javax.swing.JLabel();
        inputSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 220));
        setMaximumSize(new java.awt.Dimension(1274, 698));
        setMinimumSize(new java.awt.Dimension(1274, 698));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inventori.setBackground(new java.awt.Color(245, 245, 220));
        inventori.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inventori.setForeground(new java.awt.Color(255, 255, 255));
        inventori.setText("Inventori");
        inventori.setBorder(null);
        inventori.setBorderPainted(false);
        inventori.setContentAreaFilled(false);
        inventori.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inventori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoriActionPerformed(evt);
            }
        });
        getContentPane().add(inventori, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, 40));

        jPanel1.setBackground(new java.awt.Color(255, 176, 0));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 130, 40));

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
        getContentPane().add(riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 8, -1, 40));

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
        getContentPane().add(beranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 8, -1, 40));

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
        getContentPane().add(member, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 8, -1, 40));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 66, 37)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        relasijy.setIcon(new javax.swing.ImageIcon("D:\\Netbeans\\Point-Of-Sales\\PointOfSales\\src\\main\\java\\resources\\relasijy2.png")); // NOI18N
        jPanel11.add(relasijy, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        judul.setBackground(new java.awt.Color(255, 255, 255));
        judul.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 40)); // NOI18N
        judul.setForeground(new java.awt.Color(0, 66, 37));
        judul.setText("DATA INVENTORI");
        jPanel11.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        inputStok.setBackground(new java.awt.Color(245, 245, 220));
        inputStok.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputStok.setToolTipText("");
        inputStok.setBorder(null);
        jPanel11.add(inputStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 310, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 66, 37));
        jLabel2.setText("Stok");
        jPanel11.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 66, 37));
        jLabel3.setText("ID Barang");
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 66, 37));
        jLabel4.setText("Nama Barang");
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 66, 37));
        jLabel5.setText("Harga");
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        inputIDB.setBackground(new java.awt.Color(245, 245, 220));
        inputIDB.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputIDB.setToolTipText("");
        inputIDB.setBorder(null);
        jPanel11.add(inputIDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 310, 30));

        inputNB.setBackground(new java.awt.Color(245, 245, 220));
        inputNB.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputNB.setToolTipText("");
        inputNB.setBorder(null);
        jPanel11.add(inputNB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 310, 30));

        inputHarga.setBackground(new java.awt.Color(245, 245, 220));
        inputHarga.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputHarga.setToolTipText("");
        inputHarga.setBorder(null);
        jPanel11.add(inputHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 310, 30));

        jPanel6.setBackground(new java.awt.Color(0, 66, 37));

        add.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.setBorder(null);
        add.setBorderPainted(false);
        add.setContentAreaFilled(false);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        update.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.setBorder(null);
        update.setBorderPainted(false);
        update.setContentAreaFilled(false);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel11.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 138, -1));

        jPanel7.setBackground(new java.awt.Color(0, 66, 37));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        delete.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.setBorder(null);
        delete.setBorderPainted(false);
        delete.setContentAreaFilled(false);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel11.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 138, -1));

        jPanel8.setBackground(new java.awt.Color(0, 66, 37));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, -1, -1));

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 660));

        tabelInventori.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelInventori.setGridColor(new java.awt.Color(0, 66, 37));
        tabelInventori.setSelectionBackground(new java.awt.Color(245, 245, 220));
        jScrollPane1.setViewportView(tabelInventori);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 860, 590));

        bgSearch.setBackground(new java.awt.Color(246, 246, 246));
        bgSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setIcon(new javax.swing.ImageIcon("D:\\Netbeans\\Point-Of-Sales\\PointOfSales\\src\\main\\java\\resources\\search1.png")); // NOI18N
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bgSearch.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        inputSearch.setBackground(new java.awt.Color(246, 246, 246));
        inputSearch.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        inputSearch.setText("Search");
        inputSearch.setBorder(null);
        inputSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSearchActionPerformed(evt);
            }
        });
        bgSearch.add(inputSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 20));

        getContentPane().add(bgSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 250, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inventoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoriActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
        dispose();
        new transaksipage().setVisible(true);
    }//GEN-LAST:event_transaksiActionPerformed

    private void riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatActionPerformed
        // TODO add your handling code here:
        dispose();
        new riwayatpage().setVisible(true);
    }//GEN-LAST:event_riwayatActionPerformed

    private void berandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berandaActionPerformed
        // TODO add your handling code here:
        dispose();
        new homepage().setVisible(true);
    }//GEN-LAST:event_berandaActionPerformed

    private void memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberActionPerformed
        // TODO add your handling code here:
        dispose();
        new memberpage().setVisible(true);
    }//GEN-LAST:event_memberActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void inputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void inventori(String args[]) {
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
    private javax.swing.JButton add;
    private javax.swing.JButton beranda;
    private javax.swing.JPanel bgSearch;
    private javax.swing.JButton delete;
    private javax.swing.JTextField inputHarga;
    private javax.swing.JTextField inputIDB;
    private javax.swing.JTextField inputNB;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JTextField inputStok;
    private javax.swing.JButton inventori;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JButton member;
    private javax.swing.JLabel relasijy;
    private javax.swing.JButton riwayat;
    private javax.swing.JLabel search;
    private javax.swing.JTable tabelInventori;
    private javax.swing.JButton transaksi;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
