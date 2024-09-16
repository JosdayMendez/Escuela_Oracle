/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author josda
 */
public class Nota {
    
    int ID_CURSO;
    int ID_ESTUDIANTE;
    int ID_NOTA;
    int ID_TRIMESTRE;
    int NOTA;

    public Nota() {
    }

    public Nota(int ID_CURSO, int ID_ESTUDIANTE, int ID_NOTA, int ID_TRIMESTRE, int NOTA) {
        this.ID_CURSO = ID_CURSO;
        this.ID_ESTUDIANTE = ID_ESTUDIANTE;
        this.ID_NOTA = ID_NOTA;
        this.ID_TRIMESTRE = ID_TRIMESTRE;
        this.NOTA = NOTA;
    }

    public int getID_CURSO() {
        return ID_CURSO;
    }

    public int getID_ESTUDIANTE() {
        return ID_ESTUDIANTE;
    }

    public int getID_NOTA() {
        return ID_NOTA;
    }

    public int getID_TRIMESTRE() {
        return ID_TRIMESTRE;
    }

    public int getNOTA() {
        return NOTA;
    }

    public void setID_CURSO(int ID_CURSO) {
        this.ID_CURSO = ID_CURSO;
    }

    public void setID_ESTUDIANTE(int ID_ESTUDIANTE) {
        this.ID_ESTUDIANTE = ID_ESTUDIANTE;
    }

    public void setID_NOTAL(int ID_NOTA) {
        this.ID_NOTA = ID_NOTA;
    }

    public void setID_TRIMESTRE(int ID_TRIMESTRE) {
        this.ID_TRIMESTRE = ID_TRIMESTRE;
    }

    public void setNOTA(int NOTA) {
        this.NOTA = NOTA;
    }
    
    
}
