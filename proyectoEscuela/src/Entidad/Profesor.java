/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author josda
 */
public class Profesor {

    String NOMBRE;
    String APELLIDO1;
    String APELLIDO2;
    String CORREO;
    String TELEFONO;
    int ID_PROFESOR;
    int ID_PROVINCIA;

    public Profesor() {
    }

    public Profesor(String NOMBRE, String APELLIDO1, String APELLIDO2, String CORREO, String TELEFONO, int ID_PROFESOR, int ID_PROVINCIA) {
        this.NOMBRE = NOMBRE;
        this.APELLIDO1 = APELLIDO1;
        this.APELLIDO2 = APELLIDO2;
        this.CORREO = CORREO;
        this.TELEFONO = TELEFONO;
        this.ID_PROFESOR = ID_PROFESOR;
        this.ID_PROVINCIA = ID_PROVINCIA;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public void setAPELLIDO1(String APELLIDO1) {
        this.APELLIDO1 = APELLIDO1;
    }

    public void setAPELLIDO2(String APELLIDO2) {
        this.APELLIDO2 = APELLIDO2;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public void setID_PROFESOR(int ID_PROFESOR) {
        this.ID_PROFESOR = ID_PROFESOR;
    }

    public void setID_PROVINCIA(int ID_PROVINCIA) {
        this.ID_PROVINCIA = ID_PROVINCIA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getAPELLIDO1() {
        return APELLIDO1;
    }

    public String getAPELLIDO2() {
        return APELLIDO2;
    }

    public String getCORREO() {
        return CORREO;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public int getID_PROFESOR() {
        return ID_PROFESOR;
    }

    public int getID_PROVINCIA() {
        return ID_PROVINCIA;
    }
    
    
    
}
