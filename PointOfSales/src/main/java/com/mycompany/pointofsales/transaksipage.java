/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pointofsales;

import java.awt.Color;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class transaksipage extends javax.swing.JFrame {

    /**
     * Creates new form transaksipage
     */
    DefaultTableModel model;
    public transaksipage() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xFFFFFF"));
        relasijy.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/relasijy3.png")));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/search1.png")));
        //iconadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/add2.png")));
        //refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/refresh2.png")));
        hasil.setDefaultCloseOperation(hasil.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(transaksipage.DISPOSE_ON_CLOSE);
        totalHarga.setHorizontalAlignment(JLabel.CENTER);
        kembalian.setHorizontalAlignment(JLabel.CENTER);
        
        inputNB.setHorizontalAlignment(JTextField.CENTER);
        inputJumlah.setHorizontalAlignment(JTextField.CENTER);
        inputIDM.setHorizontalAlignment(JTextField.CENTER);
        inputBayar.setHorizontalAlignment(JTextField.CENTER);
        
        model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Nama Barang", "Harga Satuan", "Jumlah", "Harga Jumlah"}
        );
        tabelTransaksi.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hasil = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        relasijy1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelTransaksi2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        totalHarga = new javax.swing.JLabel();
        noTransaksi = new javax.swing.JLabel();
        diskonLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        kembalian = new javax.swing.JLabel();
        transaksiBaru = new javax.swing.JButton();
        beranda = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        member = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        beranda1 = new javax.swing.JButton();
        selesai = new javax.swing.JButton();
        inputBayar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buttonTambah = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelNonMember = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        totalHargaNonMb = new javax.swing.JLabel();
        panelMember = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        diskonMb = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputIDM = new javax.swing.JTextField();
        buttonCek = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        totalHargaMb = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        inputNB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputJumlah = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        buttonHitung = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        buttonHapus = new javax.swing.JButton();
        buttonGanti = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        relasijy = new javax.swing.JLabel();
        bgSearch = new javax.swing.JPanel();
        search = new javax.swing.JLabel();
        inputSearch = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();

        hasil.setMinimumSize(new java.awt.Dimension(403, 605));
        hasil.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 66, 37)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(relasijy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setText("Nomor   :");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 50, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("KEMBALIAN");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, 30));

        tabelTransaksi2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Barang", "Harga Satuan", "Jumlah", "Harga"
            }
        ));
        tabelTransaksi2.setSelectionBackground(new java.awt.Color(245, 245, 220));
        jScrollPane2.setViewportView(tabelTransaksi2);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, 330));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setText("                           TOTAL");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 235)));
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 260, 30));

        totalHarga.setBackground(new java.awt.Color(255, 176, 0));
        totalHarga.setText("HARGA");
        totalHarga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 235)));
        totalHarga.setOpaque(true);
        jPanel7.add(totalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 110, 30));

        noTransaksi.setText("id_transaksi");
        jPanel7.add(noTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 90, 30));

        diskonLabel.setForeground(new java.awt.Color(204, 0, 0));
        diskonLabel.setText("Diskon");
        jPanel7.add(diskonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 470, 70, -1));

        jLabel18.setForeground(new java.awt.Color(204, 0, 0));
        jLabel18.setText("Diskon  :");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        kembalian.setBackground(new java.awt.Color(245, 245, 220));
        kembalian.setText("kembalian");
        kembalian.setOpaque(true);
        jPanel7.add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 526, 120, 20));

        transaksiBaru.setBackground(new java.awt.Color(0, 66, 37));
        transaksiBaru.setForeground(new java.awt.Color(255, 255, 255));
        transaksiBaru.setText("Transaksi Baru");
        transaksiBaru.setBorderPainted(false);
        transaksiBaru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transaksiBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiBaruActionPerformed(evt);
            }
        });
        jPanel7.add(transaksiBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 140, -1));

        beranda.setBackground(new java.awt.Color(0, 66, 37));
        beranda.setForeground(new java.awt.Color(255, 255, 255));
        beranda.setText("Beranda");
        beranda.setBorderPainted(false);
        beranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        beranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berandaActionPerformed(evt);
            }
        });
        jPanel7.add(beranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 140, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 100, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 130, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 100, 10));

        jLabel20.setText("Tanggal :");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 16, 60, 20));

        tanggal.setText("dd/mm/yy");
        jPanel7.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 14, 90, -1));

        jLabel19.setText("Status   :");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        member.setText("Member");
        jPanel7.add(member, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 450, 70, -1));

        hasil.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 570));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1274, 702));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        judul.setForeground(new java.awt.Color(0, 66, 37));
        judul.setText("CATATAN TRANSAKSI");
        jPanel1.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        beranda1.setBackground(new java.awt.Color(255, 176, 0));
        beranda1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        beranda1.setText("BERANDA");
        beranda1.setBorder(null);
        beranda1.setBorderPainted(false);
        beranda1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        beranda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beranda1ActionPerformed(evt);
            }
        });
        jPanel1.add(beranda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 160, 40));

        selesai.setBackground(new java.awt.Color(255, 176, 0));
        selesai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selesai.setText("SELESAI");
        selesai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesaiActionPerformed(evt);
            }
        });
        jPanel1.add(selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 160, 40));

        inputBayar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputBayar.setText("Bayar");
        inputBayar.setToolTipText("");
        inputBayar.setBorder(null);
        inputBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBayarActionPerformed(evt);
            }
        });
        jPanel1.add(inputBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 460, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Bayar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, 30));

        buttonTambah.setBackground(new java.awt.Color(228, 228, 223));
        buttonTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonTambah.setForeground(new java.awt.Color(255, 255, 255));
        buttonTambah.setText("TAMBAH");
        buttonTambah.setBorder(null);
        buttonTambah.setBorderPainted(false);
        buttonTambah.setContentAreaFilled(false);
        buttonTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 110, 30));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        panelNonMember.setBackground(new java.awt.Color(255, 255, 255));
        panelNonMember.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 66, 37), 1, true));
        panelNonMember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 176, 0));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 66, 37));
        jLabel7.setText("Total :");
        panelNonMember.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, 40));

        totalHargaNonMb.setBackground(new java.awt.Color(255, 176, 0));
        totalHargaNonMb.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        totalHargaNonMb.setForeground(new java.awt.Color(0, 66, 37));
        totalHargaNonMb.setText("(klik hitung)");
        panelNonMember.add(totalHargaNonMb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 210, 40));

        jTabbedPane1.addTab("Non Member", panelNonMember);

        panelMember.setBackground(new java.awt.Color(255, 255, 255));
        panelMember.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 66, 37), 1, true));
        panelMember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 176, 0));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 66, 37));
        jLabel9.setText("Total :");
        panelMember.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        diskonMb.setBackground(new java.awt.Color(255, 176, 0));
        diskonMb.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N
        diskonMb.setText("khusus");
        panelMember.add(diskonMb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 50, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Masukkan ID Member");
        panelMember.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        inputIDM.setBackground(new java.awt.Color(246, 246, 246));
        inputIDM.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        inputIDM.setText("ID Member");
        inputIDM.setToolTipText("");
        inputIDM.setBorder(null);
        inputIDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDMActionPerformed(evt);
            }
        });
        panelMember.add(inputIDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 210, 30));

        buttonCek.setBackground(new java.awt.Color(245, 245, 220));
        buttonCek.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        buttonCek.setText("CEK");
        buttonCek.setBorder(null);
        buttonCek.setBorderPainted(false);
        buttonCek.setContentAreaFilled(false);
        buttonCek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCekActionPerformed(evt);
            }
        });
        panelMember.add(buttonCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 80, 20));
        panelMember.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 430, 10));

        totalHargaMb.setBackground(new java.awt.Color(255, 176, 0));
        totalHargaMb.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        totalHargaMb.setForeground(new java.awt.Color(0, 66, 37));
        totalHargaMb.setText("(klik cek)");
        panelMember.add(totalHargaMb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 210, -1));

        jLabel13.setBackground(new java.awt.Color(255, 176, 0));
        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N
        jLabel13.setText("*Diskon : ");
        panelMember.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 40, 20));

        jPanel8.setBackground(new java.awt.Color(245, 245, 220));
        panelMember.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 80, 20));

        jTabbedPane1.addTab("Member", panelMember);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 470, 170));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Nama Barang");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 30));

        inputNB.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputNB.setText("Nama Barang");
        inputNB.setToolTipText("");
        inputNB.setBorder(null);
        inputNB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNBActionPerformed(evt);
            }
        });
        jPanel1.add(inputNB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 460, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Jumlah");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 30));

        inputJumlah.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputJumlah.setText("Jumlah");
        inputJumlah.setToolTipText("");
        inputJumlah.setBorder(null);
        inputJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJumlahActionPerformed(evt);
            }
        });
        jPanel1.add(inputJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 460, 30));

        jPanel5.setBackground(new java.awt.Color(0, 66, 37));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 110, 30));

        buttonHitung.setBackground(new java.awt.Color(228, 228, 223));
        buttonHitung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonHitung.setText("HITUNG");
        buttonHitung.setBorder(null);
        buttonHitung.setBorderPainted(false);
        buttonHitung.setContentAreaFilled(false);
        buttonHitung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHitungActionPerformed(evt);
            }
        });
        jPanel1.add(buttonHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 110, 30));

        jPanel9.setBackground(new java.awt.Color(228, 228, 223));
        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 110, 30));

        buttonHapus.setBackground(new java.awt.Color(228, 228, 223));
        buttonHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonHapus.setForeground(new java.awt.Color(255, 255, 255));
        buttonHapus.setText("HAPUS");
        buttonHapus.setBorder(null);
        buttonHapus.setBorderPainted(false);
        buttonHapus.setContentAreaFilled(false);
        buttonHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });
        jPanel1.add(buttonHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 110, 30));

        buttonGanti.setBackground(new java.awt.Color(228, 228, 223));
        buttonGanti.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonGanti.setForeground(new java.awt.Color(255, 255, 255));
        buttonGanti.setText("GANTI");
        buttonGanti.setBorder(null);
        buttonGanti.setBorderPainted(false);
        buttonGanti.setContentAreaFilled(false);
        buttonGanti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGantiActionPerformed(evt);
            }
        });
        jPanel1.add(buttonGanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 110, 30));

        jPanel10.setBackground(new java.awt.Color(0, 66, 37));
        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 110, 30));

        jPanel11.setBackground(new java.awt.Color(0, 66, 37));
        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 590, 690));

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Barang", "Harga", "Jumlah"
            }
        ));
        jScrollPane1.setViewportView(tabelTransaksi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 670, 600));
        getContentPane().add(relasijy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        bgSearch.setBackground(new java.awt.Color(246, 246, 246));
        bgSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
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

        getContentPane().add(bgSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 250, 20));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 66, 37)));
        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public double ambilHarga(String namaBarang) {
        double hargaBarang = 0;
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();

            String ambilHarga = "SELECT harga FROM inventori WHERE nama_barang = ?";
            PreparedStatement statement = koneksi.prepareStatement(ambilHarga);
            statement.setString(1, namaBarang);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                hargaBarang = result.getDouble("harga");
            }

            result.close();
            statement.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
        
        return hargaBarang;
    }
    
    public boolean cekId(String idMember) {
        boolean value = false;
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            
            String checkQuery = "SELECT * FROM member WHERE id_member = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setString(1, idMember);
            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
            } else {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return value;
    }
    
    public double hitungTotal() {
        int rowCount = model.getRowCount();
        double total = 0;

            for (int i = 0; i < rowCount; i++) {
                double hargaJumlah = (double) model.getValueAt(i, 3);

                total += hargaJumlah;
            }
        return total;
    }
    private void inputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSearchActionPerformed

    private void beranda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beranda1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new homepage().setVisible(true);
    }//GEN-LAST:event_beranda1ActionPerformed

    private void selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesaiActionPerformed
        // TODO add your handling code here:
        //ini ngurus tgl
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        tanggal.setText(formattedDateTime);
        
        //ini baru ngurus struknya
        int tabAktifIndex = jTabbedPane1.getSelectedIndex();
        int bayar = Integer.parseInt(inputBayar.getText());
        double bayarDouble = (double) bayar;
        double kembalian = 0;
        if (tabAktifIndex == 0) {
            //berarti non
            double total = this.hitungTotal();
            kembalian = bayar - total;
            jLabel11.setText(String.valueOf(kembalian));
            diskonLabel.setText("0");
            totalHarga.setText(String.valueOf(total));
            member.setText("Non-Member");
            String kategori = "Non-Member";
        } else if (tabAktifIndex == 1) {
            //berarti member
            double total = this.hitungTotal();
            double diskon = 0.1;
            double jumlahDiskon = diskon * total;
            double totalMember = total - jumlahDiskon;
            kembalian = bayar - totalMember;
            jLabel11.setText(String.valueOf(kembalian));
            totalHarga.setText(String.valueOf(totalMember));
            diskon = diskon * 100;
            int diskonDisplay = (int) diskon;
            diskonLabel.setText( diskonDisplay + "%");
            member.setText("Member");
            String kategori = "Member";
        }
        
        DefaultTableModel sourceModel = (DefaultTableModel) tabelTransaksi.getModel();
        int rowCount = sourceModel.getRowCount();
        
        for (int i = 0; i < rowCount; i++) {
            Object[] rowData = new Object[sourceModel.getColumnCount()];
            for (int j = 0; j < sourceModel.getColumnCount(); j++) {
                rowData[j] = sourceModel.getValueAt(i, j);
            }
            DefaultTableModel destinationModel = (DefaultTableModel) tabelTransaksi2.getModel();
            destinationModel.setRowCount(0);
            destinationModel.addRow(rowData);
        }
        
        dispose();
        hasil.setSize(403, 605);
        hasil.getContentPane().setBackground(Color.decode("0xFFFFFF"));
        hasil.setVisible(true);
    }//GEN-LAST:event_selesaiActionPerformed

    private void inputBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBayarActionPerformed

    private void inputIDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDMActionPerformed

    private void inputNBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNBActionPerformed

    private void inputJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJumlahActionPerformed

    private void buttonCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCekActionPerformed
        // TODO add your handling code here:
        String idMember = inputIDM.getText();
        if (cekId(idMember)) {
            double diskon = 0.1;
            double total = this.hitungTotal();
            double jumlahDiskon = diskon * total;
            double totalMember = total - jumlahDiskon;
            diskon = diskon * 100;
            int diskonDisplay = (int) diskon;
                    
            totalHargaMb.setText(String.valueOf(totalMember));
            diskonMb.setText( diskonDisplay + "%");
        } else {
            //id tidak ditemukan terus apa
        }
    }//GEN-LAST:event_buttonCekActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        // TODO add your handling code here:
        GeneratorId generate = new GeneratorId();
        String kolom = "id_transaksi";
        String query = "SELECT id_transaksi FROM transaksi ORDER BY id_transaksi DESC LIMIT 1";
        String idTrans = generate.idGenerator(kolom, query);
        noTransaksi.setText(idTrans);
        String namaBarang = inputNB.getText();
        int jumlah = Integer.parseInt(inputJumlah.getText());
        double hargaBarang = this.ambilHarga(namaBarang);
        double total = jumlah * hargaBarang;
        
        model.addRow(new Object[]{namaBarang, hargaBarang, jumlah, total});
         
        inputJumlah.setText("");
        inputNB.setText("");
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        inputJumlah.setText("");
        inputNB.setText("");
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonGantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGantiActionPerformed
        // TODO add your handling code here:
         inputJumlah.setText("");
         inputNB.setText("");
    }//GEN-LAST:event_buttonGantiActionPerformed

    private void berandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berandaActionPerformed
        // TODO add your handling code here:
        hasil.dispose();
        new homepage().setVisible(true);
    }//GEN-LAST:event_berandaActionPerformed

    private void transaksiBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiBaruActionPerformed
        // TODO add your handling code here:
        hasil.dispose();
        new transaksipage().setVisible(true);
    }//GEN-LAST:event_transaksiBaruActionPerformed

    private void buttonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHitungActionPerformed
        // TODO add your handling code here:
        String namaBarang = inputNB.getText();
        if (!namaBarang.equals("")) {
            int jumlah = Integer.parseInt(inputJumlah.getText());
            double hargaBarang = this.ambilHarga(namaBarang);
            double total = jumlah * hargaBarang;

            model.addRow(new Object[]{namaBarang, hargaBarang, jumlah, total});
        } else {
        }
        double total = this.hitungTotal();
        totalHargaNonMb.setText(String.valueOf(total));
        inputJumlah.setText("");
        inputNB.setText("");
    }//GEN-LAST:event_buttonHitungActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void transaksi(String args[]) {
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
            java.util.logging.Logger.getLogger(transaksipage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksipage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksipage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksipage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        /* GATAU AH NANTI WAE INI IH
        JSeparator s = new JSeparator(); 
        // create a frame 
        JFrame f = new JFrame("separator"); 
        // create a panel 
        JPanel p =new JPanel(); 
        // set layout as vertical 
        s.setOrientation(SwingConstants.VERTICAL); 
        // set layout 
        p.setLayout(new GridLayout(1,0)); 
        f.add(p);*/
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksipage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beranda;
    private javax.swing.JButton beranda1;
    private javax.swing.JPanel bgSearch;
    private javax.swing.JButton buttonCek;
    private javax.swing.JButton buttonGanti;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonHitung;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JLabel diskonLabel;
    private javax.swing.JLabel diskonMb;
    private javax.swing.JDialog hasil;
    private javax.swing.JTextField inputBayar;
    private javax.swing.JTextField inputIDM;
    private javax.swing.JTextField inputJumlah;
    private javax.swing.JTextField inputNB;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel kembalian;
    private javax.swing.JLabel member;
    private javax.swing.JLabel noTransaksi;
    private javax.swing.JPanel panelMember;
    private javax.swing.JPanel panelNonMember;
    private javax.swing.JLabel relasijy;
    private javax.swing.JLabel relasijy1;
    private javax.swing.JLabel search;
    private javax.swing.JButton selesai;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JTable tabelTransaksi2;
    private javax.swing.JLabel tanggal;
    private javax.swing.JLabel totalHarga;
    private javax.swing.JLabel totalHargaMb;
    private javax.swing.JLabel totalHargaNonMb;
    private javax.swing.JButton transaksiBaru;
    // End of variables declaration//GEN-END:variables
}
