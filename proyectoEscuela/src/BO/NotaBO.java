/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.Conexion;
import DAO.NotaDAO;
import Entidad.Nota;
import java.sql.Connection;

/**
 *
 * @author josda
 */
public class NotaBO {
    
     private String mensaje = "";
    private NotaDAO hoDAO = new NotaDAO();

    public String agregarNota(Nota N) {

        Connection conn = Conexion.getConnection();

        try {

            mensaje = hoDAO.agregarNota(conn, N);
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

    public String ModificarNota(Nota N) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = hoDAO.ModificarNota(con, N);
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

    public String eliminarNota(int ID_N) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = hoDAO.eliminarNota(con, ID_N);
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
