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
            loginpage login = new loginpage();
            login.setVisible(true);
            Koneksi konek = new Koneksi();
            konek.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
}
