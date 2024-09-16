/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidad.Curso;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author josda
 */
public class CursoDAO {

    private String mensaje = "";

    public String agregarCurso(Connection con, Curso c) throws SQLException {

        String sql = "{CALL SP_Insertar_Curso(?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, c.getID_CURSO());
            call.setString(2, c.getCURSO());
            call.setInt(3, c.getID_PROFESOR());

            mensaje = "Agregado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }

        return mensaje;
    }

    public String ModificarCurso(Connection con, Curso c) throws SQLException {

        String sql = "{CALL SP_Actualizar_Curso( ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, c.getID_CURSO());
            call.setString(2, c.getCURSO());
            call.setInt(3, c.getID_PROFESOR());

            mensaje = "Actualizado de manera correcta";

            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }
        return mensaje;
    }

    public String eliminarCurso(Connection con, int ID_C) throws SQLException {

        String sql = "{CALL SP_Eliminar_Curso(?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, ID_C);
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
