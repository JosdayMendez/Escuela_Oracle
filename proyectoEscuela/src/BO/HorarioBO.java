/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.Conexion;
import DAO.HorarioDAO;
import Entidad.Horario;
import java.sql.Connection;


/**
 *
 * @author josda
 */
public class HorarioBO {

    private String mensaje = "";
    private HorarioDAO hoDAO = new HorarioDAO();

    public String agregarHorario(Horario HO) {

        Connection conn = Conexion.getConnection();

        try {

            mensaje = hoDAO.agregarHorario(conn, HO);
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

    public String ModificarHorario(Horario HO) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = hoDAO.ModificarHorario(con, HO);
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

    public String eliminarHorario(int ID_H) {
        Connection con = Conexion.getConnection();

        try {

            mensaje = hoDAO.eliminarHorario(con, ID_H);
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


