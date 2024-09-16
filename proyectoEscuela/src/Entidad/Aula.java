/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author josda
 */
public class Aula {
    
    int ID_AULA;
    int CAPACIDAD_AULA;
    int ID_PABELLON;

    public Aula() {
    }

    public Aula(int ID_AULA, int CAPACIDAD_AULA, int ID_PABELLON) {
        this.ID_AULA = ID_AULA;
        this.CAPACIDAD_AULA = CAPACIDAD_AULA;
        this.ID_PABELLON = ID_PABELLON;
    }

    public int getID_AULA() {
        return ID_AULA;
    }

    public int getCAPACIDAD_AULA() {
        return CAPACIDAD_AULA;
    }

    public int getID_PABELLON() {
        return ID_PABELLON;
    }

    public void setID_AULA(int ID_AULA) {
        this.ID_AULA = ID_AULA;
    }

    public void setCAPACIDAD_AULA(int CAPACIDAD_AULA) {
        this.CAPACIDAD_AULA = CAPACIDAD_AULA;
    }

    public void setID_PABELLON(int ID_PABELLON) {
        this.ID_PABELLON = ID_PABELLON;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
    
    
}
