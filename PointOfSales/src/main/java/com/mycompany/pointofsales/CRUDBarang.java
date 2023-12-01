/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointofsales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author refah
 */
public class CRUDBarang {
    
    public void create(String id_barang, String nama_barang, int harga, int stok){
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String query = "INSERT INTO inventori (id_barang, nama_barang, harga, stok, created_at) VALUES (?, ?, ?, ?, CURRENT_TIMESTAMP)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            
            ps.setString(1, id_barang);
            ps.setString(2, nama_barang);
            ps.setInt(3, harga);
            ps.setInt(4, stok);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data barang berhasil dimasukkan.");
            } else {
                System.out.println("Gagal memasukkan data barang baru.");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    /*
    public DefaultTableModel read(){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID Member");
        tableModel.addColumn("Nama");
        tableModel.addColumn("Tanggal Lahir");
        tableModel.addColumn("No Telepon");
        tableModel.addColumn("Email");
        tableModel.addColumn("Poin");
        tableModel.addColumn("Updated at");
        tableModel.addColumn("Created at");

        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();

            String query = "SELECT * FROM member";

            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Object[] rowData = {
                        resultSet.getInt("id_member"),
                        resultSet.getString("nama_member"),
                        resultSet.getString("tanggal_lahir"),
                        resultSet.getInt("no_telp"),
                        resultSet.getString("email"),
                        resultSet.getInt("poin"),
                        resultSet.getString("created_at"),
                        resultSet.getString("updated_at")
                };
                tableModel.addRow(rowData);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;
    }
    
    public void update(String id_member, String nama_member, String tanggal_lahir, int no_telp, String email) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            
            String updateQuery = "UPDATE member SET nama_member = ?, tanggal_lahir = ?, no_telp = ?, email = ? WHERE id_member = ?";
            PreparedStatement updateStatement = koneksi.prepareStatement(updateQuery);
            updateStatement.setString(1, nama_member);
            updateStatement.setString(2, tanggal_lahir);
            updateStatement.setInt(3, no_telp);
            updateStatement.setString(4, email);
            updateStatement.setString(5, id_member);
            int rowsAffected = updateStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data member berhasil diupdate.");
            } else {
                System.out.println("Gagal mengupdate data member.");
            }   updateStatement.close();
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    public void delete(String id_member) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            
            String deleteQuery = "DELETE FROM member WHERE id_member = ?";
            PreparedStatement deleteStatement = koneksi.prepareStatement(deleteQuery);
            deleteStatement.setString(1, id_member);

            int rowsAffected = deleteStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data anggota berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus data anggota.");
            }

            deleteStatement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    */
}
