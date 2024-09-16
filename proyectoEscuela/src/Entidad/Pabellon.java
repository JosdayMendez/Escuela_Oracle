/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author josda
 */
public class Pabellon {
    
    String DESCRIPCION;
    int ID_PABELLON;

    public Pabellon() {
    }

    
    public Pabellon(String DESCRIPCION, int ID_PABELLON) {
        this.DESCRIPCION = DESCRIPCION;
        this.ID_PABELLON = ID_PABELLON;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public int getID_PABELLON() {
        return ID_PABELLON;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public void setID_PABELLON(int ID_PABELLON) {
        this.ID_PABELLON = ID_PABELLON;
    }
    
    
}
