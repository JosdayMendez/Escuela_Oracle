/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.Conexion;
import DAO.EstudianteDAO;
import Entidad.Estudiante;
import java.sql.Connection;

/**
 *
 * @author josda
 */
public class EstudianteBO {

    private String mensaje = "";
    private EstudianteDAO esDAO = new EstudianteDAO();

    public String agregarEstudiante(Estudiante es) {

        Connection conn = Conexion.getConnection();

        try {

            mensaje = esDAO.agregarEstudiante(conn, es);
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

    public String ModificarEstudiante(Estudiante es) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = esDAO.ModificarEstudiante(con, es);
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

    public String eliminarEstudiante(int idEstudiante) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = esDAO.eliminarEstudiante(con, idEstudiante);
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