/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author josda
 */
public class Estudiante {

    int ID_ESTUDIANTE;
    String NOMBRE;
    String APELLIDO1;
    String APELLIDO2;
    int ID_PADRE;
    int ID_MADRE;
    int ID_PROVINCIA;

    public Estudiante() {
    }

    public Estudiante(int ID_ESTUDIANTE, String NOMBRE, String APELLIDO1, String APELLIDO2, int ID_PADRE, int ID_MADRE, int ID_PROVINCIA) {
        this.ID_ESTUDIANTE = ID_ESTUDIANTE;
        this.NOMBRE = NOMBRE;
        this.APELLIDO1 = APELLIDO1;
        this.APELLIDO2 = APELLIDO2;
        this.ID_PADRE = ID_PADRE;
        this.ID_MADRE = ID_MADRE;
        this.ID_PROVINCIA = ID_PROVINCIA;
    }

    public void setID_ESTUDIANTE(int ID_ESTUDIANTE) {
        this.ID_ESTUDIANTE = ID_ESTUDIANTE;
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

    public void setID_PADRE(int ID_PADRE) {
        this.ID_PADRE = ID_PADRE;
    }

    public void setID_MADRE(int ID_MADRE) {
        this.ID_MADRE = ID_MADRE;
    }

    public void setID_PROVINCIA(int ID_PROVINCIA) {
        this.ID_PROVINCIA = ID_PROVINCIA;
    }

    public int getID_ESTUDIANTE() {
        return ID_ESTUDIANTE;
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

    public int getID_PADRE() {
        return ID_PADRE;
    }

    public int getID_MADRE() {
        return ID_MADRE;
    }

    public int getID_PROVINCIA() {
        return ID_PROVINCIA;
    }

}
