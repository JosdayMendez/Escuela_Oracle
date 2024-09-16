/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidad.Profesor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author josda
 */
public class ProfesorDAO {

    private String mensaje = "";

    public String agregarProfesor(Connection con, Profesor prof) throws SQLException {

        String sql = "{CALL SP_Insertar_Profesor(?, ?, ?, ?, ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, prof.getID_PROFESOR());
            call.setString(2, prof.getNOMBRE());
            call.setString(3, prof.getAPELLIDO1());
            call.setString(4, prof.getAPELLIDO2());
            call.setString(5, prof.getCORREO());
            call.setString(6, prof.getTELEFONO());
            call.setInt(7, prof.getID_PROVINCIA());

            mensaje = "Agregado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }

        return mensaje;
    }

    public String ModificarProfesor(Connection con, Profesor prof) throws SQLException {

        String sql = "{CALL SP_Actualizar_Profesor(?, ?, ?, ?, ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, prof.getID_PROFESOR());
            call.setString(2, prof.getNOMBRE());
            call.setString(3, prof.getAPELLIDO1());
            call.setString(4, prof.getAPELLIDO2());
            call.setString(5, prof.getCORREO());
            call.setString(6, prof.getTELEFONO());
            call.setInt(7, prof.getID_PROVINCIA());

            mensaje = "Actualizado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }
        return mensaje;
    }

    public String eliminarProfesor(Connection con, int ID_P) throws SQLException {

        String sql = "{CALL SP_Eliminar_Profesor(?)}";

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
