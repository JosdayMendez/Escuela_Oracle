/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.Conexion;
import DAO.AulaDAO;
import Entidad.Aula;
import java.sql.Connection;

/**
 *
 * @author josda
 */
public class AulaBO {

    private String mensaje = "";
    private AulaDAO aDAO = new AulaDAO();

    public String agregarAula(Aula a) {

        Connection conn = Conexion.getConnection();

        try {

            mensaje = aDAO.agregarAula(conn, a);
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

    public String ModificarAula(Aula a) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = aDAO.ModificarAula(con, a);
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

    public String eliminarAula(int ID_A) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = aDAO.eliminarAula(con, ID_A);
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
