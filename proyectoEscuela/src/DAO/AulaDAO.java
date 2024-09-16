/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidad.Aula;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author josda
 */
public class AulaDAO {

    private String mensaje = "";

    public String agregarAula(Connection con, Aula a) throws SQLException {

        String sql = "{CALL SP_Insertar_Aula(?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, a.getID_AULA());
            call.setInt(2, a.getCAPACIDAD_AULA());
            call.setInt(3, a.getID_PABELLON());

            mensaje = "Agregado de manera correcta";
            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }

        return mensaje;
    }

    public String ModificarAula(Connection con, Aula a) throws SQLException {

        String sql = "{CALL SP_Actualizar_Aula( ?, ?, ?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, a.getID_AULA());
            call.setInt(2, a.getCAPACIDAD_AULA());
            call.setInt(3, a.getID_PABELLON());

            mensaje = "Actualizado de manera correcta";

            call.execute();
            call.close();
            con.close();

        } catch (SQLException e) {

            mensaje = "No se pudo realizar \n" + e.getMessage();

        }
        return mensaje;
    }

    public String eliminarAula(Connection con, int ID_A) throws SQLException {

        String sql = "{CALL SP_Eliminar_Aula(?)}";

        CallableStatement call = con.prepareCall(sql);

        try {

            call.setInt(1, ID_A);
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
