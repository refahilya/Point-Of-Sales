/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointofsales;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author refah
 */
public class GeneratorId {
    public int idGenerator() {
        int id_transaksi = 0;

        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            
            Statement statement = koneksi.createStatement();
            String query = "SELECT id_transaksi FROM transaksi ORDER BY id_transaksi DESC LIMIT 1";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                String lastId = resultSet.getString("id_transaksi");
                /*BELOM DIBIKIN YAA*/
            } else {
                id_transaksi = 0 /*BELOM DIBIKIN*/;
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id_transaksi;
    }
}
