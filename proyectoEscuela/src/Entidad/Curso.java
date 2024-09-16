/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author josda
 */
public class Curso {

    int ID_CURSO;
    String CURSO;
    int ID_PROFESOR;

    public Curso() {
    }

    public Curso(int ID_CURSO, String CURSO, int ID_PROFESOR) {
        this.ID_CURSO = ID_CURSO;
        this.CURSO = CURSO;
        this.ID_PROFESOR = ID_PROFESOR;
    }

    public int getID_CURSO() {
        return ID_CURSO;
    }

    public String getCURSO() {
        return CURSO;
    }

    public int getID_PROFESOR() {
        return ID_PROFESOR;
    }

    public void setID_CURSO(int ID_CURSO) {
        this.ID_CURSO = ID_CURSO;
    }

    public void setCURSO(String CURSO) {
        this.CURSO = CURSO;
    }

    public void setID_PROFESOR(int ID_PROFESOR) {
        this.ID_PROFESOR = ID_PROFESOR;
    }

   
}
