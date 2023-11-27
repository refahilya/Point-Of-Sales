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
            konek.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
}
