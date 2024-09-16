/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidad.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;
import java.sql.CallableStatement;

/**
 *
 * @author josda
 */
public class EstudianteDAO {

    private String mensaje = "";

    public String agregarEstudiante(Connection con, Estudiante es) throws SQLException {

        String sql = "{CALL SP_Insertar_Estudiante(?, ?, ?, ?, ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, es.getID_ESTUDIANTE());
            call.setString(2, es.getNOMBRE());
            call.setString(3, es.getAPELLIDO1());
            call.setString(4, es.getAPELLIDO2());
            call.setInt(5, es.getID_PADRE());
            call.setInt(6, es.getID_MADRE());
            call.setInt(7, es.getID_PROVINCIA());

            mensaje = "Agregado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }

        return mensaje;
    }

    public String ModificarEstudiante(Connection con, Estudiante es) throws SQLException {

        String sql = "{CALL SP_Actualizar_Estudiante(?, ?, ?, ?, ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, es.getID_PROVINCIA());
            call.setInt(2, es.getID_ESTUDIANTE());
            call.setString(3, es.getNOMBRE());
            call.setString(4, es.getAPELLIDO1());
            call.setString(5, es.getAPELLIDO2());
            call.setInt(6, es.getID_PADRE());
            call.setInt(7, es.getID_MADRE());

            mensaje = "Actualizado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }
        return mensaje;
    }

    public String eliminarEstudiante(Connection con, int ID_P) throws SQLException {

        String sql = "{CALL SP_Eliminar_Estudiante(?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, ID_P);
            call.execute();
            call.close();
            con.close();

            mensaje = "Eliminado de manera correcta";

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }
        return mensaje;
    }

 

}
