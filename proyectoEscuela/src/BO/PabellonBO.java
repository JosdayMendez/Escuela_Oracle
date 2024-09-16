/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.Conexion;
import DAO.PabellonDAO;
import Entidad.Pabellon;
import java.sql.Connection;

/**
 *
 * @author josda
 */
public class PabellonBO {

    private String mensaje = "";
    private PabellonDAO pbBDAO = new PabellonDAO();

    public String agregarPabellon(Pabellon pb) {

        Connection conn = Conexion.getConnection();

        try {

            mensaje = pbBDAO.agregarPabellon(conn, pb);
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

    public String ModificarPabellon(Pabellon pb) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = pbBDAO.ModificarPabellon(con, pb);
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

    public String eliminarPabellon(int ID_P) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = pbBDAO.eliminarPabellon(con, ID_P);
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
