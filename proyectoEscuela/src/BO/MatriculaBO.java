/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.Conexion;
import DAO.MatriculaDAO;
import Entidad.Matricula;
import java.sql.Connection;

/**
 *
 * @author josda
 */
public class MatriculaBO {
    
     private String mensaje = "";
    private MatriculaDAO mDAO = new MatriculaDAO();

    public String agregarMatricula(Matricula m) {

        Connection conn = Conexion.getConnection();

        try {

            mensaje = mDAO.agregarMatricula(conn, m);
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

    public String ModificarMatricula(Matricula m) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = mDAO.ModificarMatricula(con, m);
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

    public String eliminarMatricula(int ID_H) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = mDAO.eliminarMatricula(con, ID_H);
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
