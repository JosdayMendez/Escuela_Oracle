/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidad.Matricula;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author josda
 */
public class MatriculaDAO {

    private String mensaje = "";

    public String agregarMatricula(Connection con, Matricula m) throws SQLException {

        String sql = "{CALL SP_Insertar_Matricula(?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(3, m.getID_ESTUDIANTE());
            call.setInt(1, m.getID_MATRICULA());
            call.setInt(2, m.getPRECIO_MATRICULA());

            mensaje = "Agregado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }

        return mensaje;
    }

    public String ModificarMatricula(Connection con, Matricula m) throws SQLException {

        String sql = "{CALL SP_Actualizar_Matricula( ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

             call.setInt(3, m.getID_ESTUDIANTE());
            call.setInt(1, m.getID_MATRICULA());
            call.setInt(2, m.getPRECIO_MATRICULA());

            mensaje = "Actualizado de manera correcta";

            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }
        return mensaje;
    }

    public String eliminarMatricula(Connection con, int ID_P) throws SQLException {

        String sql = "{CALL SP_Eliminar_Matricula(?)}";

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
