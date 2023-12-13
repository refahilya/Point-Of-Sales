/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointofsales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author refah
 */
public class Transaksi {
    
    //INI TO GES SEBENARNYA BUAT YG NYATET DI DB AJA SI
    //SOALNYA ITUNGAN UDAH SEMUA DIKERJAIN DI SOURCE NYA TRANSAKSIPAGE
    //OKEYAHJHJHJHJ
    
    public void catatBarang(String idTrans, String namaBarang, int jumlah, double hargaBarang, double total) {
        GeneratorId generate = new GeneratorId();
        String kolom = "id_detail";
        String queryId = "SELECT id_detail FROM detail_belanjaan ORDER BY id_detail DESC LIMIT 1";
        String idDetail = generate.idGenerator(kolom, queryId);
        
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String query = "INSERT INTO detail_belanjaan (id_detail, id_transaksi, barang, jumlah, harga_satuan, diskon, total_harga) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, idDetail);
            ps.setString(2, idTrans);
            ps.setString(3, namaBarang);
            ps.setInt(4, jumlah);
            ps.setDouble(5, hargaBarang);
            ps.setDouble(6, 0);
            ps.setDouble(7, total);
            ps.executeUpdate();
            ps.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
        
    }
    
    public void hapusBarang(String idDetail) {
        //INI BUAT NGEHAPUS DATA YANG UDAH KEBURU DICATET DI DB PAS LAGI TRANSAKSI
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();

            String query = "DELETE FROM detail_belanjaan WHERE id_detail = ?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, idDetail);
            ps.executeUpdate();
            ps.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    public void hapusBarang(String namaBarang, String currentId) {
        //INI BUAT NGEHAPUS DATA YANG UDAH KEBURU DICATET DI DB PAS LAGI TRANSAKSI
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();

            String query = "DELETE FROM detail_belanjaan WHERE barang = ? AND id_transaksi = ?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, namaBarang);
            ps.setString(2, currentId);
            ps.executeUpdate();
            ps.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    public void catatId(String idTrans) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String query = "INSERT INTO transaksi (id_transaksi) VALUES (?)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, idTrans);
            ps.executeUpdate();
            ps.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    public void catatDuit(String idTrans, double total, double pembayaran, double kembalian) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
             String query = "UPDATE transaksi SET total_transaksi = ?, pembayaran = ?, kembalian = ? WHERE id_transaksi = ?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setDouble(1, total);
            ps.setDouble(2, pembayaran);
            ps.setDouble(3, kembalian);
            ps.setString(4, idTrans);
            ps.executeUpdate();
            ps.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    public void catatKategori(String idTrans, String kategori) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String query = "UPDATE transaksi SET kategori = ? WHERE id_transaksi = ?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, kategori);
            ps.setString(2, idTrans);
            ps.executeUpdate();
            ps.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    public void catatTanggal(String idTrans) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String query = "UPDATE transaksi SET tanggal = CURRENT_TIMESTAMP WHERE id_transaksi = ?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, idTrans);
            ps.executeUpdate();
            ps.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    public void ambilStok(String namaBarang, int jumlah) {
        
        int stok = 0;
        
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();

            String query = "SELECT stok FROM inventori WHERE nama_barang = ?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, namaBarang);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                stok = rs.getInt("stok") - jumlah;
            } else {
                System.out.println("Barang dengan nama " + namaBarang + " tidak ditemukan.");
            }

            rs.close();
            ps.close();
            koneksi.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
        
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String query = "UPDATE inventori SET stok = ? WHERE nama_barang = ?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, stok);
            ps.setString(2, namaBarang);
            ps.executeUpdate();
            ps.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
}
