/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointofsales;

/**
 *
 * @author refah
 */
public class CRUDMember {
    /*
    public void create(String id_member, String nama_member, int tanggal_lahir, int no_telp, String email, int poin){
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            String query = "INSERT INTO member (id_member, nama_member, tanggal_lahir, no_telp, email, poin, created_at) VALUES (?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            
            ps.setString(1, id_member);
            ps.setString(2, nama_member);
            ps.setString(3, tanggal_lahir);
            ps.setString(4, no_telp);
            ps.setString(5, email);
            ps.setString(6, poin);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data anggota berhasil dimasukkan.");
            } else {
                System.out.println("Gagal memasukkan data member baru.");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    public DefaultTableModel read(){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID Anggota");
        tableModel.addColumn("Nama");
        tableModel.addColumn("Jenis Kelamin");
        tableModel.addColumn("Alamat");
        tableModel.addColumn("Email");
        tableModel.addColumn("Created at");
        tableModel.addColumn("Updated at");

        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();

            String query = "SELECT * FROM anggota";

            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Object[] rowData = {
                        resultSet.getInt("id_anggota"),
                        resultSet.getString("nama"),
                        resultSet.getString("jenis_kelamin"),
                        resultSet.getString("alamat"),
                        resultSet.getString("email"),
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

    public void update(String id_member, String nama_member, int tanggal_lahir, int no_telp, String email, int poin) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            
            String updateQuery = "UPDATE anggota SET nama = ?, jenis_kelamin = ?, alamat = ?, email = ? WHERE id_anggota = ?";
            PreparedStatement updateStatement = koneksi.prepareStatement(updateQuery);
            updateStatement.setString(1, namaBaru);
            updateStatement.setString(2, jenis_kelaminBaru);
            updateStatement.setString(3, alamatBaru);
            updateStatement.setString(4, emailBaru);
            updateStatement.setInt(5, id_anggotaBaru);
            int rowsAffected = updateStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data anggota berhasil diupdate.");
            } else {
                System.out.println("Gagal mengupdate data anggota.");
            }   updateStatement.close();
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }

    public void delete(int id_anggota) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            
            String deleteQuery = "DELETE FROM anggota WHERE id_anggota = ?";
            PreparedStatement deleteStatement = koneksi.prepareStatement(deleteQuery);
            deleteStatement.setInt(1, id_anggota);

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
    
    public boolean ida(int id_anggota) throws SQLException {
        Koneksi konek = new Koneksi();
        Connection koneksi = konek.buka();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM anggota WHERE id_anggota = ?";
            preparedStatement = koneksi.prepareStatement(query);
            preparedStatement.setInt(1, id_anggota);

            resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean ida2(int id_anggota) throws SQLException {
        Koneksi konek = new Koneksi();
        Connection koneksi = konek.buka();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM anggota WHERE id_anggota = ?";
            preparedStatement = koneksi.prepareStatement(query);
            preparedStatement.setInt(1, id_anggota);

            resultSet = preparedStatement.executeQuery();

            return resultSet.next();
            
            //belum disuruh delete
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    */
}
