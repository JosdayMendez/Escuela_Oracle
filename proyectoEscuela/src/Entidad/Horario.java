/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author josda
 */
public class Horario {
    
    int ID_HORARIO;
    String HORA_INGRESO;
    String HORA_SALIDA;

    public Horario() {
    }

    public Horario(int ID_HORARIO, String HORA_INGRESO, String HORA_SALIDA) {
        this.ID_HORARIO = ID_HORARIO;
        this.HORA_INGRESO = HORA_INGRESO;
        this.HORA_SALIDA = HORA_SALIDA;
    }

    public int getID_HORARIO() {
        return ID_HORARIO;
    }

    public String getHORA_INGRESO() {
        return HORA_INGRESO;
    }

    public String getHORA_SALIDA() {
        return HORA_SALIDA;
    }

    public void setID_HORARIO(int ID_HORARIO) {
        this.ID_HORARIO = ID_HORARIO;
    }

    public void setHORA_INGRESO(String HORA_INGRESO) {
        this.HORA_INGRESO = HORA_INGRESO;
    }

    public void setHORA_SALIDA(String HORA_SALIDA) {
        this.HORA_SALIDA = HORA_SALIDA;
    }
    
    
    
}
