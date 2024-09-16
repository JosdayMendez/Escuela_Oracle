/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.Conexion;
import DAO.CursoDAO;
import Entidad.Curso;
import java.sql.Connection;

/**
 *
 * @author josda
 */
public class CursoBO {

    private String mensaje = "";
    private CursoDAO cDAO = new CursoDAO();

    public String agregarCurso(Curso c) {

        Connection conn = Conexion.getConnection();

        try {

            mensaje = cDAO.agregarCurso(conn, c);
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

    public String ModificarCurso(Curso c) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = cDAO.ModificarCurso(con, c);
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

    public String eliminarCurso(int ID_H) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = cDAO.eliminarCurso(con, ID_H);
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
