/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidad.Horario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josda
 */
public class HorarioDAO {

    private String mensaje = "";

    public String agregarHorario(Connection con, Horario ho) throws SQLException {

        String sql = "{CALL SP_Insertar_Horario(?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, ho.getID_HORARIO());
            call.setString(2, ho.getHORA_INGRESO());
            call.setString(3, ho.getHORA_SALIDA());

            mensaje = "Agregado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }

        return mensaje;
    }

    public String ModificarHorario(Connection con, Horario ho) throws SQLException {

        String sql = "{CALL SP_Actualizar_Horario( ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, ho.getID_HORARIO());
            call.setString(2, ho.getHORA_INGRESO());
            call.setString(3, ho.getHORA_SALIDA());

            mensaje = "Actualizado de manera correcta";

            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }
        return mensaje;
    }

    public String eliminarHorario(Connection con, int ID_H) throws SQLException {

        String sql = "{CALL SP_Eliminar_Horario(?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, ID_H);
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
