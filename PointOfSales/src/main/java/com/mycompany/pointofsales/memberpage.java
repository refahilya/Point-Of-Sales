/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pointofsales;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class memberpage extends javax.swing.JFrame {

    /**
     * Creates new form memberpage
     */
    public memberpage() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xE4E4DF"));
        
        relasijy.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/relasijy2.png")));
        
        inputIDM.setHorizontalAlignment(JTextField.CENTER);
        inputNM.setHorizontalAlignment(JTextField.CENTER);
        inputTL.setHorizontalAlignment(JTextField.CENTER);
        inputNoTelp.setHorizontalAlignment(JTextField.CENTER);
        inputEmail.setHorizontalAlignment(JTextField.CENTER);
        inputPoin.setHorizontalAlignment(JTextField.CENTER);
        
        readToTable();
        
        setDefaultCloseOperation(homepage.DISPOSE_ON_CLOSE);

    }

    public void readToTable() {
        tabelMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"ID Member", "Nama Member", "Tanggal Lahir", "No Telepon", "Email", "Poin", "Created at", "Updated at"}
        ));
        CRUDMember CrudM = new CRUDMember();
        DefaultTableModel model = CrudM.read();
        tabelMember.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transaksi = new javax.swing.JButton();
        riwayat = new javax.swing.JButton();
        inventori = new javax.swing.JButton();
        member = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        relasijy = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        inputPoin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputIDM = new javax.swing.JTextField();
        inputNM = new javax.swing.JTextField();
        inputTL = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        inputNoTelp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMember = new javax.swing.JTable();
        beranda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1274, 689));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(inventori, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 8, 90, 40));

        member.setBackground(new java.awt.Color(228, 228, 223));
        member.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        member.setForeground(new java.awt.Color(255, 255, 255));
        member.setText("Member");
        member.setBorder(null);
        member.setBorderPainted(false);
        member.setContentAreaFilled(false);
        member.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 120, 40));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 66, 37)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(relasijy, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        judul.setBackground(new java.awt.Color(255, 255, 255));
        judul.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 40)); // NOI18N
        judul.setForeground(new java.awt.Color(0, 66, 37));
        judul.setText("DATA MEMBER");
        jPanel11.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        inputPoin.setBackground(new java.awt.Color(245, 245, 220));
        inputPoin.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputPoin.setToolTipText("");
        inputPoin.setBorder(null);
        jPanel11.add(inputPoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 310, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 66, 37));
        jLabel2.setText("Poin");
        jPanel11.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 66, 37));
        jLabel3.setText("ID Member");
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 66, 37));
        jLabel4.setText("Nama Member");
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 66, 37));
        jLabel5.setText("Tanggal Lahir");
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        inputIDM.setBackground(new java.awt.Color(245, 245, 220));
        inputIDM.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputIDM.setToolTipText("");
        inputIDM.setBorder(null);
        jPanel11.add(inputIDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 310, 30));

        inputNM.setBackground(new java.awt.Color(245, 245, 220));
        inputNM.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputNM.setToolTipText("");
        inputNM.setBorder(null);
        jPanel11.add(inputNM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 310, 30));

        inputTL.setBackground(new java.awt.Color(245, 245, 220));
        inputTL.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputTL.setToolTipText("");
        inputTL.setBorder(null);
        jPanel11.add(inputTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 310, 30));

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
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, 30));

        jPanel7.setBackground(new java.awt.Color(0, 66, 37));

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, -1, 30));

        jPanel8.setBackground(new java.awt.Color(0, 66, 37));

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 66, 37));
        jLabel6.setText("No Telepon");
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        inputNoTelp.setBackground(new java.awt.Color(245, 245, 220));
        inputNoTelp.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputNoTelp.setToolTipText("");
        inputNoTelp.setBorder(null);
        jPanel11.add(inputNoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 310, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 66, 37));
        jLabel7.setText("Email");
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        inputEmail.setBackground(new java.awt.Color(245, 245, 220));
        inputEmail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputEmail.setToolTipText("");
        inputEmail.setBorder(null);
        jPanel11.add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 310, 30));

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 660));

        tabelMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Member", "Nama Member", "Tanggal Lahir", "No Telepon", "Email", "Poin", "Created at", "Updated at"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelMember.setGridColor(new java.awt.Color(0, 66, 37));
        tabelMember.setSelectionBackground(new java.awt.Color(0, 66, 37));
        tabelMember.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabelMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMember);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 860, 590));

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
        getContentPane().add(beranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 8, 80, 40));

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
            Logger.getLogger(memberpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_transaksiActionPerformed

    private void riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatActionPerformed
        // TODO add your handling code here:
        dispose();
        new riwayatpage().setVisible(true);
    }//GEN-LAST:event_riwayatActionPerformed

    private void inventoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoriActionPerformed
        // TODO add your handling code here:
        dispose();
        new inventoripage().setVisible(true);
    }//GEN-LAST:event_inventoriActionPerformed

    private void memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if (inputIDM.getText().isEmpty() || inputNM.getText().isEmpty() || inputTL.getText().isEmpty() || inputNoTelp.getText().isEmpty() || inputEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data Masih Kosong!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String id_member = String.valueOf(inputIDM.getText());
                String nama = String.valueOf(inputNM.getText());
                String tl = String.valueOf(inputTL.getText());
                String notelp = String.valueOf(inputNoTelp.getText());
                String email = String.valueOf(inputEmail.getText());
                
                CRUDMember CrudM = new CRUDMember();
                CrudM.create(id_member, nama, tl, notelp, email);
                
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                
                inputIDM.setText("");
                inputNM.setText("");
                inputTL.setText("");
                inputNoTelp.setText("");
                inputEmail.setText("");
                inputPoin.setText("");
                
            } catch (NumberFormatException Ex) {
                JOptionPane.showMessageDialog(this, "Gagal membuat data", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        readToTable();
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel sourceModel = (DefaultTableModel) tabelMember.getModel();
        int selectedRowIndex = tabelMember.getSelectedRow();

        if (selectedRowIndex != -1) {
            String id = inputIDM.getText();
            String namaBaru = inputNM.getText();
            String TLBaru = inputTL.getText();
            String noTelpBaru = inputNoTelp.getText();
            String emailBaru = inputEmail.getText();
            String poinBaru = inputPoin.getText();
            
            sourceModel.setValueAt(id, selectedRowIndex, 0);
            sourceModel.setValueAt(namaBaru, selectedRowIndex, 1);
            sourceModel.setValueAt(TLBaru, selectedRowIndex, 2);
            sourceModel.setValueAt(noTelpBaru, selectedRowIndex, 3);
            sourceModel.setValueAt(emailBaru, selectedRowIndex, 4);
            sourceModel.setValueAt(poinBaru, selectedRowIndex, 5);
            
            CRUDMember CrudM = new CRUDMember();
            CrudM.update(id, namaBaru, TLBaru, noTelpBaru, emailBaru);
            
            inputIDM.setText("");
            inputNM.setText("");
            inputTL.setText("");
            inputNoTelp.setText("");
            inputEmail.setText("");
            inputPoin.setText("");
        } else {
            // Beri pesan bahwa tidak ada baris yang dipilih
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan diubah", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
        readToTable();
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel sourceModel = (DefaultTableModel) tabelMember.getModel();
        int selectedRowIndex = tabelMember.getSelectedRow();
        
        if (selectedRowIndex != -1) {
            String id = inputIDM.getText();
            String namaBaru = inputNM.getText();
            String TLBaru = inputTL.getText();
            String noTelpBaru = inputNoTelp.getText();
            String emailBaru = inputEmail.getText();
            String poinBaru = inputPoin.getText();
            
            sourceModel.setValueAt(id, selectedRowIndex, 0);
            sourceModel.setValueAt(namaBaru, selectedRowIndex, 1);
            sourceModel.setValueAt(TLBaru, selectedRowIndex, 2);
            sourceModel.setValueAt(noTelpBaru, selectedRowIndex, 3);
            sourceModel.setValueAt(emailBaru, selectedRowIndex, 4);
            sourceModel.setValueAt(poinBaru, selectedRowIndex, 5);
            
            CRUDMember CrudM = new CRUDMember();
            CrudM.delete(id);
            
            inputIDM.setText("");
            inputNM.setText("");
            inputTL.setText("");
            inputNoTelp.setText("");
            inputEmail.setText("");
            inputPoin.setText("");
        } else {
            // Beri pesan bahwa tidak ada baris yang dipilih
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan diubah", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
        readToTable();
    }//GEN-LAST:event_deleteActionPerformed

    private void berandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berandaActionPerformed
        // TODO add your handling code here:
        dispose();
        new homepage().setVisible(true);
    }//GEN-LAST:event_berandaActionPerformed

    private void tabelMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMemberMouseClicked
        // TODO add your handling code here:
        DefaultTableModel sourceModel = (DefaultTableModel) tabelMember.getModel();
        int MyIndex = tabelMember.getSelectedRow();
        String idLama = sourceModel.getValueAt(MyIndex, 0).toString();
        inputIDM.setText(idLama);
        String namaLama = sourceModel.getValueAt(MyIndex, 1).toString();
        inputNM.setText(namaLama);
        String TLLama = sourceModel.getValueAt(MyIndex, 2).toString();
        inputTL.setText(TLLama);
        String notelpLama = sourceModel.getValueAt(MyIndex, 3).toString();
        inputNoTelp.setText(notelpLama);
        String emailLama = sourceModel.getValueAt(MyIndex, 4).toString();
        inputEmail.setText(emailLama);
        String poinLama = sourceModel.getValueAt(MyIndex, 5).toString();
        inputPoin.setText(poinLama);
    }//GEN-LAST:event_tabelMemberMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void member(String args[]) {
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
            java.util.logging.Logger.getLogger(memberpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(memberpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(memberpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(memberpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new memberpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton beranda;
    private javax.swing.JButton delete;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputIDM;
    private javax.swing.JTextField inputNM;
    private javax.swing.JTextField inputNoTelp;
    private javax.swing.JTextField inputPoin;
    private javax.swing.JTextField inputTL;
    private javax.swing.JButton inventori;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JTable tabelMember;
    private javax.swing.JButton transaksi;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
