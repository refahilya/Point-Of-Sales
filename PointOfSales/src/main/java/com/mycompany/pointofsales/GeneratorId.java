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
    public String idGenerator(String kolom, String query) {
        String id = "";

        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();

            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                String lastId = resultSet.getString(kolom);
                
                char firstChar = lastId.charAt(0);

                String numericPart = lastId.substring(1);
                int lastIdInt = Integer.parseInt(numericPart);

                if (Character.isLetter(firstChar)) {
                    id = firstChar + String.valueOf(lastIdInt + 1);
                } else {
                    // Ini jane gak perlu soale kan huruf e mesti enek
                    id = 'M' + String.valueOf(lastIdInt + 1);
                }
            } else {
                // Ini jane yo gak perlu soale kan initial id wes enek, dilebokne manual
                id = "M0001";
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id;
    }

}