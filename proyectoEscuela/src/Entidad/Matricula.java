/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author josda
 */
public class Matricula {
    
    int ID_ESTUDIANTE;
    int ID_MATRICULA;
    int PRECIO_MATRICULA;

    public Matricula() {
    }

    public Matricula(int ID_ESTUDIANTE, int ID_MATRICULA, int PRECIO_MATRICULA) {
        this.ID_ESTUDIANTE = ID_ESTUDIANTE;
        this.ID_MATRICULA = ID_MATRICULA;
        this.PRECIO_MATRICULA = PRECIO_MATRICULA;
    }

    public int getID_ESTUDIANTE() {
        return ID_ESTUDIANTE;
    }

    public int getID_MATRICULA() {
        return ID_MATRICULA;
    }

    public int getPRECIO_MATRICULA() {
        return PRECIO_MATRICULA;
    }

    public void setID_ESTUDIANTE(int ID_ESTUDIANTE) {
        this.ID_ESTUDIANTE = ID_ESTUDIANTE;
    }

    public void setID_MATRICULA(int ID_MATRICULA) {
        this.ID_MATRICULA = ID_MATRICULA;
    }

    public void setPRECIO_MATRICULA(int PRECIO_MATRICULA) {
        this.PRECIO_MATRICULA = PRECIO_MATRICULA;
    }
    
    
    
}
