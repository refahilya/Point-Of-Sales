/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pointofsales;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author refah
 */
public class PointOfSales {

    public static void main(String[] args) {
        System.out.println("Ace of Spade!");
        try {
            Koneksi konek = new Koneksi();
            /*buat ngetes koneksi doang
            java.sql.Connection koneksi = konek.open();
            String query = "INSERT INTO admin (username, password) VALUES (?, ?)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            
            ps.setString(1, "ru");
            ps.setString(2, "th");
            
            ps.executeUpdate();
            */
            
            /*buat crud|create inventori
            String query = "INSERT INTO inventori (id_barang, nama_barang, harga, stok, created_at) VALUES (?, ?, ?, ?, CURRENT_TIMESTAMP)";
            ps.setString(1, id_barang);
            ps.setString(2, nama_barang);
            ps.setInt(3, harga);
            ps.setInt(4, stok);
            */
            
            /*buat crud|create member
            String query = "INSERT INTO member (id_member, nama_member, tanggal_lahir, no_telp, email, poin, created_at) VALUES (?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
            ps.setString(1, id_member);
            ps.setString(2, nama_member);
            ps.setString(3, tanggal_lahir);
            ps.setString(4, no_telp);
            ps.setString(3, email);
            ps.setInt(4, poin);
            */
            konek.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
}
