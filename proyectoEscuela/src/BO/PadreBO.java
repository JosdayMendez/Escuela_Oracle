/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.Conexion;
import DAO.PadreDAO;
import Entidad.Padre;
import java.sql.Connection;

/**
 *
 * @author josda
 */
public class PadreBO {
     private String mensaje = "";
    private PadreDAO esDAO = new PadreDAO();

    public String agregarPadre(Padre p) {

        Connection conn = Conexion.getConnection();

        try {

            mensaje = esDAO.agregarPadre(conn, p);
            conn.rollback();

        } catch (Exception e) {

            mensaje = mensaje + " " + e.getMessage();
        } finally {

            try {

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {

                mensaje = mensaje + " " + e.getMessage();
            }

        }
        return mensaje;
    }

    public String ModificarPadre(Padre p) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = esDAO.ModificarPadre(con, p);
            con.rollback();

        } catch (Exception e) {

            mensaje = mensaje + " " + e.getMessage();
        } finally {

            try {

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {

                mensaje = mensaje + " " + e.getMessage();
            }

        }
        return mensaje;

    }

    public String eliminarPadre(int idPadre) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = esDAO.eliminarPadre(con, idPadre);
            con.rollback();

        } catch (Exception e) {

            mensaje = mensaje + " " + e.getMessage();
        } finally {

            try {

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {

                mensaje = mensaje + " " + e.getMessage();
            }

        }
        return mensaje;
    }

   
}
