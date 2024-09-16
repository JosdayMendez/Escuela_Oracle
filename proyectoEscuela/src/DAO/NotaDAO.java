/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidad.Nota;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author josda
 */
public class NotaDAO {

    private String mensaje = "";

    public String agregarNota(Connection con, Nota n) throws SQLException {

        String sql = "{CALL SP_Insertar_Nota(?, ?, ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(3, n.getID_CURSO());
            call.setInt(5, n.getID_ESTUDIANTE());
            call.setInt(1, n.getID_NOTA());
            call.setInt(4, n.getID_TRIMESTRE());
            call.setInt(2, n.getNOTA());

            mensaje = "Agregado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }

        return mensaje;
    }

    public String ModificarNota(Connection con, Nota n) throws SQLException {

        String sql = "{CALL SP_Actualizar_Nota( ?, ?, ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(3, n.getID_CURSO());
            call.setInt(5, n.getID_ESTUDIANTE());
            call.setInt(1, n.getID_NOTA());
            call.setInt(4, n.getID_TRIMESTRE());
            call.setInt(2, n.getNOTA());

            mensaje = "Actualizado de manera correcta";

            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }
        return mensaje;
    }

    public String eliminarNota(Connection con, int ID_P) throws SQLException {

        String sql = "{CALL SP_Eliminar_Nota(?)}";

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
