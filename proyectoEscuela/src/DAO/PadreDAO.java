/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidad.Padre;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author josda
 */
public class PadreDAO {

    private String mensaje = "";

    public String agregarPadre(Connection con, Padre p) throws SQLException {

        String sql = "{CALL SP_Insertar_Padre(?, ?, ?, ?, ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, p.getID_PADRE());
            call.setString(2, p.getNOMBRE_PADRE());
            call.setString(3, p.getAPELLIDO_PADRE1());
            call.setString(4, p.getAPELLIDO_PADRE2());
            call.setString(5, p.getCORREO_PADRE());
            call.setString(6, p.getTELEFONO_CONTACTO());
            call.setInt(7, p.getID_PROVINCIA());

            mensaje = "Agregado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }

        return mensaje;
    }

    public String ModificarPadre(Connection con, Padre p) throws SQLException {

        String sql = "{CALL SP_Actualizar_Padre(?, ?, ?, ?, ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, p.getID_PADRE());
            call.setString(2, p.getNOMBRE_PADRE());
            call.setString(3, p.getAPELLIDO_PADRE1());
            call.setString(4, p.getAPELLIDO_PADRE2());
            call.setString(5, p.getCORREO_PADRE());
            call.setString(6, p.getTELEFONO_CONTACTO());
            call.setInt(7, p.getID_PROVINCIA());

            mensaje = "Actualizado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }
        return mensaje;
    }

    public String eliminarPadre(Connection con, int ID_P) throws SQLException {

        String sql = "{CALL SP_Eliminar_Padre(?)}";

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
