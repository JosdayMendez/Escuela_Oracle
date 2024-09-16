/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author josda
 */
public class Conexion {

    private static Connection conn = null;
    private static String url, user, pass;

    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");//Drive
            url = "jdbc:oracle:thin:@//localhost:1521/orcl";
            user = "ADMIN";
            pass = "ROOT";
            conn = DriverManager.getConnection(url, user, pass);
            conn.setAutoCommit(false);
            if (conn != null) {
                System.out.println("Conexion Exitosa");
            } else {
                System.out.println("Conexion Fallida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion Fallida" + e.getMessage());
        }

        return conn;

    }

    public void desconectar() {

        try {

            conn.close();

        } catch (Exception e) {

            System.out.println("No se pudo desconectar" + e.getMessage());
        }
    }
    
     public static void main(String[] args) {
     
      Conexion c = new Conexion();
      c.getConnection();
     }

}
