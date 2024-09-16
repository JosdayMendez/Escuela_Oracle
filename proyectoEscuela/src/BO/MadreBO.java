/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.Conexion;
import DAO.MadreDAO;
import Entidad.Madre;
import java.sql.Connection;

/**
 *
 * @author josda
 */
public class MadreBO {
    
         private String mensaje = "";
    private MadreDAO esDAO = new MadreDAO();

    public String agregarMadre(Madre m) {

        Connection conn = Conexion.getConnection();

        try {

            mensaje = esDAO.agregarMadre(conn, m);
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

    public String ModificarMadre(Madre m) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = esDAO.ModificarMadre(con, m);
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

    public String eliminarMadre(int idMadre) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = esDAO.eliminarMadre(con, idMadre);
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
