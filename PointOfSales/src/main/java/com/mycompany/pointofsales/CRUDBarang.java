/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointofsales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

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
    
    public DefaultTableModel read(){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID Barang");
        tableModel.addColumn("Nama Barang");
        tableModel.addColumn("Harga");
        tableModel.addColumn("Stok");
        tableModel.addColumn("Created at");
        tableModel.addColumn("Updated at");

        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();

            String query = "SELECT * FROM inventori";

            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Object[] rowData = {
                        resultSet.getString("id_barang"),
                        resultSet.getString("nama_barang"),
                        resultSet.getString("harga"),
                        resultSet.getInt("stok"),
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
    
    public void update(String id_barang, String nama_barang, int harga, int stok) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            
            String updateQuery = "UPDATE inventori SET nama_barang = ?, harga = ?, stok = ?, updated_at = CURRENT_TIMESTAMP WHERE id_member = ?";
            PreparedStatement updateStatement = koneksi.prepareStatement(updateQuery);
            updateStatement.setString(1, nama_barang);
            updateStatement.setInt(2, harga);
            updateStatement.setInt(3, stok);
            updateStatement.setString(4, id_barang);
            int rowsAffected = updateStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data barang berhasil diupdate.");
            } else {
                System.out.println("Gagal mengupdate data barang.");
            }   updateStatement.close();
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    public void delete(String id_barang) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            
            String deleteQuery = "DELETE FROM inventori WHERE id_barang = ?";
            PreparedStatement deleteStatement = koneksi.prepareStatement(deleteQuery);
            deleteStatement.setString(1, id_barang);

            int rowsAffected = deleteStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data barang berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus data barang.");
            }

            deleteStatement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
}
