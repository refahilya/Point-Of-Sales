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
        System.out.println("Ace of Spades!");
        try {
            Koneksi konek = new Koneksi();
            /*
            GeneratorId tes = new GeneratorId();
            String kolom = "id_member";
            String query = "SELECT id_member FROM member ORDER BY id_member DESC LIMIT 1";
            System.out.println(tes.idGenerator(kolom, query));
            */
            konek.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
}
