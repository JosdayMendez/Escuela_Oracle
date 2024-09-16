/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidad.Madre;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author josda
 */
public class MadreDAO {

    private String mensaje = "";

    public String agregarMadre(Connection con, Madre m) throws SQLException {

        String sql = "{CALL SP_Insertar_Madre(?, ?, ?, ?, ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, m.getID_MADRE());
            call.setString(2, m.getNOMBRE_MADRE());
            call.setString(3, m.getAPELLIDO_MADRE1());
            call.setString(4, m.getAPELLIDO_MADRE2());
            call.setString(5, m.getCORREO_MADRE());
            call.setString(6, m.getTELEFONO_CONTACTO());
            call.setInt(7, m.getID_PROVINCIA());

            mensaje = "Agregado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }

        return mensaje;
    }

    public String ModificarMadre(Connection con, Madre m) throws SQLException {

        String sql = "{CALL SP_Actualizar_Madre(?, ?, ?, ?, ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, m.getID_MADRE());
            call.setString(2, m.getNOMBRE_MADRE());
            call.setString(3, m.getAPELLIDO_MADRE1());
            call.setString(4, m.getAPELLIDO_MADRE2());
            call.setString(5, m.getCORREO_MADRE());
            call.setString(6, m.getTELEFONO_CONTACTO());
            call.setInt(7, m.getID_PROVINCIA());

            mensaje = "Actualizado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }
        return mensaje;
    }

    public String eliminarMadre(Connection con, int ID_P) throws SQLException {

        String sql = "{CALL SP_Eliminar_Madre(?)}";

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
