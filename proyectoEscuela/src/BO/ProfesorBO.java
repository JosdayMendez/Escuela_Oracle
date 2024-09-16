/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.Conexion;
import DAO.ProfesorDAO;
import Entidad.Profesor;
import java.sql.Connection;

/**
 *
 * @author josda
 */
public class ProfesorBO {

    private String mensaje = "";
    private ProfesorDAO profDAO = new ProfesorDAO();

    public String agregarProfesor(Profesor prof) {

        Connection conn = Conexion.getConnection();

        try {

            mensaje = profDAO.agregarProfesor(conn, prof);
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

    public String ModificarProfesor(Profesor prof) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = profDAO.ModificarProfesor(con, prof);
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

    public String eliminarProfesor(int idProfesor) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = profDAO.eliminarProfesor(con, idProfesor);
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
